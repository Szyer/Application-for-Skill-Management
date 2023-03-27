package com.assessment.employee.Service;


import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillServiceIMPL implements SkillService{
    @Autowired
    private SkillRepo skillRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String saveSkill(SkillSaveDTO skillSaveDTO) {
            Optional<Employee> employee = employeeRepo.findById(skillSaveDTO.getEmployee().getEmployee_id());
            Skill skill = new Skill(
                    skillSaveDTO.getSkillName(),
                    skillSaveDTO.getProficiencyLevel(),
                    employee.get()
            );
            skillRepo.save(skill);
            return skill.getSkillName();
        }
    }

