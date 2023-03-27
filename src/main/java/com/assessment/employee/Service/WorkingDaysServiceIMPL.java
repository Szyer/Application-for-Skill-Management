package com.assessment.employee.Service;

import com.assessment.employee.DTO.WorkingDaysDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.WorkingDays;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.WorkingDaysRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class WorkingDaysServiceIMPL implements WorkingDaysService{
    @Autowired
    private WorkingDaysRepo workingDaysRepo;

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public int saveWorkingDays(WorkingDaysDTO workingDaysDTO) {
        Optional<Employee> employee = employeeRepo.findById(workingDaysDTO.getEmployee().getEmployee_id());
        WorkingDays workingDays = new WorkingDays(
                workingDaysDTO.getTotalWorkingDays(),
                employee.get()
        );
        workingDaysRepo.save(workingDays);
        return workingDays.getTotalWorkingDays();
    }
}
