package com.example.bookAPI.model;
import java.time.LocalDateTime;
import java.util.List;
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
@Document(collection = "books")
public class Book implements CustomId {
    @Id
    private String id;
    private String name;
    private String author;
    private String isbn;
    private String description;
    private Double price;
    private int stockQuantity;
    private int discountPercent;
    @CreatedDate
    private LocalDateTime createAt; 
    @LastModifiedDate
    private LocalDateTime updateAt;
    private String categoryId;  
    private String supplierId;
    private List<BookImage> images;
}