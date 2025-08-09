package com.example.bookAPI.model;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "roles")
public class Role implements CustomId {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    @CreatedDate
    private LocalDateTime createAt; 
    @LastModifiedDate
    private LocalDateTime updateAt;
}
