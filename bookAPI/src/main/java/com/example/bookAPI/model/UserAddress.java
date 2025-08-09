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
@Document(collection = "user_addresses")
public class UserAddress implements CustomId {
    @Id
    private String id;
    private String userId; 
    private String address;
    private String recipientName;
    private String phone;
    private Boolean isDefault;
    @CreatedDate  
    private LocalDateTime createAt; 
    @LastModifiedDate
    private LocalDateTime updateAt;
   



   


}
