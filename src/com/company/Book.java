package com.company;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publisherYear;

    public Book(String name, Author author, int publisherYear){
        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public int getPublisherYear(){
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public String toString(){
        return "Имя автора: " + author + " Название книги: " + name + " Год публикации: " + publisherYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publisherYear);
    }
}