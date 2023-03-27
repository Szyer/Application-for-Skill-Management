package com.assessment.employee.Entities;


import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name="experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private Long experienceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)

    private Employee employee;


    @Column(name = "job_title")
    private String jobTitle;

    @Column(name ="rating")
    private float rating;

    Experience(){}
    public Experience(Employee employee, String jobTitle, float rating) {
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
