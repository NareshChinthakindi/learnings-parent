package com.rohinisha.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private String name;
    private BigDecimal salary;
}
