package fedex.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import fedex.Elements.AllProductInfoElements;
import fedex.Utilities.SetupDrivers;

public class AllProductInfoActions {

AllProductInfoElements allProEle;
	
	public AllProductInfoActions() {
		this.allProEle = new AllProductInfoElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, allProEle);	
	}
	
	public void homePage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	} 
	
	
	public void designPringMenu() throws InterruptedException {
		allProEle.designPrintMenu.click();
		allProEle.allProduct.click();	
	}
	
	public void caroselIcon() {
		allProEle.caroselIcon.click();	
		allProEle.caroselIcon.click();
		allProEle.caroselIcon.click();
		allProEle.caroselIcon.click();
	}
		
	
}
