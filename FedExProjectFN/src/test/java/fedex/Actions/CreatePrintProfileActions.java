package fedex.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import fedex.Elements.CreatePrintProfileElements;
import fedex.Utilities.SetupDrivers;

public class CreatePrintProfileActions {

	
	CreatePrintProfileElements printProfile;	
	
	public CreatePrintProfileActions() {		
		this.printProfile = new  CreatePrintProfileElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, printProfile);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}

	public void printDesignMenu()  {
		
		//printProfile.cookieEle.click();
		printProfile.designPrintMenu.click();
		printProfile.designTempleteSubmenu.click();
		
	}
	
	public void signUpandPrintProfileLink() {
		
		printProfile.signupLogin.click();
		printProfile.createPrintLink.click();
		
	}
	
	public void printProfileInfo() {
		printProfile.firstName.sendKeys("Fort");
		printProfile.lastName.sendKeys("Night");
		printProfile.email.sendKeys("fortnight@gmail.com");
		printProfile.phone.sendKeys("6462171462");
		printProfile.userid.sendKeys("fortnight");
		printProfile.password.sendKeys("123456Fn");
		printProfile.repassword.sendKeys("123456Fn");
		printProfile.checkBox.click();
		
	}
	
	public void submitButton() {
		printProfile.submitBtn.click();
		
	}
	
	
	
}
