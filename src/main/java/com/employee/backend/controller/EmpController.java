package com.employee.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/Emp")
public class EmpController {

    @GetMapping("/")
    public String test() {
        return "hello ritesh";
    }

}
