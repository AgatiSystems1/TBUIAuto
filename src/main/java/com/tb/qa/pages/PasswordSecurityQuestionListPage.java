package com.tb.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.tb.qa.base.TestBase;



public class PasswordSecurityQuestionListPage extends TestBase{
	PasswordSecurityQuestionListPage passwordSecurityQuestionListPage;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/span/span/input")
	WebElement SearchSecurityQuestion_txt;

	public PasswordSecurityQuestionListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  PasswordSecurityQuestionListPage SearchSecurityQuestion(String searchQuestion_td) throws InterruptedException {
		SearchSecurityQuestion_txt.sendKeys(searchQuestion_td);
		Thread.sleep(2000);
		return new PasswordSecurityQuestionListPage();
	}








}

