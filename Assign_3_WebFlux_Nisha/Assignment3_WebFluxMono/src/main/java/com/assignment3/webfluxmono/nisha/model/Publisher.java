package com.assignment3.webfluxmono.nisha.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Publisher {
	

    @Id
    private String pubId;
    private String name;
    private String address;

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String id) {
        this.pubId = id;
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

}
