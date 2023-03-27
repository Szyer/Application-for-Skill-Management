package com.assessment.employee.EmployeeController;


import com.assessment.employee.DTO.EmployeeSaveDTO;

import com.assessment.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
@SpringBootApplication
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO){
        String id = employeeService.saveEmployee(employeeSaveDTO);
        return id;
    }



}
