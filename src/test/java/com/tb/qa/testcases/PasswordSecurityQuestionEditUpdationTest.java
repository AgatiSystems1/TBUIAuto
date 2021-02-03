package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.PasswordSecurityEditPage;
import com.tb.qa.pages.PasswordSecurityQuestionEditUpdationPage;

public class PasswordSecurityQuestionEditUpdationTest extends TestBase{
	PasswordSecurityQuestionEditUpdationPage passwordSecurityQuestionEditUpdationPage;
	

	@BeforeMethod
	public void setup() {
	
		passwordSecurityQuestionEditUpdationPage=new PasswordSecurityQuestionEditUpdationPage();
	}
	
	@Test
	public void UpdatePasswordSecurityQuestion() throws InterruptedException {
		passwordSecurityQuestionEditUpdationPage.UpdateSecurityQuestion("Its nice know");
		
	}

}
