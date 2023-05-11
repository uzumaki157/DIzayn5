package com.example.dizayn5;

public class ArticleModel {

    int image;
    String title,author,day;

    public ArticleModel(int image, String title, String author, String day) {
        this.image = image;
        this.title = title;
        this.author = author;
        this.day = day;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
