package com.sdet;

import java.util.ResourceBundle;

public class App {
    public int userLogin(String in_name, String in_password) {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String username = rb.getString("username");
        String password = rb.getString("password");

        if (in_name.equals(username) && in_password.equals(password)) {
            return 1;
        } else {
            return 0;
        }
    }
}
