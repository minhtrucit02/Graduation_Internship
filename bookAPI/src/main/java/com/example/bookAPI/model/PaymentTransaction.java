package com.example.bookAPI.model;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "payment_transactions")
public class PaymentTransaction implements CustomId {
     @Id
    private String id;
    private String orderId;
    private String vnpTxnRef;
    private Double vnpAmount;
    private String vnpResponseCode;
    private String vnpTransactionStatus;
    private String vnpBankCode;
    private String vnpBankTransactionNo;
    private LocalDateTime vnpPayDate;
    private LocalDateTime createdAt;
    private String status;
    private String message;
}
