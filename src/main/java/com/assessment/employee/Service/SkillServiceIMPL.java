package com.assessment.employee.Service;

import com.assessment.employee.DTO.EmployeeSaveDTO;
import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class SkillServiceIMPL implements SkillService{
    @Autowired
    private SkillRepo skillRepo;

    @Override
    public String saveSkill(SkillSaveDTO skillSaveDTO) {
        Employee employee = EmployeeRepo.findById(skillSaveDTO.getEmployee())
            Skill skill = new Skill(
                skillSaveDTO.getSkillName(),
                skillSaveDTO.getProficiencyLevel(),
                skillSaveDTO.getEmployee()
            );
            skillRepo.save(skill);
            return skill.getSkillName();
        }
    }

