package com.seleniumexpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "* Your name cannot be blank")
	//@Size(min = 3, max = 15, message = "* Your name should have characters between 3 and 15")
	@Size(min = 3, max = 15, message = "{userName.size}")
	private String userName;
	
	@NotBlank(message = "* Crush name cannot be blank")
	@Size(min = 3, max = 15, message = "* Crush name should have characters between 3 and 15")
	private String crushName;
	
	@AssertTrue(message = "* You have to agree to terms and conditions to use our app")
	private boolean termsAndConditions;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}
	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	

}
