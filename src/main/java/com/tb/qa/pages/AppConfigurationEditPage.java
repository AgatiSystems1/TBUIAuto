package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class AppConfigurationEditPage extends TestBase {
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/span/span/input")
	WebElement SearchAppConfig_txt;
	
	@FindBy(xpath="//*[@id=\"Content\"]/div/div/div[2]/table/tbody/tr[3]/td[6]/div/button[1]")
	WebElement EditAppConfig_btn;
	
	@FindBy(xpath="//*[@id=\"TermName\"]")
	WebElement TermName_txt;
	
	@FindBy(xpath="//*[@id=\"LongValue\"]")
	WebElement LongValue_txt;
	
	@FindBy(xpath="//*[@id=\"StatusID\"]/div/div")
	WebElement Status_drop;
	
	@FindBy(xpath="//*[@id=\"845d6b56-96c0-474d-963b-74fbe5582767\"]/ul/li[2]")
	WebElement InActive_drop;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[2]")
	WebElement Save_btn;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")
	WebElement Cancel_EditReasonPage_btn;
	
	@FindBy(xpath="//*[@id=\"Change Reason\"]")
	WebElement Update_EditPage;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	WebElement Confirm_btn;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement Ok_btn;
	
	public AppConfigurationEditPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AppConfigurationPage EditAppConfiguration(String SearchTermName_td) throws InterruptedException {
		SearchAppConfig_txt.sendKeys(SearchTermName_td);
		Thread.sleep(2000);
		EditAppConfig_btn.click();
		return new AppConfigurationPage();
		
		
	}
	
	public AppConfigurationPage Edit_TermName(String EditTermName_td ) throws InterruptedException {
		TermName_txt.clear();
		Thread.sleep(2000);
		TermName_txt.sendKeys(EditTermName_td);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage Edit_LongValue(String EditLongValue_td ) throws InterruptedException {
		LongValue_txt.clear();
		Thread.sleep(2000);
		LongValue_txt.sendKeys(EditLongValue_td);
		Thread.sleep(2000);
		Save_btn.click();
		return new AppConfigurationPage();
	}
	
//	public AppConfigurationPage Edit_Status() throws InterruptedException {
//		Status_drop.click();
//		Thread.sleep(2000);
//		InActive_drop.click();
//		Thread.sleep(2000);
//		Save_btn.click();
//		Thread.sleep(2000);
//		return new AppConfigurationPage();
//	}
	
	public AppConfigurationPage UpdateAppConfiguration_Edit(String Edit_Reason) throws InterruptedException {
		Cancel_EditReasonPage_btn.click();
		Thread.sleep(2000);
		Save_btn.click();
		Thread.sleep(2000);
		Update_EditPage.sendKeys(Edit_Reason);
		Thread.sleep(2000);
		Confirm_btn.click();
		Thread.sleep(2000);
		Ok_btn.click();
		return new AppConfigurationPage();
		
	}

}
