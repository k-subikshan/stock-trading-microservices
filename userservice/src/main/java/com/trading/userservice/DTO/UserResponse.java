package com.trading.userservice.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.trading.userservice.Entity.userstatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@AllArgsConstructor 
@NoArgsConstructor 

public class UserResponse {
    private String userId;
    private String email;

    private String firstName;

    private String lastName;

    private BigDecimal walletBalance;

    private userstatus status;
    private LocalDateTime   createdAt;

}
