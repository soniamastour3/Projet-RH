package com.rh.projectRH.service;

import com.rh.projectRH.dao.EmployeeDao;
import com.rh.projectRH.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee){
        return employeeDao.save(employee);
    }
}
