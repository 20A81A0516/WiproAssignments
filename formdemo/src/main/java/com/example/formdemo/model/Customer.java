package com.example.formdemo.model;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

public class Customer {

    public Customer() {} // No-argument constructor

    @NotBlank(message = "{customer.name.required}")
    @Size(min = 2, max = 30, message = "{customer.name.size}")
    private String name;

    @NotBlank(message = "{customer.email.required}")
    @Email(message = "{customer.email.invalid}")
    private String email;

    @NotNull(message = "{customer.age.required}")
    @Min(value = 1, message = "{customer.age.min}")
    @Max(value = 120, message = "{customer.age.max}")
    private Integer age;

    @NotBlank(message = "{customer.gender.required}")
    private String gender;

    @NotNull(message = "{customer.birthday.required}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private java.time.LocalDate birthday;

    @NotBlank(message = "{customer.phone.required}")
    @Pattern(
            regexp = "(\\d{10}|\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4})(\\s*x\\d{1,4})?",
            message = "{customer.phone.invalid}"
    )
    private String phone;

    // GETTERS and SETTERS for each field
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public java.time.LocalDate getBirthday() { return birthday; }
    public void setBirthday(java.time.LocalDate birthday) { this.birthday = birthday; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}

