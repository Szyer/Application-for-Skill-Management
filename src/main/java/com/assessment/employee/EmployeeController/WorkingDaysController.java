package com.assessment.employee.EmployeeController;

import com.assessment.employee.DTO.EmployeeSaveDTO;
import com.assessment.employee.DTO.WorkingDaysDTO;
import com.assessment.employee.Service.EmployeeService;
import com.assessment.employee.Service.WorkingDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/workingdays")
@SpringBootApplication

public class WorkingDaysController {

    @Autowired
    private WorkingDaysService workingDaysService;

    @PostMapping(path="/save")
    public int saveEmployee(@RequestBody WorkingDaysDTO workingDaysDTO){
        int id = workingDaysService.saveWorkingDays(workingDaysDTO);
        return id;
    }

}
