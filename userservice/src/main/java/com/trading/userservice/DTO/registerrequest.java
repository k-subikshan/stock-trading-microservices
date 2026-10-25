package com.trading.userservice.DTO;

import java.math.BigDecimal;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class registerrequest {
    @NotBlank (message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank (message = "Password is mandatory")   
    @Size (min = 6, message = "Password must be at least 6 characters long")
    private String password;
    @NotBlank (message = "First name is mandatory")
    private String firstName;
    @NotBlank (message = "Last name is mandatory")
    private String lastName;
    private BigDecimal InitialDeposit=BigDecimal.valueOf(10000);
}
