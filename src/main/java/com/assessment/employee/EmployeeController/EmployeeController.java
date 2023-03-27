package com.assessment.employee.EmployeeController;


import com.assessment.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
@SpringBootApplication
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
}
