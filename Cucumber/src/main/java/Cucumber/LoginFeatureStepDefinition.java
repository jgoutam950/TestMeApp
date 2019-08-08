package Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ObjectRepositiory.LoginObjects;
import ObjectRepositiory.PageObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeatureStepDefinition {
	static WebDriver driver;
	int productcount = 0;

	@Given("^Navigate to home page$")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Test\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user enters username and password$")
	public void userEntersUsernameAndPassword() throws Throwable {

		PageObjects po = PageFactory.initElements(driver, PageObjects.class);
		LoginObjects lo = PageFactory.initElements(driver, LoginObjects.class);

		po.signin.click();
		lo.username.sendKeys("lalitha");
		lo.password.sendKeys("password123");
		lo.Login.click();
	}

	@Then("^user logged in successfully$")
	public void userLoggedInSuccessfully() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Admin Home");
	}

	@When("^lalitha searches for below products$")
	public void lalithaSearchesForBelowProducts(DataTable productsdata) throws Throwable {
		List<String> productsName = productsdata.asList(String.class);
		navigateToHomePage();
		userEntersUsernameAndPassword();

		for (String product : productsName)
		{
			driver.findElement(By.name("products")).sendKeys(product);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			boolean found=isElementPresent("//a[text()[contains(.,'Add to cart')]]");
			if(found)
			{
				productcount++;
			}
			driver.findElement(By.xpath("//a[text()[contains(.,'Home')]]")).click();
		}
	}

	@Then("^product should be added in the cart if possible$")
	public void productShouldBeAddedInTheCartIfPossible() throws Throwable 
	{
		WebElement Element=driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/a/b"));
		int NoOfElement=Integer.parseInt(Element.getText());
		Assert.assertEquals(NoOfElement,productcount);
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userEntersAnd(String arg1, String arg2) throws Throwable {

		PageObjects po = PageFactory.initElements(driver, PageObjects.class);
		LoginObjects lo = PageFactory.initElements(driver, LoginObjects.class);

		po.signin.click();
		lo.username.sendKeys(arg1);
		lo.password.sendKeys(arg2);
		lo.Login.click();		
	}

	@Then("^user logged in successfully Via New Method\\.$")
	public void userLoggedInSuccessfullyViaNewMethod() throws Throwable {
		driver.quit();
	}

	public static boolean isElementPresent(String locator)
	{
		int attempts = 0;
		boolean found = false;
		while (attempts < 2) {
			try {
				WebElement element = driver.findElement(By.xpath(locator));
				element.click();
				found = true;
				break;
			} catch (Exception e) {
			}
			attempts++;
		}
		return found;
	}
}
