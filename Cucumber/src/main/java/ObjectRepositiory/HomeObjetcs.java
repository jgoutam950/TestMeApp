package ObjectRepositiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObjetcs {
	@FindBy(name = "userName")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	
}
