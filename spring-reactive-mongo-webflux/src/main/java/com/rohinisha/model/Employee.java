package com.rohinisha.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
@ToString
public class Employee {
    @Id
    private String id;
    private String firstname;
    private String lastname;
}
