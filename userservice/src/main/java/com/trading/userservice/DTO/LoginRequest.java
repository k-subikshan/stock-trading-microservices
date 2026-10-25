package com.trading.userservice.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class LoginRequest {
    @NotBlank (message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank (message = "Password is mandatory")
    @Size (min = 6, message = "Password must be at least 6 characters long")
    private String password;

}
