package com.pom;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;

public class HomePage extends Base {
	@FindBy(xpath="//h1[text()='JOIN OUR CREW']'")
	private WebElement joinOurCrewText;
	
	@FindBy(id="job_type")
	private WebElement jobTypeDropdown;
	
	@FindBy(xpath="//a[text()='QA Engineer']")
	private WebElement qaEngineer;
	
	 @FindBy(xpath="//td")
	private WebElement warningMessage;
	
	
	public WebElement getWarningMessage() {
		return warningMessage;
	}


	public WebElement getJoinOurCrewText() {
		return joinOurCrewText;
	}


	public WebElement getJobTypeDropdown() {
		return jobTypeDropdown;
	}


	public WebElement getQaEngineer() {
		return qaEngineer;
	}


	public WebElement getApply() {
		return apply;
	}


	@FindBy(xpath="//a[text()='QA Engineer']/parent::td/following-sibling::td/button[text()='Apply']")
	private WebElement apply;
	@FindBy(xpath="//div[@id='step1']/div[@class='row']/div[@class='col-md-4']")
	private List<WebElement> personalDetailFields;
	
	public List<WebElement> getPersonalDetailFields() {
		return personalDetailFields;
	}


	public HomePage() {

	PageFactory.initElements(driver, this);
	
	}
	
}
