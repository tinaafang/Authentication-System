package com.example.recipewebsite.dto;

import com.example.recipewebsite.security.EmailValidation;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class UserDto
{
    @NotEmpty(message = "Username should not be empty")
    private String userName;
    @EmailValidation
    private String email;
    @NotEmpty(message = "Password should not be empty")
    private String password;

    @NotEmpty(message = "Username should not be empty")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
