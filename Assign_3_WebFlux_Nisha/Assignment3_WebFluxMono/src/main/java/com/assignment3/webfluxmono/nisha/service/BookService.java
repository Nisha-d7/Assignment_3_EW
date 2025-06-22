package com.assignment3.webfluxmono.nisha.service;

import com.assignment3.webfluxmono.nisha.model.Book;
import com.assignment3.webfluxmono.nisha.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BookService {
	 @Autowired
    private BookRepository bookRepo;

    public Mono<Book> addBook(Book book) {
        return bookRepo.save(book);
    }

    public Flux<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
