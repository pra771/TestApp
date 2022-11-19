package com.example.loginuser.Models;

import java.io.Serializable;

public class LoginuserDetiles implements Serializable {
   private  boolean error;
   private String message;

    public LoginuserDetiles(boolean error, String message) {
        this.error = error;
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
