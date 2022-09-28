package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;

public class JobPage extends Base  {
	
	
	public JobPage() {
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath="//a[text()='Apply here now']")
	private WebElement applyNow;
	
	@FindBy(id="firstName")
	private WebElement Karthik;
	
	@FindBy(id="lastName")
	private WebElement P;
	
	@FindBy(id="email")
	private WebElement karthikparamesh81;
	
	@FindBy(id="phone")
	private WebElement k ;
	
	@FindBy(xpath="//span[text()='Hiring']/preceding-sibling::a[text()='Careers']")
	private WebElement careerbutton;
	public WebElement getCareerbutton() {
		return careerbutton;
	}

	@FindBy(id="sports")
	private WebElement Cricket ;
	
	@FindBy(id="pets")
	private WebElement Cats ;
	
	@FindBy(name="Current location")
	private WebElement Chennai ;
	
	public WebElement getApplyNow() {
		return applyNow;
	}

	public void setApplyNow(WebElement applyNow) {
		this.applyNow = applyNow;
	}

	public WebElement getKarthik() {
		return Karthik;
	}

	public void setKarthik(WebElement karthik) {
		Karthik = karthik;
	}

	public WebElement getP() {
		return P;
	}

	public void setP(WebElement p) {
		P = p;
	}

	public WebElement getKarthikparamesh81() {
		return karthikparamesh81;
	}

	public void setKarthikparamesh81(WebElement karthikparamesh81) {
		this.karthikparamesh81 = karthikparamesh81;
	}

	public WebElement getK() {
		return k;
	}

	public void setK(WebElement k) {
		this.k = k;
	}

	public WebElement getCricket() {
		return Cricket;
	}

	public void setCricket(WebElement cricket) {
		Cricket = cricket;
	}

	public WebElement getCats() {
		return Cats;
	}

	public void setCats(WebElement cats) {
		Cats = cats;
	}

	public WebElement getChennai() {
		return Chennai;
	}

	public void setChennai(WebElement chennai) {
		Chennai = chennai;
	}

	public WebElement getCuddalore() {
		return Cuddalore;
	}

	public void setCuddalore(WebElement cuddalore) {
		Cuddalore = cuddalore;
	}

	public WebElement getJuly14() {
		return July14;
	}

	public void setJuly14(WebElement july14) {
		July14 = july14;
	}

	@FindBy(name="Hometown")
	private WebElement Cuddalore ;
	
	@FindBy(id="dob")
	private WebElement July14; 

}
