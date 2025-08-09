package com.example.bookAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private String bookId;
    private String name;
    private Double price;
    private Integer quantity;
    private Double subtotal;
}