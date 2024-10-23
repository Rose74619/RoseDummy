package com.example.example.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {
    private Long id;
    @Size(min = 3,max=200,message = "Please enter your name above 2 letters")
    private String name;
    @Email(message = "Enter valid email address")
    private String email;
    private String phone;
    private String message;

}