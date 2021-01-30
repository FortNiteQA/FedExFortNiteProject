package fedex.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fedex.Elements.LoginElements;
import fedex.Utilities.SetupDrivers;

public class LoginActions {
	
	LoginElements fedexLoginElements = null;

	public LoginActions () {
		this.fedexLoginElements = new LoginElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, fedexLoginElements);

	}

	public void getFedexHomepage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("FedEx")) {
			bool = true;
		}

		return bool;
	}


	public void SignuporLogin() {
		fedexLoginElements.SignuporLogin.click();
	}

	public void inputUserName(String username) {
		fedexLoginElements.userid.sendKeys(username);
	}

	public void inputPassword(String password) {
		fedexLoginElements.password.sendKeys(password);
	}

	public void clickLoginBtn() throws InterruptedException {
		fedexLoginElements.loginBtn.click();
		Thread.sleep(2000);
	}
}
