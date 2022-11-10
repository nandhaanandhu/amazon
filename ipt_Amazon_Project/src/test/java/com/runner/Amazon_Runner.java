package com.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.Base_class_A;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\shakt\\eclipse-workspace\\ipt_Amazon_Project\\src\\test\\java\\com\\feature\\amazon.feature",
glue ="com.stepdefinition",
monochrome = true,
dryRun=true,
//strict=false,
plugin= {"html:Report/HtmlReport.html",
		"pretty",
		"json:Report/jsonReport.json",
		"junit:Report/xmlReport.xml",
	//	"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"
		
})

public class Amazon_Runner {
			 public static WebDriver driver;
	
	@BeforeClass
	public  static void setup() {
		
		driver=Base_class_A.setpro("chrome");
		driver=Base_class_A.maxi();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\shakt\\eclipse-workspace\\ipt_Amazon_Project\\driver\\chromedriver.exe");
//	    driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		

	}
	@AfterClass
	public static void teardown() {
		driver=Base_class_A.close();
		
//		driver.close();

	}
	
	
	
	
	
//	System.setProperty("webdriver.chrome.driver", 
//			"C:\\Users\\shakt\\eclipse-workspace\\Nandhaa_Project\\driver\\chromedriver.exe");
//	 driver=new ChromeDriver();
	// driver.manage().window().maximize();
}
