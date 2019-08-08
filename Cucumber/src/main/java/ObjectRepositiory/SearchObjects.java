package ObjectRepositiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchObjects {
	@FindBy(name = "products")
	public WebElement products;

	@FindBy(how=How.XPATH, using= "//input[@value='FIND Details']")
	public WebElement findDetails;

	
}
