package com.janmajaya.spring.MVC;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.janmajaya.spring.MVC.validation.CourseCode;

public class Customer {
	private String firstName;

	@NotNull(message = "is Required")
	@Size(min = 1, message = "is Required")
	private String lastName;

	@NotNull(message = "is Required")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be less than or equal to 10")
	private Integer freePass;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 character")
	private String postalCode;

	@CourseCode(value = "LUV", message = "course code should start with LUV")
	private int courseCode;

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

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

}
