package Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy4StepDefenition {
	static WebDriver driver;

	@Given("^Navigate to home pag$")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Test\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}

	@When("^user enters username as \"([^\"]*)\" & password as \"([^\"]*)\"$")
	public void userEntersUsernameAsPasswordAs(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("Login")).click();
	}

	@Then("^user logged in successfuly$")
	public void userLoggedInSuccessfuly() throws Throwable {

		Assert.assertEquals(driver.getTitle(), "Home");

	}

	@When("^lalitha searches for below product$")
	public void lalithaSearchesForBelowProduct() throws Throwable {
		driver.findElement(By.xpath("//input[@name='products']")).sendKeys("Wear");
		//driver.findElement(By.name("products")).sendKeys("Wear");
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();

	}

	@Then("^product should be add in the cart if possible$")
	public void productShouldBeAddInTheCartIfPossible() throws Throwable {
		WebElement test = driver.findElement(By.xpath("//h4[text()='Summer wear']/ancestor::div[@class='caption']//a"));
		test.click();

	}

	@When("^Open cart$")
	public void openCart() throws Throwable {
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	}

	@And("^Checkout$")
	public void checkout() throws Throwable {
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	}

	@And("^Fiiling Address and proceed to pay$")
	public void fiilingAddressAndProceedToPay() throws Throwable {
		driver.findElement(By.name("ShippingAdd")).sendKeys("Kothi Mahal,Ujjain");
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@Then("^Successful Payment$")
	public void successfulPayment() throws Throwable {
		String text = driver.findElement(By.xpath("//h2")).getText();
		Assert.assertEquals(text, "Welcome to Payment Gateway -");
	}

	@Given("^on Search page$")
	public void onSearchPage() throws Throwable {
		
	}

}
