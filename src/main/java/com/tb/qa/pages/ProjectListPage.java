package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class ProjectListPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/div[1]/header/ul/li[1]/div/i")
	WebElement User_icon;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div/ul/li[1]/a")
	WebElement AppConfig_btn;
//	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div/ul/li[2]/a")
//	WebElement SecurityQuestion_btn;
	
//	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/div[1]/header/ul/li[4]/div/div/img")
//	WebElement Logout_icon;
//	
//	@FindBy(name="Logout")
//	WebElement Logout_btn;
//	
	
	
	public ProjectListPage() {
		PageFactory.initElements(driver,this);
	}
	
	public AppConfigurationPage createAppConfigure() throws InterruptedException {
		User_icon.click();
		Thread.sleep(5000);
		AppConfig_btn.click();
//		SecurityQuestion_btn.click();
		Thread.sleep(5000);
//		Logout_icon.click();
//		Thread.sleep(5000);
//		Logout_btn.click();
		return new AppConfigurationPage();
	}

}
