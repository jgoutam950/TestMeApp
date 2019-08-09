package Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudyStepDefinetion {

	WebDriver driver;

	@Given("^Navigate to home$")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Test\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@When("^user clicks on signup button$")
	public void userClicksOnSignupButton() throws Throwable {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

	}
	
	@And("^user enters userName as \"([^\"]*)\"$")
	public void userEntersUserNameAs(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);

	}

	@And("^user enters Firstname as \"([^\"]*)\"$")
	public void userEntersFirstnameAs(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@And("^user enters LastNAme as \"([^\"]*)\"$")
	public void userEntersLastNAmeAs(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);

	}

	@And("^user enters Password as \"([^\"]*)\"$")
	public void userEntersPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);

	}

	@And("^user enters ConfirmPassword as \"([^\"]*)\"$")
	public void userEntersConfirmPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);

	}

	@And("^user selects Gender as \"([^\"]*)\"$")
	public void userSelectsGenderAs(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("male"))
		{
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}
		else if(arg1.equalsIgnoreCase("female"))
		{
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		}
		

	}

	@And("^user enters Email as \"([^\"]*)\"$")
	public void userEntersEmailAs(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);

	}

	@And("^user enters Mobile as \"([^\"]*)\"$")
	public void userEntersMobileAs(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);

	}

	@And("^user enters DOB as \"([^\"]*)\"$")
	public void userEntersDOBAs(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);

	}

	@And("^user enters Address as \"([^\"]*)\"$")
	public void userEntersAddressAs(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);

	}

	@And("^user selects Security Question as \"([^\"]*)\" and  enters Answer as \"([^\"]*)\"$")
	public void userSelectsSecurityQuestionAsAndEntersAnswerAs(String arg1, String arg2) throws Throwable {
		Select question=new Select(driver.findElement(By.name("securityQuestion")));
		question.selectByVisibleText(arg1);
		driver.findElement(By.name("answer")).sendKeys(arg2);
	}
	@And("^user click on Submit button$")
	public void userClickOnSubmitButton() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	
	}

	@Then("^user Registration is successfully$")
	public void userRegistrationIsSuccessfully() throws Throwable {
		String message=driver.findElement(By.xpath("//fieldset/div[8]")).getText();
		Assert.assertEquals(message.trim(),"User Registered Succesfully!!! Please login");
	}


	

}
