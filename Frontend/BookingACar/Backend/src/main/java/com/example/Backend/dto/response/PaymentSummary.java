package com.example.Backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentSummary {
    private BigDecimal amount;
    private Long paymentId;
    private String transactionCode;
    private String status;
    private String reason;
}
