package com.masse.valentin.ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    private String id;
    private String reference;
    private Date created_at;

    @DBRef
    private List<Delivery> deliveries;

    @DBRef
    private User user;
}
