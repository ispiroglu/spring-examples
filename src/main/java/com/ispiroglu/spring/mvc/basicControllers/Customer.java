package com.ispiroglu.spring.mvc.basicControllers;

import com.ispiroglu.spring.mvc.validation.CourseCode;

import javax.validation.constraints.*;


public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 2, message = "is required")
    private String lastName;

    @CourseCode // We're using the default values
    private String courseCode;


    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be greater than or equal to zero")
    @Max(value = 10, message = "Must be lower than or equal to ten")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
