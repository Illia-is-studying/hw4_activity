package com.example.hw4_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hw4_activity.Models.Article;
import com.example.hw4_activity.Services.ArticleService;

import java.time.format.DateTimeFormatter;

public class WholeArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_whole_article);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        Article article = ArticleService.getArticleByTitle(title);

        String publishingDate = "Publishing date: " +
                article.getPublicationDate()
                        .format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm"));

        TextView textView = findViewById(R.id.article_title);
        textView.setText(title);

        textView = findViewById(R.id.article_date);
        textView.setText(publishingDate);

        textView = findViewById(R.id.article_content);
        textView.setText(article.getContent());
    }
}