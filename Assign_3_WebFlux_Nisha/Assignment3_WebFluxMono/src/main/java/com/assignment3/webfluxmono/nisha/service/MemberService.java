package com.assignment3.webfluxmono.nisha.service;

import com.assignment3.webfluxmono.nisha.model.Member;
import com.assignment3.webfluxmono.nisha.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MemberService {
	 @Autowired
    private MemberRepository memberRepo;

    public Mono<Member> addMember(Member member) {
        return memberRepo.save(member);
    }

    public Flux<Member> getAllMembers() {
        return memberRepo.findAll();
    }
}