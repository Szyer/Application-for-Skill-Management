package com.assessment.employee.DTO;

public class EmployeeDTO {
    private Long employee_id;


    private String name;

    private String email;

    private String phone_number;

    private String job_title;

    private double salary;

    private double productivity_score;

    private double quality_of_work_score;

    private double attendance_score;

    public EmployeeDTO(String name, String email, String phoneNumber, String jobTitle, double salary, double productivityScore, double productivity_score, double attendanceScore){}

    public EmployeeDTO(Long employee_id, String name, String email, String phone_number, String job_title, double salary, double productivity_score, double quality_of_work_score, double attendance_score) {
        this.employee_id = employee_id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.job_title = job_title;
        this.salary = salary;
        this.productivity_score = productivity_score;
        this.quality_of_work_score = quality_of_work_score;
        this.attendance_score = attendance_score;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getProductivity_score() {
        return productivity_score;
    }

    public void setProductivity_score(double productivity_score) {
        this.productivity_score = productivity_score;
    }

    public double getQuality_of_work_score() {
        return quality_of_work_score;
    }

    public void setQuality_of_work_score(double quality_of_work_score) {
        this.quality_of_work_score = quality_of_work_score;
    }

    public double getAttendance_score() {
        return attendance_score;
    }

    public void setAttendance_score(double attendance_score) {
        this.attendance_score = attendance_score;
    }
}
