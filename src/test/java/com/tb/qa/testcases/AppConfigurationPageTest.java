package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.AppConfigurationPage;
import com.tb.qa.pages.ProjectListPage;

public class AppConfigurationPageTest extends TestBase {
	ProjectListPage projectListPage;
	AppConfigurationPage appConfigurationPage;
	
	
	@BeforeMethod
	public void setup() {
		appConfigurationPage =new AppConfigurationPage();
	}
	
	@Test(priority=1)
	public void CancelAppConfigCreatePage() throws InterruptedException {
		appConfigurationPage.cancelAppConfigCreate();
	}
	
	@Test(priority=2)
	public void create_AppConfig_TermName() {
		appConfigurationPage.create_TermName("DataApplication3");
	}
	
	@Test(priority=3)
	public void create_AppConfig_TermCode() {
		appConfigurationPage.create_TermCode("3");
	}
	
	@Test(priority=4)
	public void create_AppConfig_ShortValue() {
		appConfigurationPage.create_ShortValue("Huge");
	}
	
	@Test(priority=5)
	public void create_AppConfig_LongValue() {
		appConfigurationPage.create_LongValue("Huge1");
	}
	
	@Test(priority=6)
	public void clear_AppConfig_CreateValues() {
		appConfigurationPage.clearValues();
	}

}
