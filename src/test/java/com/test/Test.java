package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pom.HomePage;
import com.pom.JobPage;
import com.utility.Base;

import junit.framework.Assert;


public class Test  extends Base{
	static JavascriptExecutor js;
	static Select s;
	public static void main(String[] args) {
		

		launchBrowser("chrome", "https://numadic.com/careers/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		HomePage hp=new HomePage();
		 s=new Select(hp.getJobTypeDropdown());
		
		s.selectByVisibleText("Internship");
		
		String expected ="There are no available job positions that match your filters.";
		
		Assert.assertEquals(expected, hp.getWarningMessage().getText());
		
		 s.selectByVisibleText("Full time");
		 
		 hp.getQaEngineer().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("qa")); 
		
		JobPage jp=new JobPage();
		 js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", jp.getApplyNow());
		jp.getApplyNow().click();
		
		
		
		jp.getCareerbutton().click();
		hp.getApply().click();
		
		for (WebElement element :hp.getPersonalDetailFields()) {
			
			if(element.isDisplayed()&& element.isEnabled()) {
				
				Assert.assertTrue(true);
				
			}
			
			
			
		}
		
		
		
	
		
	}

}
