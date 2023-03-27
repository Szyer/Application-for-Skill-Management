package com.assessment.employee.EmployeeController;

import com.assessment.employee.DTO.ExperienceSaveDTO;
import com.assessment.employee.DTO.WorkingDaysDTO;
import com.assessment.employee.Service.ExperienceService;
import com.assessment.employee.Service.WorkingDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/experience")
@SpringBootApplication
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @PostMapping(path="/save")
    public String saveEmployee(@RequestBody ExperienceSaveDTO experienceSaveDTO){
        String id = experienceService.saveExperience(experienceSaveDTO);
        return id;
    }

}

