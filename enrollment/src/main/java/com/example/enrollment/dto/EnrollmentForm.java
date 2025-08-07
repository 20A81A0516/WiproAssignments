package com.example.enrollment.dto;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.util.List;

public class EnrollmentForm {
    
    @Size(min = 3, max = 30, message = "{firstName.size}")
    @NotBlank(message = "{firstName.blank}")
    private String firstName;
    
    @Size(min = 3, max = 30, message = "{lastName.size}")
    @NotBlank(message = "{lastName.blank}")
    private String lastName;
    
    @NotNull(message = "{sex.null}")
    private String sex;
    
    @NotNull(message = "{dob.null}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    
    @Email(message = "{email.invalid}")
    @NotBlank(message = "{email.blank}")
    private String email;
    
    @NotNull(message = "{section.null}")
    private String section;
    
    @NotNull(message = "{country.null}")
    private String country;
    
    private Boolean firstAttempt;
    
    @Size(min = 1, message = "{subjects.size}")
    private List<String> subjects;

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
    
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }
    
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    
    public Boolean getFirstAttempt() { return firstAttempt; }
    public void setFirstAttempt(Boolean firstAttempt) { this.firstAttempt = firstAttempt; }
    
    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }
}