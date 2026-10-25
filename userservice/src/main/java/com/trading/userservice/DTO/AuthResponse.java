package com.trading.userservice.DTO;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class AuthResponse {
    private String userId;
    private String email;

    private String firstName;

    private String lastName;

    private BigDecimal walletBalance;
    private String token;
    private String refString;
    private String tokenType="Bearer";

}
