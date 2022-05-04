package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Филип", "Дик");
        Author author2 = new Author("Роберт", "Хайнлайн");
        Book book1 = new Book("Убик", author1,1969 );
        Book book2 = new Book("Чужак в чужой стране", author2, 1961);

        book2.setPublisherYear(1963);
        System.out.println(book2.getPublisherYear());
        System.out.println(book1);
        System.out.println(author2);

        Author author1_1 = new Author("Филип", "Дик");
        Author author2_2 = new Author("Роберт", "Хайнлайн");
        Book book1_1 = new Book("Убик", author1,1969 );
        Book book2_2 = new Book("Чужак в чужой стране", author2, 1961);

        System.out.println("Книги одинаковы? " + book1.equals(book1_1));
        System.out.println("Книги одинаковы? " + book2.equals(book2_2));
        System.out.println("Авторы одинаковы? " + author1.equals(author1_1));
        System.out.println(book1.hashCode());
        System.out.println(book1_1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book2_2.hashCode());


        }
    }
