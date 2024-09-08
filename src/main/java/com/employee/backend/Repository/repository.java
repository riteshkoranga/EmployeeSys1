package com.employee.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.backend.model.Emp;

public interface repository extends JpaRepository<Emp, Integer> {

}
