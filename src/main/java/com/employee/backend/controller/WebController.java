package com.employee.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value = "/{path:[^\\.]*}")
    public String forwardReactRoutes() {
        return "forward:/index.html";
    }

}
