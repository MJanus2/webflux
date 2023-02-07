package com.mjanus.webflux.controller;

import com.mjanus.webflux.model.BookDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class BookController {

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<BookDto> getStrings() {
        List<BookDto> randomBooks = BookDto.generateRandomBooks();
        return Flux
                .just(randomBooks.get(0), randomBooks.get(1), randomBooks.get(2))
                .log();
    }
}