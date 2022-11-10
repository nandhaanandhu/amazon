package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

	public static WebDriver driver;

	@FindBy(id = "searchDropdownBox")
	private WebElement dropdown;

	public WebElement getdropdown() {
		return dropdown;

	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement text;

	public WebElement gettext() {
		return text;
	}

	@FindBy(xpath = "//*[@class='autocomplete-results-container']")
	private WebElement suggestion;

	public WebElement getsuggestion() {
		return suggestion;
	}

	

	public AmazonPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
