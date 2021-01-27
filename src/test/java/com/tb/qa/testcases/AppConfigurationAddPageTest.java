package com.tb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.AppConfigurationAddPage;

public class AppConfigurationAddPageTest extends TestBase {
	AppConfigurationAddPage appConfigurationAddPage;
	
	@BeforeMethod
	public void setup() {
		appConfigurationAddPage=new AppConfigurationAddPage();
	}
	
//	@Test(priority=1)
//	public void CancelAppConfigCreatePage() throws InterruptedException {
//		appConfigurationAddPage.cancelAppConfigCreate();
//	}
	
	@Test(priority=1)
	public void create_AppConfig_TermName() throws InterruptedException {
		appConfigurationAddPage.create_TermName("DataApplication3");
	}
	
	@Test(priority=2)
	public void create_AppConfig_TermCode() throws InterruptedException {
		appConfigurationAddPage.create_TermCode("3");
	}
	
	@Test(priority=3)
	public void create_AppConfig_ShortValue() throws InterruptedException {
		appConfigurationAddPage.create_ShortValue("Huge");
	}
	
	@Test(priority=4)
	public void create_AppConfig_LongValue() throws InterruptedException {
		appConfigurationAddPage.create_LongValue("Huge1");
	}
	
	@Test(priority=5)
	public void Add_AppConfiguration_Page() throws InterruptedException {
		appConfigurationAddPage.AddAppConfiguration();
	}
	
	

}
