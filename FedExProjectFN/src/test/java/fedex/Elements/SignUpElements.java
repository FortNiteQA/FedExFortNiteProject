package fedex.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpElements {

	@FindBy(xpath = "//span[contains(text(),'Sign Up or Log In')]")
	public WebElement signupLogin;
		
	@FindBy(xpath = "//a[contains(text(),'CREATE ACCOUNT')]")
	public WebElement creataccount;
	
	@FindBy(xpath = "//a[contains(text(),'Open account')]")
	public WebElement openaccount;
	
	@FindBy(xpath = "//*[@id=\'firstName\']")
	public WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\'lastName\']")
	public WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\'email\']")
	public WebElement email;
	
	@FindBy(xpath = "//*[@id=\'retypeEmail\']")
	public WebElement reenteremail;
	
	@FindBy(xpath = "//*[@id=\'address1\']")
	public WebElement address;
	
	@FindBy(xpath = "//*[@id=\'city\']")
	public WebElement city;
	
	@FindBy(xpath = "//*[@id=\'state\']")
	public WebElement state;
	
	@FindBy(xpath = "//*[@id=\"zip\"]")
	public WebElement zip;
	
	@FindBy(xpath = "//*[@id=\'phone\']")
	public WebElement phone;
	
	@FindBy(xpath = "//*[@id=\'uid\']")
	public WebElement userid;
	
	@FindBy(xpath = "//*[@id=\'password\']")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\'retypePassword\']")
	public WebElement repassword;

	@FindBy(xpath = "//*[@id=\'reminderQuestion\']")
	public WebElement secretQuestion;

	@FindBy(xpath = "//*[@id=\'reminderAnswer\']")
	public WebElement secretAnswer;

	@FindBy(xpath = "//*[@id=\'acceptterms\']")
	public WebElement acceptterms;
	
	@FindBy(xpath = "//*[@id=\'createUserID\']")
	public WebElement continueToaccount;

}
