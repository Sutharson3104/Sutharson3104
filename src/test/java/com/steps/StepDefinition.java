package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;

	@When("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	
	@When("User prints Page title")
	public void user_prints_page_title() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}


	
	  @When("User enters {string} and {string}") public void user_enters_and(String
	  user, String pass) { driver.findElement(By.id("email")).sendKeys(user);
	  driver.findElement(By.id("pass")).sendKeys(pass); }
	 

	/*
	 * @When("User enters username and password") public void
	 * user_enters_username_and_password() {
	 * driver.findElement(By.id("email")).sendKeys("BesantTambaram");
	 * driver.findElement(By.id("pass")).sendKeys("12345");
	 * 
	 * }
	 */

	@When("User clicks login page")
	public void user_clicks_login_page() {

		driver.findElement(By.name("login")).click();

	}

	@Then("User verify the error message")
	public void user_verify_the_error_message() {
		/*
		 * WebElement text =
		 * driver.findElement(By.xpath("//a[text()='Find your account and log in.']"));
		 * String message = text.getText(); //Assert.assertEquals(message,
		 * "Find your account and log in.");
		 */
		System.out.println(driver.getCurrentUrl());
		

	}

}
