package fedex.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import fedex.Elements.ShippingElements;
import fedex.Utilities.SetupDrivers;

public class ShippingActions {

	ShippingElements shippingWinEle;
	
	public ShippingActions() {
		this.shippingWinEle = new ShippingElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, shippingWinEle);
	}
	
	public void pageOpen() {			
		
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void returnPkg() throws InterruptedException {
		shippingWinEle.returnPkg.click();
		Thread.sleep(2000);
	}
	
	
	public void createLabel() throws InterruptedException {
		shippingWinEle.createLabel.click();
		Thread.sleep(2000);		
	}
	
	public void returnInfo() throws InterruptedException {	
		
		for (String winHandle : SetupDrivers.chromeDriver.getWindowHandles()) {
			SetupDrivers.chromeDriver.switchTo().window(winHandle);
		}
				
		shippingWinEle.yourName.sendKeys("Ahad");
		Thread.sleep(2000);
		shippingWinEle.returnName.sendKeys("Zaman");
		Thread.sleep(2000);
	}
	
	public void continueButton() throws InterruptedException {
		shippingWinEle.continueButton.click();
		Thread.sleep(2000);
	}
	
	public void errorMsg() throws InterruptedException {
		shippingWinEle.errorMsg.isDisplayed();
		Thread.sleep(4000);
	}
}