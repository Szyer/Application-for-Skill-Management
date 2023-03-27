package com.assessment.employee.EmployeeController;


import com.assessment.employee.DTO.EmployeeSaveDTO;

import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Service.EmployeeService;
import com.assessment.employee.Service.SkillService;
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
    private SkillService skillService;
    @PostMapping(path="/save")
    public String saveCustomer(@RequestBody EmployeeSaveDTO employeeSaveDTO){
        String id = employeeService.saveEmployee(employeeSaveDTO);
        return id;
    }

    @PostMapping(path="/skill/save")
    public String saveCustomer(@RequestBody SkillSaveDTO skillSaveDTO){
        String id = skillService.saveSkill(skillSaveDTO);
        return id;
    }

}
