package com.example.bookAPI.model;

import java.time.LocalDateTime;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "orders")
public class Order implements CustomId  {
    @Id
    private String id;
    private String userId;
    private String addressId;
    private Integer status;
    @CreatedDate
    private LocalDateTime orderDate;
    private Boolean paymentStatus;
    private String paymentMethod;
    private Double totalAmount;
    @LastModifiedDate
    private LocalDateTime updatedAt;

}
