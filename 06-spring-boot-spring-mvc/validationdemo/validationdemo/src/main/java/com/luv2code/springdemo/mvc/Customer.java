package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    //we have coded this to handle defaults so we will not add the attributes here
    @CourseCode(value="TOPS",message="must start with TOPS")
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    private String courseCode;

    private String firstName;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    @Pattern(regexp= "^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
    private String postalCode;

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    @NotNull(message="is required")
    @Min(value=0,message="must be greater than or equal to zero")
    @Max(value=10,message="must be less than or equal to 10")
    private Integer freePasses;

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

    @NotNull(message="is required")
    @Size(min=1,message="is required")
    private String lastName;
}
