package com.example.bookAPI.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="carts")
public class Cart implements CustomId{
    @Id
    private String id;
    private String userId;
    private Double sum;
    private List<CartItem> cartItems;
}
