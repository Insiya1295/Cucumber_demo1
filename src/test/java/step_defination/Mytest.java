package step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Mytest {
	WebDriver driver;
	@Given("Testme app Login")
	public void testme_app_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		 driver =new ChromeDriver();
		
	}

	@Then("User launched the app")
	public void user_launched_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.manage().window().maximize();
	}

	@Then("User enters the vald credentials")
	public void user_enters_the_vald_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
		driver.findElement(By .name("password")).sendKeys("Password123");
		driver.findElement(By .name("Login")).click();
	}

	@Then("verifies for login status in his credentials")
	public void verifies_for_login_status_in_his_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String expected="SignOut";
		String actual=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		Assert.assertEquals(expected, actual);
	}


}
