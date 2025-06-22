package com.assignment3.webfluxmono.nisha.repository;

import com.assignment3.webfluxmono.nisha.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}

