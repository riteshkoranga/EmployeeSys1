package com.employee.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.backend.Repository.repository;
import com.employee.backend.model.Emp;

//annotate @service in serviceimpl  class it throws bean not found error
@Service
public class serviceimpl implements service {
    @Autowired
    private repository repo;

    @Override
    public Emp createEmp(Emp emp) {

        return repo.save(emp);

    }

    @Override
    public List<Emp> getAllEmp() {
        return repo.findAll();

    }

    @Override
    public Emp getEmpById(int id) {
        return repo.findById(id).get();

    }

    @Override
    public void deleteEmp(int id) {
        Emp emp = repo.findById(id).get();
        if (emp != null) {
            repo.delete(emp);
        }

    }

    @Override
    public Emp updateEmp(int id, Emp emp) {
        Emp oldEmp = repo.findById(id).get();
        if (oldEmp != null) {
            emp.setId(id);
            return repo.save(emp);
        }

        return null;

    }

}
