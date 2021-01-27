package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.PasswordSecurityDeletePage;
import com.tb.qa.pages.PasswordSecurityEditPage;
import com.tb.qa.pages.PasswordSecurityQuestion;
import com.tb.qa.pages.PasswordSecurityQuestionListPage;
import com.tb.qa.util.MouseActionUtil;

public class PasswordSecurityDeletePageTest extends TestBase{
PasswordSecurityQuestionListPage passwordSecurityQuestionListPage;
	
	PasswordSecurityDeletePage passwordSecurityDeletePage;
	MouseActionUtil mouse = new MouseActionUtil();
	
	@BeforeMethod
	public void setup() {
	
		passwordSecurityDeletePage=new PasswordSecurityDeletePage();
	}


	
	
	@Test(priority=1)
	public void SearchPasswordSecurityQuestion() throws InterruptedException {
		passwordSecurityQuestionListPage.SearchSecurityQuestion("What is your First name?");
	}
	
	
	@Test(priority=2)
	public void DeletePasswordSecurityQuestion() throws InterruptedException {
		passwordSecurityDeletePage.DeleteSecurityQuestion("This security Question is not suit");
	}


}
