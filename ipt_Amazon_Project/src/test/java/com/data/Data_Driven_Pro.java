package com.data;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Amazon_DataDriven.Xls_Reader_Amazon;
import Amazon_DataDriven.Xls_datadriven_ama;

public class Data_Driven_Pro {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shakt\\eclipse-workspace\\ipt_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in/");
	
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		all.click();
		
		Select s= new Select(all);
		s.selectByVisibleText("Baby");

		Thread.sleep(2000);
		
		//String value=Xls_Reader.particulardata("sheet1", 2, 0);
		//String value=Xls_Reader.alldata();
	
		
		
		WebElement inputvalue = driver.findElement(By.id("twotabsearchtextbox"));
		inputvalue.sendKeys("soft toys");
		
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		
		
		//String val =Xls_Reader.particulardata("sheet1", 2, 1);
//		String val =Xls_Reader.alldata();
	
		
		
	}

}
