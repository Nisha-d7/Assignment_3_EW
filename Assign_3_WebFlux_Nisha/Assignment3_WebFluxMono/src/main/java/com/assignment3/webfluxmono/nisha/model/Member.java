package com.assignment3.webfluxmono.nisha.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Member {
	
    @Id
    private String membId;
    private String name;
    private String address;
    private String membType;
    private LocalDate membDate;
    private LocalDate expiryDate;

    public String getMembId() {
        return membId;
    }

    public void setMembId(String id) {
        this.membId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public String getMembType() {
        return membType;
    }

    public void setMembType(String type) {
        this.membType = type;
    }

    public LocalDate getMembDate() {
        return membDate;
    }

    public void setMembDate(LocalDate date) {
        this.membDate = date;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate date) {
        this.expiryDate = date;
    }

}
