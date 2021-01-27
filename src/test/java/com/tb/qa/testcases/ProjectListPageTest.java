package com.tb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.AppConfigurationPage;
import com.tb.qa.pages.PasswordSecurityQuestion;
import com.tb.qa.pages.ProjectListPage;

public class ProjectListPageTest extends TestBase{
	
	ProjectListPage projectListPage;
	PasswordSecurityQuestion passwordSecurityQuestion;
	AppConfigurationPage appConfigurationPage;
	@BeforeMethod
	public void setup() {
	
		projectListPage=new ProjectListPage();
	}
	@Test()
	public void listPageTest() throws InterruptedException {
		
		projectListPage.createAppConfigure();
//		String expectedUrl="http://172.16.1.246:8032/";
//		String actualUrl=driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("PSQ");
		
	}

}
