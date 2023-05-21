package pageobjectoodelpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
//store all the webelement of login page
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd")  private WebElement  passwordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
}
