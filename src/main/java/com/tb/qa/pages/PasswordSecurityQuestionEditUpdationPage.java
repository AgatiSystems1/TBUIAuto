package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PasswordSecurityQuestionEditUpdationPage extends TestBase {
	PasswordSecurityEditPage passwordSecurityEditPage;
	PasswordSecurityQuestionEditUpdationPage passwordSecurityQuestionEditUpdationPage;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[2]")
	WebElement SaveEditQuestion_btn;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")
	WebElement CancelUpdateSecurityQuestion_btn;
	
	@FindBy(xpath="//*[@id=\"Change Reason\"]")
	WebElement ChangeReason_txt;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	WebElement ConfirmSecurityQuestion_btn;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement DoneUpdation_btn;
	
	public PasswordSecurityQuestionEditUpdationPage() {
		PageFactory.initElements(driver, this);
	}
	public PasswordSecurityQuestionListPage UpdateSecurityQuestion(String EnterReason_td) throws InterruptedException {
		CancelUpdateSecurityQuestion_btn.click();
		Thread.sleep(2000);
		SaveEditQuestion_btn.click();
		Thread.sleep(2000);
		ChangeReason_txt.sendKeys(EnterReason_td);
		Thread.sleep(2000);
		ConfirmSecurityQuestion_btn.click();
		Thread.sleep(2000);
		DoneUpdation_btn.click();
		
		
		return new PasswordSecurityQuestionListPage();
		// TODO Auto-generated method stub
		
	}

}
