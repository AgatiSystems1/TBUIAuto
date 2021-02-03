package com.tb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.LoginPage;
import com.tb.qa.pages.ProjectListPage;



public class LoginPageTest extends TestBase {
		
	LoginPage loginPage;
	ProjectListPage projectListPage;
	 
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
		
	@Test
	public void loginTest() throws InterruptedException {
		projectListPage = loginPage.login("admin6", "admin");
//		String expectedUrl="http://172.16.1.246:8032/trans/project";
//		String actualUrl=driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
//	@Test
//	public static void loginTest1() {
//		String expectedUrl="http://172.16.1.246:8032/trans/project";
//		String actualUrl=driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
//	}
//	@Test
//	public void loginTestN1() throws InterruptedException {
//		loginPage = loginPage.loginN("AdminT", "admin");
//	}
//	@Test
//	public void loginTestN2() throws InterruptedException {
//		loginPage = loginPage.loginN("Admin4", "adminTest");
//	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Test over");
	}
}
