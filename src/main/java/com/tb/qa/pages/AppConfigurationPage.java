package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class AppConfigurationPage extends TestBase {
	
//	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/div[1]/header/ul/li[1]/div")
//	WebElement User_icon;
	
//	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div/ul/li[1]/a")
//	WebElement AppConfig_btn;
	//*[@id="root"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/button
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
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[2]")
	WebElement Clear_btn;
	
	public AppConfigurationPage () {
		PageFactory.initElements(driver, this);
	}
	
	public AppConfigurationPage cancelAppConfigCreate() throws InterruptedException {
//		User_icon.click();
//		Thread.sleep(2000);
//		AppConfig_btn.click();
//		Thread.sleep(2000);
		CreateAppConfig_btn.click();
		Thread.sleep(2000);
		CancelAppConfigCreate_btn.click();
		Thread.sleep(2000);
		CreateAppConfig_btn.click();
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_TermName(String TermName_td) {
		TermName_txt.sendKeys(TermName_td);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_TermCode(String TermCode_td) {
		TermCode_txt.sendKeys(TermCode_td);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_ShortValue(String ShortValue_td) {
		ShortValue_txt.sendKeys(ShortValue_td);
		return new AppConfigurationPage();
	}
	
	public AppConfigurationPage create_LongValue(String LongValue_td) {
		LongValue_txt.sendKeys(LongValue_td);
		Status_drop.click();
		return new AppConfigurationPage();
	}
	public AppConfigurationPage clearValues() {
		Clear_btn.click();
		return new AppConfigurationPage();
	}
	
	

}
