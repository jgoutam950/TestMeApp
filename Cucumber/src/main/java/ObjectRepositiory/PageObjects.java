package ObjectRepositiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	@FindBy(how = How.XPATH, using = "//a[@href='login.htm']")
	public WebElement signin;
	
	

}
