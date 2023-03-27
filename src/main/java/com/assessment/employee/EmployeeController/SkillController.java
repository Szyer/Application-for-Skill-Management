package com.assessment.employee.EmployeeController;

import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/skill")
@SpringBootApplication
public class SkillController {
    @Autowired
    private SkillService skillService;
    @PostMapping(path="/save")
    public String saveSkill(@RequestBody SkillSaveDTO skillSaveDTO){
        String id = skillService.saveSkill(skillSaveDTO);
        return id;
    }
}
