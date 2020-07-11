/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.RedditApp.controller;

import com.itech.RedditApp.DTO.AuthenticationResponse;
import com.itech.RedditApp.DTO.LoginRequest;
import com.itech.RedditApp.DTO.RegisterRequest;
import com.itech.RedditApp.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value="/signup", consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful", 
                 HttpStatus.OK);
    }
    
    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }  

    
        @GetMapping("accountVerification/{token}")
public ResponseEntity<String> verifyAccount(@PathVariable String token) {
authService.verifyAccount(token);
return new ResponseEntity<>("Account Activated Successully", HttpStatus.OK);
}
}
