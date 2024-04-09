package co.istad.mbakingapi.features.transaction.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record TransactionCreateRequest(
        @NotBlank(message = "Account number is required")
        String ownerActNo,
        @NotBlank(message = "Tranfer is required")
        String transferReceiverActNo,
        @NotNull(message = "Amount is required")
        BigDecimal amount,
        String remark
) {
}
