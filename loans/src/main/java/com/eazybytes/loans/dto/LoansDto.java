package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class LoansDto {

    @NotEmpty(message = "Mobile number should not be empty")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile number should be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "4365327698"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan number should not be empty")
    @Pattern(regexp = "[0-9]{12}", message = "Loan number should be 12 digits")
    @Schema(
            description = "Loan Number of Customer", example = "548732457654"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan type should not be empty")
    @Schema(
            description = "Loan Type of Customer", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero")
    @Schema(
            description = "Total loan amount", example = "100000"
    )
    private Integer totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    @Schema(
            description = "Total loan amount paid", example = "1000"
    )
    private Integer amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    @Schema(
            description = "Total outstanding amount against a loan", example = "99000"
    )
    private Integer outstandingAmount;


}
