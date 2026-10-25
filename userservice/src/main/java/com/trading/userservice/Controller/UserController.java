package com.trading.userservice.Controller;

import java.math.BigDecimal;

import org.springframework.boot.micrometer.observation.autoconfigure.ObservationProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trading.userservice.DTO.AuthResponse;
import com.trading.userservice.DTO.UserResponse;
import com.trading.userservice.DTO.registerrequest;
import com.trading.userservice.Entity.userservice;

import io.micrometer.core.ipc.http.HttpSender.Response;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController 
@RequestMapping ("/api/v1/users")
@Slf4j 
@AllArgsConstructor 
public class UserController {
    private final userservice userservice;
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody registerrequest request) {
       return ResponseEntity.ok(HttpStatus.CREATED)
       .body(userservice.register(request));

    }
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody registerrequest request) {
        return ResponseEntity.ok(userservice.login(request));
    }
    @GetMapping("/profile")
    public ResponseEntity<UserResponse> getMyProfile(@RequestHeader ("userid") String userid) {
        return ResponseEntity.ok(HttpStatus.OK)
        .body(userservice.getUserById(userid));
    }
    @GetMapping("/{userid}")
    public ResponseEntity<UserResponse> getUserId(@PathVariable String userid) {
        return ResponseEntity.ok(HttpStatus.OK)
        .body(userservice.getUserById(userid));
    }
    @PostMapping("/{userid}/funds/add")
    public ResponseEntity<UserResponse> addFunds(@PathVariable String userid, @RequestParam BigDecimal amount) {
        return ResponseEntity.ok(HttpStatus.OK)
        .body(userservice.addFunds(userid, amount));
    }
    @PostMapping("/{userid}/funds/deduct")
    public ResponseEntity<UserResponse> deductFunds(@PathVariable String userid, @RequestParam BigDecimal amount) {
        return ResponseEntity.ok(HttpStatus.OK)
        .body(userservice.deductFunds(userid, amount));
    }
    @PostMapping("/{userid}/funds/credit")
    public ResponseEntity<UserResponse> creditFunds(@PathVariable String userid, @RequestParam BigDecimal amount) {
        
        return ResponseEntity.ok(HttpStatus.OK)
        .body(userservice.creditFunds(userid, amount));
    }
    

    
}


