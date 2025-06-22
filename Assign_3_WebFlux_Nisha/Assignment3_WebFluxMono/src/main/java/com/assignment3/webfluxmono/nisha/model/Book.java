package com.assignment3.webfluxmono.nisha.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	
    @Id
    private String bookId;

    private String title;
    private String author;
    private double price;
    private boolean available;
    private String publisherId;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String id) {
        this.bookId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean avail) {
        this.available = avail;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String pubId) {
        this.publisherId = pubId;
    }
	

}
