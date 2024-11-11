package com.example.hw4_activity.Services;

import com.example.hw4_activity.Models.Article;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArticleService {
    private final static ArrayList<Article> articles;

    static {
        articles = new ArrayList<>();

        articles.add(new Article("Java Basics",
                "An introduction to Java programming.",
                LocalDateTime.of(2023, 1, 10, 10, 30)));
        articles.add(new Article("Streams API Guide",
                "Understanding Java Streams API.",
                LocalDateTime.of(2023, 3, 5, 15, 45)));
        articles.add(new Article("Effective Java",
                "Tips for writing effective Java code.",
                LocalDateTime.of(2023, 6, 15, 9, 0)));
        articles.add(new Article("Concurrency in Java",
                "Exploring concurrency and multithreading.",
                LocalDateTime.of(2023, 9, 20, 14, 20)));
        articles.add(new Article("Modern Java Features",
                "An overview of features introduced in Java 8 and beyond.",
                LocalDateTime.of(2023, 11, 5, 18, 15)));
    }

    public static ArrayList<Article> getArticles() {
        return articles;
    }

    public static Article getArticleByTitle(String title) {
        List<Article> articlesBuff = articles.stream()
                .filter(article -> article.getTitle()
                        .equals(title)).collect(Collectors.toList());

        return articlesBuff.get(0);
    }
}
