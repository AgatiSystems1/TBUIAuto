package com.tb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.PasswordSecurityQuestion;
import com.tb.qa.pages.PasswordSecurityQuestionListPage;
import com.tb.qa.pages.ProjectListPage;
import com.tb.qa.pages.UsersAddPage;

public class PasswordSecurityQuestionTest extends TestBase {
	
	PasswordSecurityQuestion passwordSecurityQuestion;
	PasswordSecurityQuestionListPage passwordSecurityQuestionListPage=new PasswordSecurityQuestionListPage();
	UsersAddPage userAddPage;
	@BeforeMethod
	public void setup() {
	
		passwordSecurityQuestion=new PasswordSecurityQuestion();
	}
	
	@Test
	public void cancelPasswordSecurityQuestionPage() throws InterruptedException {
		passwordSecurityQuestion.cancelQuestionPage();	
	}

	@Test()
	public void clearPasswordSecurityQuestionPage() throws InterruptedException {
		
	   passwordSecurityQuestion.clearQuestionPage("Who is your favourit hero?");
	
		
	}
	
	@Test()
	public void createPasswordSecurityQuestionPage() throws InterruptedException {
		
		passwordSecurityQuestion.createQuestionPage("Who is your favorit hero?");
		System.out.println("PSQAdd");
	}
}
	




