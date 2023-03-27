package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;

public class SkillSaveDTO {
    private Long skillId;

    private String skillName;

    private String proficiencyLevel;

    private Employee employee;

    public SkillSaveDTO(String skillName, String proficiencyLevel, Employee employee) {

        this.skillName = skillName;
        this.proficiencyLevel = proficiencyLevel;
        this.employee = employee;
    }

    public SkillSaveDTO(){}

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "SkillSaveDTO{" +
                "skillName='" + skillName + '\'' +
                ", proficiencyLevel='" + proficiencyLevel + '\'' +
                ", employee=" + employee +
                '}';
    }
}
