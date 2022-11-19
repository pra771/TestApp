package com.example.loginandregister;

public class RegisterRequest {
   // String username;
    String email;
    String password;

    public String getUsername() {
        return email;
    }
/*
    public void setUsername(String username) {
        this.username = username;
    }

 */

    public String getEmailaddress() {
        return email;
    }

    public void setEmailaddress(String emailaddress) {
        this.email = emailaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
