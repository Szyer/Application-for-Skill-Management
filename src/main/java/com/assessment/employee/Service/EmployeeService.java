package com.assessment.employee.Service;

import com.assessment.employee.DTO.EmployeeDTO;
import com.assessment.employee.DTO.EmployeeSaveDTO;
import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    String saveEmployee(EmployeeSaveDTO employeeSaveDTO);

    List<EmployeeDTO> getAllEmployees();




}
