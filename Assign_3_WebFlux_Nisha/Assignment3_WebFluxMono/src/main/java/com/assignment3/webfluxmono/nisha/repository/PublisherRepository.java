package com.assignment3.webfluxmono.nisha.repository;

import com.assignment3.webfluxmono.nisha.model.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {
}