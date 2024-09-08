package com.employee.backend.Service;

import java.util.List;

import com.employee.backend.model.Emp;

public interface service {
    public Emp createEmp(Emp emp);

    public List<Emp> getAllEmp();

    public Emp getEmpById(int id);

    public void deleteEmp(int id);

    public Emp updateEmp(int id, Emp emp);

}
