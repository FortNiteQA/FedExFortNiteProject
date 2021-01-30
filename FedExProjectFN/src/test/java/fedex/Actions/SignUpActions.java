package fedex.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import fedex.Elements.SignUpElements;
import fedex.Utilities.SetupDrivers;

public class SignUpActions {

SignUpElements signup;	
	
	public SignUpActions() {		
		this.signup = new  SignUpElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, signup);
	}	

	
	public void fedExHomePage() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	
	public void SignUpLogin()  {
		
		signup.signupLogin.click();

	}
	
	public void creatAccount()  {
		
		signup.creataccount.click();

	}
	
	public void openAccount()  {
	
	signup.openaccount.click();

}

	public void firstNameLastName()  {
	
	signup.firstname.sendKeys("Pep");
	signup.lastname.sendKeys("Guardiola");
}
	
	public void email()  {
		
		signup.email.sendKeys("hsnahmed79@gmail.com");
		signup.reenteremail.sendKeys("hsnahmed79@gmail.com");
	}
	
	public void addressandCity()  {
		
		signup.address.sendKeys("10106 80th St");
		signup.city.sendKeys("Jamaica");
	}
	
	// drop down 
public void state()  {
		
	Select dropState = new Select(signup.state);
	dropState.selectByVisibleText("New York(NY)");
	
	
		
	}

	public void zipAndPhone()  {
	
	signup.zip.sendKeys("10106");
	signup.phone.sendKeys("9293001500");
}



	public void useridPassword()  {
	
	signup.userid.sendKeys("Tale");
	signup.password.sendKeys("Jamaica0606");
	signup.repassword.sendKeys("Jamaica0606");
}

//drop down 
	public void secretQuestionAnswer()  {
	
	Select dropSecret = new Select(signup.secretQuestion);
	dropSecret.selectByVisibleText("What is your place of birth?");
		
	signup.secretAnswer.sendKeys("Bangladesh");
}

	
	
	public void acceptTerms() {
		signup.acceptterms.click();

	}
	
	
	public void continueToAccount() {
		signup.continueToaccount.click();

	}
	
	/* public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("FedEx")) {
			bool = true;
		}

		return bool;
	}  */
	
	 public boolean verifySignUppage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("Registration")) {
			bool = true;
		}

		return bool;
	}
	 
	
	
}
