package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class AppConfigurationAddPage extends TestBase {
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/button")
	WebElement CreateAppConfig_btn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[1]")
	WebElement CancelAppConfigCreate_btn;
	
	@FindBy(xpath="//*[@id=\"TermName\"]")
	WebElement TermName_txt;
	
	@FindBy(xpath="//*[@id=\"TermCode\"]")
	WebElement TermCode_txt;
	
	@FindBy(xpath="//*[@id=\"ShortValue\"]")
	WebElement ShortValue_txt;
	
	@FindBy(xpath="//*[@id=\"LongValue\"]")
	WebElement LongValue_txt;
	
	@FindBy(xpath="//*[@id=\"StatusID\"]/div/div")
	WebElement Status_drop;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[3]")
	WebElement Add_btn;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement Ok_btn;
	public AppConfigurationAddPage () {
		PageFactory.initElements(driver, this);
	}
	
//	public AppConfigurationPage cancelAppConfigCreate() throws InterruptedException {
//
//		CreateAppConfig_btn.click();
//		Thread.sleep(2000);
//		CancelAppConfigCreate_btn.click();
//		Thread.sleep(2000);
//		CreateAppConfig_btn.click();
//		return new AppConfigurationPage();
//	}
	
	public AppConfigurationPage create_TermName(String TermName_td) throws InterruptedException {
		TermName_txt.sendKeys(TermName_td);
		Thread.sleep(2000);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_TermCode(String TermCode_td) throws InterruptedException {
		TermCode_txt.sendKeys(TermCode_td);
		Thread.sleep(2000);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_ShortValue(String ShortValue_td) throws InterruptedException {
		ShortValue_txt.sendKeys(ShortValue_td);
		Thread.sleep(2000);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_LongValue(String LongValue_td) throws InterruptedException {
		LongValue_txt.sendKeys(LongValue_td);
		Thread.sleep(2000);
		Status_drop.click();
		return new AppConfigurationPage();
	}
	public AppConfigurationPage AddAppConfiguration() throws InterruptedException {
		Add_btn.click();
		Thread.sleep(2000);
		Ok_btn.click();
		return new AppConfigurationPage();
	}
	

}
