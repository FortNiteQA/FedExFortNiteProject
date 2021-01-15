package fedex.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import fedex.Elements.TrackingElements;
import fedex.Utilities.SetupDrivers;


public class TrackingActions {
	
TrackingElements trackEle;
	
	
	public TrackingActions() {		
		this.trackEle = new  TrackingElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, trackEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	
	public void trackingLink() {
		trackEle.tracking.click();
	}
	
	public void trackingText() {
		trackEle.trackingText.sendKeys("782184933994");
	}

	public void trackingBtn() {
	
		trackEle.trackingBtn.click();
		
	}
}
