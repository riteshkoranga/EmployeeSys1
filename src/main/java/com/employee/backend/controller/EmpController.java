package com.employee.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.backend.Service.service;
import com.employee.backend.model.Emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/Emp")
public class EmpController {
    @Autowired
    private service s;

    @PostMapping("/save")
    public ResponseEntity<Emp> createEmp(@RequestBody Emp emp) {

        return new ResponseEntity<>(s.createEmp(emp), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Emp>> getAllEmp() {
        System.out.println("inside main mapping");
        return new ResponseEntity<>(s.getAllEmp(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emp> getEmpById(@PathVariable int id) {
        return new ResponseEntity<>(s.getEmpById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable int id) {
        s.deleteEmp(id);
        return new ResponseEntity<>("Deleted succesfully", HttpStatus.OK);
    }

    // update the database
    @PutMapping("/{id}")
    public ResponseEntity<Emp> updateEmp(@PathVariable int id, @RequestBody Emp emp) {

        return new ResponseEntity<>(s.updateEmp(id, emp), HttpStatus.OK);
    }

}
