package fedex.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElements {
	@FindBy(xpath = "//*[@id=\"fxg-dropdown-signIn\"]/span")
	public WebElement SignuporLogin;

	@FindBy(xpath = "//*[@id=\'NavLoginUserId\']")
	public WebElement userid;

	@FindBy(xpath = "//*[@id=\'NavLoginPassword\']")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\'HeaderLogin\']/button")
	public WebElement loginBtn;
}
