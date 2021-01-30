package fedex.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import fedex.Elements.PageBackandForthElements;
import fedex.Utilities.SetupDrivers;

public class PageBackandForthActions {

	PageBackandForthElements backAndForth;
	
	public PageBackandForthActions(){
		
		this.backAndForth=new PageBackandForthElements();
		
		PageFactory.initElements(SetupDrivers.chromeDriver, backAndForth);
	}
	
	public void fedExHomePage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	
	public void aboutFedex() throws InterruptedException {
		Thread.sleep(3000);
		backAndForth.aboutFedex.click();
		Thread.sleep(3000);
	}
	
	public void seeHisLink() throws InterruptedException {
		backAndForth.seeHisBtn.click();
		Thread.sleep(3000);
		SetupDrivers.chromeDriver.navigate().back();
		SetupDrivers.chromeDriver.navigate().back();
		
	}
	
	public void aboutText() {
		
		JavascriptExecutor jse = (JavascriptExecutor)SetupDrivers.chromeDriver;
		jse.executeScript("window.scrollTo( document.body.scrollHeight,0)");
		backAndForth.aboutText.isDisplayed();
		
	}

	
	public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("FedEx")) {
			bool = true;
		}

		return bool;
	}
		public void scrollDown {
			JavascriptExecutor js = (JavascriptExecutor) chromeDriver;  
			   js.executeScript("window.scrollBy(0,1000)");
			
		}
		
		public void scrollUP {
			JavascriptExecutor js = (JavascriptExecutor) chromeDriver;  
			   js.executeScript("window.scrollBy(0,-1000)");
			
		}
	
	
}
