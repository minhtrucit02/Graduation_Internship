package com.example.bookAPI.model;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor  
@Document(collection = "users")
public class User implements CustomId {
    @Id
    private String id;
    private String userName;
    @Indexed(unique = true)
    private String email;
    private String password;
    private Boolean isActive;
    @CreatedDate 
    private LocalDateTime createAt; 
    @LastModifiedDate
    private LocalDateTime updateAt;
    private String roleId;   

}
