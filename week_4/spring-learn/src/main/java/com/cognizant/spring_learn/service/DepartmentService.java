package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.dao.DepartmentDao;
import com.cognizant.spring_learn.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao;

    public DepartmentService() {
        this.departmentDao = new DepartmentDao();
    }

    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}
