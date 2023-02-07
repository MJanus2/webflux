package com.mjanus.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class BookDto {
    private final String title;
    private final String author;
    private final int year;

    public static List<BookDto> generateRandomBooks(){
        BookDto book1 = new BookDto("Harry Potter", "Rowling", 2002);
        BookDto book2 = new BookDto("Chemia Śmierci", "Simon Becket", 2012);
        BookDto book3 = new BookDto("Władca Pierścieni", "Tolkien", 1950);
        return List.of(book1, book2, book3);
    }
}