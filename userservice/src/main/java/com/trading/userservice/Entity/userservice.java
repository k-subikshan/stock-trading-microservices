package com.trading.userservice.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userservice {
    @Id 
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String userId;
    @Email 
    @Column (unique = true, nullable = false)
    private String email;
    @Column (nullable = false)
    private String password;
    @Column (nullable = false)
    private String firstName;
    @Column (nullable = false)
    private String lastName;
    @Column (nullable = false,precision = 15, scale = 2)
    private BigDecimal walletBalance=BigDecimal.ZERO;
    @Enumerated (EnumType.STRING)
    private userstatus status=userstatus.ACTIVE;
    @CreationTimestamp 
    private LocalDateTime   createdAt=LocalDateTime.now();

}