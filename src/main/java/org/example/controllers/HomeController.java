package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String getHomePage() {
        return "<h1>Welcome!</h1>";
    }

    @GetMapping("admins")
    public String getAdmin() {
        return "<h1>Welcome Admin</h1>";
    }

    @GetMapping("users")
    public String getUser() {
        return "<h1>Welcome User</h1>";
    }
}
