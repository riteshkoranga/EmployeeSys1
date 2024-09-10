package com.employee.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WebController {

    @GetMapping("/")
    public String forwardReactRoutes() {
        return "forward:/index.html";
    }

}
