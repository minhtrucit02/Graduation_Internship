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
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "categories")

public class Category implements CustomId {
    @Id
    private String id;
    private String name;
    @CreatedDate
    private LocalDateTime createAt; 
    @LastModifiedDate
    private LocalDateTime updateAt;
    
 
}
