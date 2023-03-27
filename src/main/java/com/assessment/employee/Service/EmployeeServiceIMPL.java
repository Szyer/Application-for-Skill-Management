package com.assessment.employee.Service;


import com.assessment.employee.DTO.EmployeeDTO;
import com.assessment.employee.DTO.EmployeeSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;


    @Override
    public String saveEmployee(EmployeeSaveDTO employeeSaveDTO) {
        Employee employee = new Employee(
                employeeSaveDTO.getName(),
                employeeSaveDTO.getEmail(),
                employeeSaveDTO.getPhone_number(),
                employeeSaveDTO.getJob_title(),
                employeeSaveDTO.getSalary(),
                employeeSaveDTO.getProductivity_score(),
                employeeSaveDTO.getQuality_of_work_score(),
                employeeSaveDTO.getAttendance_score()
        );
        employeeRepository.save(employee);
        return employee.getName();
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> getEmployee = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (Employee a : getEmployee) {
            EmployeeDTO employeeDTO = new EmployeeDTO(
                   a.getName(),
                   a.getEmail(),
                    a.getPhone_number(),
                   a.getJob_title(),
                    a.getSalary(),
                    a.getProductivity_score(),
                    a.getProductivity_score(),
                    a.getAttendance_score()


            );
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

}

