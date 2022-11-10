package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesign {

	public static WebDriver driver;

	public SingleTonDesign(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public AmazonPage getAmazonPage() {
		AmazonPage l = new AmazonPage(driver);
		return l;
	}

	public ProductPage getProductPage() {
		ProductPage sp = new ProductPage(driver);
		return sp;
	}

}
