package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class AppConfigurationListPage extends TestBase {
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div/div[1]/span/span/input")
	WebElement SearchAppConfig_txt;
	
	@FindBy(xpath="//*[@id=\"Content\"]/div/div/div[2]/table/tbody/tr[2]/td[6]/div/button[2]")
	WebElement DeleteAppConfig_btn;
	
	@FindBy(xpath="//*[@id=\"Change Reason\"]")
	WebElement DeleteReason_txt;
	
	@FindBy(xpath="/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]")
	WebElement ConfirmDelete_btn;
	
	@FindBy(xpath="/html/body/div[9]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement Ok_btn;
	
	public AppConfigurationListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AppConfigurationPage DeleteAppConfiguration(String Search_td) throws InterruptedException {
		SearchAppConfig_txt.sendKeys(Search_td);
		Thread.sleep(2000);
		DeleteAppConfig_btn.click();
		return new AppConfigurationPage();
		
		}
	
	public AppConfigurationPage DeleteReason_AppConfiguration(String DeleteReason_td) throws InterruptedException {
		DeleteReason_txt.sendKeys(DeleteReason_td);
		Thread.sleep(2000);
		ConfirmDelete_btn.click();
		Thread.sleep(2000);
		Ok_btn.click();
		return new AppConfigurationPage();
	}

}
