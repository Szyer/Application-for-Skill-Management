package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;

public class ExperienceSaveDTO {

    private Long experienceId;

    private Employee employee;

    private String jobTitle;

    private float rating;

    ExperienceSaveDTO(){}
    public ExperienceSaveDTO(Long experienceId, Employee employee, String jobTitle, float rating) {
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

    @Override
    public String toString() {
        return "ExperienceSaveDTO{" +
                "employee=" + employee +
                ", jobTitle='" + jobTitle + '\'' +
                ", rating=" + rating +
                '}';
    }
}
