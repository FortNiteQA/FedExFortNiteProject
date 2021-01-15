package fedex.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import fedex.Elements.ShippingElements;
import fedex.Utilities.SetupDrivers;

public class ShippingActions {

	ShippingElements shipElements = null;

	public ShippingActions () {
		this.shipElements = new ShippingElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, shipElements);

	}

	public void getFedexHomepage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void clickReturnPackage() {
		shipElements.returnPackage.click();
	}
	
	public void clickCreateShipmentLevel() {
		shipElements.shippingLevel.click();
	}
	
	
	public boolean verifyShippingPage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("Shipping Labels and Drop Off Locations")) {
			bool = true;
		}

		return bool;
	}
}