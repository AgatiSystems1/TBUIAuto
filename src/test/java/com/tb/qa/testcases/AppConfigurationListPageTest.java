package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.AppConfigurationListPage;

public class AppConfigurationListPageTest extends TestBase {
	AppConfigurationListPage appConfigurationListPage;
	
	@BeforeMethod
	public void setup() {
		appConfigurationListPage = new AppConfigurationListPage();
	}
	
	@Test(priority=1)
	public void DeleteAppCongigurationPage() throws InterruptedException {
		appConfigurationListPage.DeleteAppConfiguration("Data Application");
	}
	
	@Test(priority=2)
	public void AppConfigurationDeleteReason() throws InterruptedException {
		appConfigurationListPage.DeleteReason_AppConfiguration("No");
		
	}

}
