package com.employee.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data

public class Emp {
    @Id

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private double salary;

}
