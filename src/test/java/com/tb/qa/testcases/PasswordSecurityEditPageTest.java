package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.PasswordSecurityEditPage;
import com.tb.qa.pages.PasswordSecurityQuestion;
import com.tb.qa.pages.PasswordSecurityQuestionListPage;
import com.tb.qa.util.MouseActionUtil;

public class PasswordSecurityEditPageTest extends TestBase{
PasswordSecurityQuestionListPage passwordSecurityQuestionListPage;

	PasswordSecurityEditPage passwordSecurityEditPage;
	
	
	@BeforeMethod
	public void setup() {
	
		passwordSecurityEditPage=new PasswordSecurityEditPage();
	}


	

	@Test
	public void EditPasswordSecurityQuestion() throws InterruptedException {
		passwordSecurityEditPage.EditSecurityQuestion("what is your First name?");
	}
	
//	@Test
//	public void UpdatePasswordSecurityQuestion() throws InterruptedException {
//		passwordSecurityEditPage.UpdateSecurityQuestion("Its nice know");
//		
//	}
	

}
