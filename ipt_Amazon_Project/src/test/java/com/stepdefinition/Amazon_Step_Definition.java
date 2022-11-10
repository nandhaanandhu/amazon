
package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pom.SingleTonDesign;
import com.runner.Amazon_Runner;

import Amazon_DataDriven.Xls_Reader_Amazon;
import Baseclass.Base_class_A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Amazon_Step_Definition extends Base_class_A {
	public static WebDriver driver = Amazon_Runner.driver;
public static SingleTonDesign std=new SingleTonDesign(driver);

//	public static String expectedvalue = "Baby";
//	public static String expectedinput = "soft toys";

	@Given("^enter the url$")
	public void enter_the_url() throws Throwable {
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

	}

	@When("^user select the product from the category$")
	public void user_select_the_product_from_the_category() throws Throwable {

		String expectedvalue = Xls_Reader_Amazon.particulardata("amazon", 1, 0);
		String expectedinput = Xls_Reader_Amazon.particulardata("amazon", 1, 1);

//		click(std.getAmazonPage().getdropdown());
		
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
		Thread.sleep(2000);
	}

	@Then("^user should enter the product name in the search box$")
	public void user_should_enter_the_product_name_in_the_search_box() throws Throwable {
		String expectedinput = Xls_Reader_Amazon.particulardata("amazon", 1, 1);

		sendkey(std.getAmazonPage().gettext(), expectedinput);
//		WebElement inputvalue = driver.findElement(By.id("twotabsearchtextbox"));
//		inputvalue.sendKeys(expectedinput);
//		Thread.sleep(2000);

	}

	@Then("^user should compare with the suggestion and Click the product name$")
	public void user_should_compare_with_the_suggestion_and_Click_the_product_name() throws Throwable {
		String expectedinput = Xls_Reader_Amazon.particulardata("amazon", 1, 1);

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

	}

	@When("^user search the result page and enter the total number of product$")
	public void user_search_the_result_page_and_enter_the_total_number_of_product() throws Throwable {
		List<WebElement> results = driver.findElements(By.xpath("//*[@data-component-type='s-search-result']"));
		System.out.println("no of product" + results.size());
		Thread.sleep(2000);

	}

	@Then("^user search the more result page and enter the total number of product$")
	public void user_search_the_more_result_page_and_enter_the_total_number_of_product() throws Throwable {
		List<WebElement> moreresults = driver.findElements(By.xpath("//*[text()='MORE RESULTS']"));

		System.out.println("no of product" + moreresults.size());
		Thread.sleep(2000);

	}

}
