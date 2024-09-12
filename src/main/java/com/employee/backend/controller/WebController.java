package com.employee.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "https://employee-sys12-4b4a2f10c5a1.herokuapp.com")
@Controller
public class WebController {

    @GetMapping(value = "/**/{[emp:[^\\.]*}")
    public String forwardReactRoutes() {
        return "forward:/index.html";
    }

}
