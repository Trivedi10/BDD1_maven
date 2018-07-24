package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {

	WebDriver driver; 
	String title;
	@Given("^login app should be available$")
	public void login_app_should_be_available()  
	{
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	    
	}

	@When("^validate login app$")
	public void validate_login_app() throws InterruptedException 
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	    title=driver.getTitle();
		System.out.println("Siri");
	}

	@Then("^login should be successfull$")
	public void login_should_be_successfull() 
	{
		Assert.assertEquals("OrangeHRM", title);
		
	}

	
	
	
}
