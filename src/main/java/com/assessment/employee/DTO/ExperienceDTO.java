package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;
import jakarta.persistence.*;

public class ExperienceDTO {

    private Long experienceId;

    private Employee employee;

    private String jobTitle;

    private float rating;

    ExperienceDTO(){}
    public ExperienceDTO(Long experienceId, Employee employee, String jobTitle, float rating) {
        this.experienceId = experienceId;
        this.employee = employee;
        this.jobTitle = jobTitle;
        this.rating = rating;
    }

    public Long getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Long experienceId) {
        this.experienceId = experienceId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
