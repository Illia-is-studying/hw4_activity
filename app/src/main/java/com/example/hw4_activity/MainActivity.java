package com.example.hw4_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hw4_activity.Models.Article;
import com.example.hw4_activity.Services.ArticleService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        List<Article> articles = ArticleService.getArticles();

        Button button = findViewById(R.id.button1);
        button.setText(articles.get(0).getTitle());

        button = findViewById(R.id.button2);
        button.setText(articles.get(1).getTitle());

        button = findViewById(R.id.button3);
        button.setText(articles.get(2).getTitle());

        button = findViewById(R.id.button4);
        button.setText(articles.get(3).getTitle());
    }

    public void goToArticle(View view) {
        Button button = (Button) view;
        String title = button.getText().toString();

        Intent intent = new Intent(MainActivity.this, WholeArticleActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}