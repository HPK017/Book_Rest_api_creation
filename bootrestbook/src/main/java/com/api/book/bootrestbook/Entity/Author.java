package com.api.book.bootrestbook.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;

    @Column(name = "first_name")
    private String firstName;

    private String language;

    private Book book;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Author(int authorId, String firstName, String language) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.language = language;
    }

    

    public Author() {
    }

    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstName=" + firstName + ", language=" + language + "]";
    }

    
}
