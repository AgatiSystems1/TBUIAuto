package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.AppConfigurationEditPage;

public class AppConfigurationEditPageTest extends TestBase{
	AppConfigurationEditPage appConfigurationEditPage;
	
	@BeforeMethod
	public void setup() {
		appConfigurationEditPage = new AppConfigurationEditPage();
	}
	
	@Test(priority=1)
	public void EditAppConfigurationPage() throws InterruptedException {
		appConfigurationEditPage.EditAppConfiguration("data");
	}
	
	@Test(priority=2)
	public void Edit_AppConfig_TermName() throws InterruptedException {
		appConfigurationEditPage.Edit_TermName("data2");
	}
	
	@Test(priority=2)
	public void Edit_AppConfig_LongValue() throws InterruptedException {
		appConfigurationEditPage.Edit_LongValue("f12");
	}
	
	@Test(priority=3)
	public void Update_AppConfiguration() throws InterruptedException {
		appConfigurationEditPage.UpdateAppConfiguration_Edit("Nothing is Prmanent");
		}

}
