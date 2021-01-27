package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PasswordSecurityDeletePage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/span/span/input")
	WebElement SearchSecurityQuestion_txt;
	
	@FindBy(xpath="//*[@id=\"Content\"]/div/div/div[2]/table/tbody/tr/td[3]/div/button[2]")
	WebElement DeleteQuestion_btn;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")
	WebElement CancelDeleteReason_btn;
	
	@FindBy(xpath="//*[@id=\"Change Reason\"]")
	WebElement UpdateDeleteReason_txt;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	WebElement ConfirmDeleteReason_btn;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement DoneDeletion_btn;
	

	
	public PasswordSecurityDeletePage() {
		PageFactory.initElements(driver, this);
	}
	
	public  PasswordSecurityQuestionListPage SearchSecurityQuestion(String searchQuestion_td) throws InterruptedException {
	    SearchSecurityQuestion_txt.sendKeys(searchQuestion_td);
		Thread.sleep(2000);
		return new PasswordSecurityQuestionListPage();
	}


	public  PasswordSecurityQuestionListPage DeleteSecurityQuestion(String DeleteQuestion_td) throws InterruptedException {
	
		DeleteQuestion_btn.click();
		Thread.sleep(2000);
//		CancelDeleteReason_btn.click();
//		Thread.sleep(2000);
//		DeleteQuestion_btn.click();
//		SearchSecurityQuestion(DeleteQuestion_td);
		UpdateDeleteReason_txt.sendKeys(DeleteQuestion_td);
		Thread.sleep(2000);
		ConfirmDeleteReason_btn.click();
		Thread.sleep(2000);
		DoneDeletion_btn.click();
		
		return new PasswordSecurityQuestionListPage();
	}




	}


