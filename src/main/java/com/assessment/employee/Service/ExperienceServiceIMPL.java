package com.assessment.employee.Service;

import com.assessment.employee.DTO.ExperienceSaveDTO;
import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Experience;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.ExperienceRepo;
import com.assessment.employee.Repositories.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienceServiceIMPL implements ExperienceService{
    @Autowired
    private ExperienceRepo experienceRepo;

    @Autowired
    private EmployeeRepo employeeRepo;



    @Override
    public String saveExperience(ExperienceSaveDTO experienceSaveDTO) {
        Optional<Employee> employee = employeeRepo.findById(experienceSaveDTO.getEmployee().getEmployee_id());
        Experience experience = new Experience(
                employee.get(),
                experienceSaveDTO.getJobTitle(),
                experienceSaveDTO.getRating()
                );
        experienceRepo.save(experience);
        return experience.getJobTitle();
    }
}
