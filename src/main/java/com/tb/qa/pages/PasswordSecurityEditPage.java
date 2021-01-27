package com.tb.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;
import com.tb.qa.util.MouseActionUtil;

public class PasswordSecurityEditPage extends TestBase{
	PasswordSecurityEditPage passwordSecurityEditPage;
	PasswordSecurityQuestionEditUpdationPage passwordSecurityQuestionEditUpdationPage;
	MouseActionUtil mouse = new MouseActionUtil();
	


	@FindBy(xpath="//*[@id=\"Content\"]/div/div/div[2]/table/tbody/tr/td[3]/div/button[1]")
	WebElement Edit_icon;
	
	@FindBy(xpath="//*[@id=\"QuestionText\"]")
	WebElement EditSecurityQuestion_txt;
	
//	@FindBy(xpath="//*[@id=\"StatusID\"]/div/div")
//	WebElement EditStatus_drop;
//
//	@[@id="344f8ceb-0050-4862-bbe0-c9ce5d9d0c65"]/ul/li[2]
//
//	@FindBy(xpath="//div[@class='ant-select-selection-selected-value' and @title='InActive']")
//	@FindBy(xpath="//*[@id=\"344f8ceb-0050-4862-bbe0-c9ce5d9d0c65\"]/ul/li[1]")
//	WebElement Active_drop;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/form/div[2]/div/button[2]")
	WebElement SaveEditQuestion_btn;
	
/*	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[1]")
	WebElement CancelUpdateSecurityQuestion_btn;
	
	@FindBy(xpath="//*[@id=\"Change Reason\"]")
	WebElement ChangeReason_txt;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]")
	WebElement ConfirmSecurityQuestion_btn;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button")
	WebElement DoneUpdation_btn;*/
	
	public PasswordSecurityEditPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public  PasswordSecurityQuestionEditUpdationPage EditSecurityQuestion(String UpdateQuestion_td) throws InterruptedException {
		Edit_icon.click();
		Thread.sleep(2000);
//		EditSecurityQuestion_txt.clear();
//		Thread.sleep(2000);
//		int listSize= passwordSecurityEditPage.EditStatus_drop.size();
//		String [] options= {"InActive"};
//		int num=0;
//		for(int i=0; i<listSize; i++)
//		{
//			mouse.mouse_Scroll(driver, passwordSecurityEditPage.EditStatus_drop.get(i));
//			
//			for(int j=0; j<options.length ;j++) 
//			{
//				if(passwordSecurityEditPage.EditStatus_drop.get(i).getText().equalsIgnoreCase(options[j]))
//				{
//					passwordSecurityEditPage.EditStatus_drop.get(i).click();	
//					num +=1;
//				}	
//			}
//			if(num == options.length)
//			{
//				break;
//		    }
//		}
		EditSecurityQuestion_txt.clear();
		Thread.sleep(2000);
		EditSecurityQuestion_txt.sendKeys(UpdateQuestion_td);
		Thread.sleep(2000);
//        EditStatus_drop.click();
//        Thread.sleep(2000);
//        Active_drop.click();
//        Thread.sleep(2000);
		SaveEditQuestion_btn.click();
		Thread.sleep(2000);
		return new PasswordSecurityQuestionEditUpdationPage();
		// TODO Auto-generated method stub
		
	}
/*	public PasswordSecurityQuestionListPage UpdateSecurityQuestion(String EnterReason_td) throws InterruptedException {
		CancelUpdateSecurityQuestion_btn.clear();
		Thread.sleep(2000);
		SaveEditQuestion_btn.click();
		Thread.sleep(2000);
		ChangeReason_txt.sendKeys(EnterReason_td);
		Thread.sleep(2000);
		ConfirmSecurityQuestion_btn.click();
		Thread.sleep(2000);
		DoneUpdation_btn.click();
		
		
		return new PasswordSecurityQuestionListPage();
		// TODO Auto-generated method stub
		
	}
*/



}
