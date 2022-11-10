package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public static WebDriver driver;

	@FindBy(xpath = "//*[@data-component-type='s-search-result']")
	private WebElement result;

	public WebElement getresult() {
		return result;
	}

	@FindBy(xpath = "//*[text()='MORE RESULTS']")
	private WebElement moreresult;

	public WebElement getmoreresult() {
		return moreresult;
	}

	
	
	
	
	
	public ProductPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
}
