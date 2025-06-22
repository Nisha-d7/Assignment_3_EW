package com.assignment3.webfluxmono.nisha.repository;

import com.assignment3.webfluxmono.nisha.model.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends ReactiveMongoRepository<Member, String> {
}