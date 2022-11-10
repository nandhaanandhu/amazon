package com.amazonproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Amazon_DataDriven.Xls_Reader_Amazon;

public class Amazon_Project {
	public static WebDriver driver;
//	public static String expectedvalue = "Baby";
//	public static String expectedinput="soft toys";
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shakt\\eclipse-workspace\\ipt_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		String expectedvalue = Xls_Reader_Amazon.particulardata("amazon", 3, 0);
		String expectedinput = Xls_Reader_Amazon.particulardata("amazon", 3, 1);
		

		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		all.click();

		Thread.sleep(2000);

		Select s = new Select(all);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			String actualvalue = op.get(i).getText();
			if (expectedvalue.equals(actualvalue)) {
				s.selectByVisibleText(actualvalue);

			}

		}
		WebElement inputvalue = driver.findElement(By.id("twotabsearchtextbox"));
		inputvalue.sendKeys(expectedinput);

		List<WebElement> suggestion = driver.findElements(By.xpath("//*[@class='autocomplete-results-container']"));

		Thread.sleep(2000);
		for (int i = 1; i <= suggestion.size(); i++) {
			
			WebElement search = driver
					.findElement(By.xpath("//*[@class='autocomplete-results-container']/div['" + i + "']/div/div"));

			String text = search.getText();

			if (expectedinput.equalsIgnoreCase(text)) {
				Thread.sleep(2000);

				search.click();
				break;
			} else {
				continue;

			}

		}
		System.out.println("completed");

	List<WebElement> results = driver.findElements(By.xpath("//*[@data-component-type='s-search-result']"));
	//List<WebElement> results = driver.findElements(By.xpath("//*[text()='RESULTS']"));
	
		System.out.println("no of product"+results.size());
	
	
//	
//	WebElement res = driver.findElement(By.xpath("//*[text()='RESULTS']"));
//	System.out.println(res.getSize());
//	System.out.println(res.getText());
//	
//	List<WebElement> moreresults = driver.findElements(By.xpath("//*[text()='MORE RESULTS']"));
//	
//		
//		System.out.println("no of product"+moreresults.size());
	
	
		
	
	
	List<WebElement> resul = driver.findElements(By.xpath("//*[@class='product-base']"));
	
	for (WebElement product : resul) {
		System.out.println(product.getText());
		
	
System.out.println("total no of product"+ resul.size());
	
}
	}
}