package fedex.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import fedex.Elements.CouponPdfElements;
import fedex.Utilities.SetupDrivers;

public class CouponPdfActions {

CouponPdfElements cuponEle;
	
	
	public CouponPdfActions() {		
		this.cuponEle = new  CouponPdfElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, cuponEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	
	
	public void menuSubmenu()  {		
		
	cuponEle.designPrintMenu.click();
	cuponEle.cuponDeal.click();
		
	}
	

	public void getCupon() throws InterruptedException  {		
		
	cuponEle.getCupon.click();
	Thread.sleep(3000);
	
	// new tab
	
	
	    String windowHandle = SetupDrivers.chromeDriver.getWindowHandle();
	    SetupDrivers.chromeDriver.switchTo().window(windowHandle);
	   
	
	
	  
	    cuponEle.backMainLink.sendKeys(Keys.CONTROL +"\t");
	    SetupDrivers.chromeDriver.switchTo().defaultContent();
	
	
	}
}
