package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and passowrd")
	public void i_enter_the_correct_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("123567");
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I enter the incorrect username and passowrd")
	public void i_enter_the_incorrect_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("123567");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.id("error_box"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
	   	}

	@And("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	    
}
	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}
	@When("I enter the username as {string} and passowrd as {string}")
	public void i_enter_the_username_as_and_passowrd_as(String UN, String PW) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UN);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PW);
	}
	@When("I enter the username as {string} and Password as {string}")
	public void i_enter_the_username_as_and_Password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
}
}
	
