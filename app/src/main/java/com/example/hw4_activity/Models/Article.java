package com.example.hw4_activity.Models;

import java.time.LocalDateTime;

public class Article {
    private String title;
    private String content;
    private LocalDateTime publicationDate;

    public Article(String title, String content, LocalDateTime publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }
}
