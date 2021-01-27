package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.PasswordSecurityQuestion;
import com.tb.qa.pages.PasswordSecurityQuestionListPage;







public class PasswordSecurityQuestionListPageTest extends TestBase {
	PasswordSecurityQuestionListPage passwordSecurityQuestionListPage;
	
	PasswordSecurityQuestion passwordSecurityQuestion;
	
	
	@BeforeMethod
	public void setup() {
	
		passwordSecurityQuestionListPage=new PasswordSecurityQuestionListPage();
	}

	
	@Test
	public void SearchPasswordSecurityQuestion() throws InterruptedException {
		passwordSecurityQuestionListPage.SearchSecurityQuestion("Enter is your First Name?");
	}
	
	
	
	

}
