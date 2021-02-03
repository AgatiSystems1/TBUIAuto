package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PasswordSecurityQuestion extends TestBase {
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[1]")
	WebElement Cancel_btn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/button")
	WebElement AddQuestion_btn;
	
	@FindBy(id="QuestionText")
	WebElement Question_txt;
	
	@FindBy(xpath="//*[@id=\"StatusID\"]/div/div")
	WebElement Active_field;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[2]")
	WebElement Clear_btn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[3]")
	WebElement Add_btn;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement AlertOk_btn;
	
	public PasswordSecurityQuestion() {
		PageFactory.initElements(driver, this);
	}
	
	public PasswordSecurityQuestionListPage cancelQuestionPage() throws InterruptedException {
		AddQuestion_btn.click();
		Thread.sleep(3000);
		Cancel_btn.click();
		Thread.sleep(3000);
		AddQuestion_btn.click();
        return new PasswordSecurityQuestionListPage();
	}

	public void clearQuestionPage(String Question_td) throws InterruptedException {
		Question_txt.sendKeys(Question_td);
		Thread.sleep(2000);
		Active_field.click();;
		Thread.sleep(2000);
		Clear_btn.click();
//		System.out.println(Question_td +"\t"+ "Active");		
//		Add_btn.click();
//		Thread.sleep(5000);
//		AlertOk_btn.click();
////		String expectedUrl="http://172.16.1.246:8032/trans/project";
////		String actualUrl=driver.getCurrentUrl();
////		Assert.assertEquals(actualUrl, expectedUrl);
//		System.out.println("Password Security success");
		
}
	public PasswordSecurityQuestionListPage createQuestionPage(String Question_td) throws InterruptedException {
		Question_txt.sendKeys(Question_td);
		Thread.sleep(2000);
		Active_field.click();;
		Thread.sleep(2000);
		
//		System.out.println(Question_td +"\t"+ "Active");		
		Add_btn.click();
		Thread.sleep(2000);
		AlertOk_btn.click();
//		String expectedUrl="http://172.16.1.246:8032/trans/project";
//		String actualUrl=driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Password Security success");
		return new PasswordSecurityQuestionListPage();
}
}
