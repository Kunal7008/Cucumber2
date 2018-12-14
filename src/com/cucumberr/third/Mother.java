package com.cucumberr.third;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mother {
	WebDriver driver;
	@Given("^Open Browser and start application$")
	public void open_Browser_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");      
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		 driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bolbala");
		 Select sel=new Select(driver.findElement(By.id("day")));
		 sel.selectByVisibleText("25");
	}

	@Then("^user login suceesfully$")
	public void user_login_suceesfully() throws Throwable {
	    System.out.println("go run from feature file");
		System.out.println("github integrated sucessfully");
	}


}
