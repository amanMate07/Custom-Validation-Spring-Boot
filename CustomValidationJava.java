package com.get.request;

import javax.validation.constraints.NotNull;

import com.get.customValidator.ContactNumberConstraint;

public class CustomValidationJava {

	@NotNull
	@ContactNumberConstraint
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
