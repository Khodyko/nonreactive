package com.example.nonreactive.controller;

import com.example.nonreactive.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
public interface BookController {

    @ResponseStatus(code = HttpStatus.OK)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Book saveBook(@RequestBody Book book);

    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/{id}")
    Book getBookById(@PathVariable Long id);

    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/all")
    List<Book> getAllBooks();
}
