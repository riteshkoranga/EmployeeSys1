package com.employee.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String forwardReactRoutes() {
        return "forward:/index.html";
    }

}
