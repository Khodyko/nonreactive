package com.example.nonreactive.controller.impl;

import com.example.nonreactive.controller.BookController;
import com.example.nonreactive.entity.Book;
import com.example.nonreactive.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookControllerImpl implements BookController {

    private final BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) throws InterruptedException {
        Long a=0L;
        for (int i = 0; i < 600000; i++) {
                a++;
        }
//        System.out.println(a);
//        System.out.println(id);
        return bookRepository.findAllBookWithDelayById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
}
