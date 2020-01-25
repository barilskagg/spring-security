package org.example.controllers;

import org.example.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("error")
    public String getErrorPage() {
        return "<h1>Error Page</h1>";
    }
}
