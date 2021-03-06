package com.masse.valentin.ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    private String id;
    private int number;
    private String street;
    private String zipcode;
    private String city;
    private String country;

    @DBRef
    private User user;

    @DBRef
    private List<Delivery> deliveries;
}
