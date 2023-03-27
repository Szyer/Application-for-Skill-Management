package com.assessment.employee.Service;

import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Skill;

import java.util.List;

public interface SkillService {
    String saveSkill(SkillSaveDTO skillSaveDTO);

}
