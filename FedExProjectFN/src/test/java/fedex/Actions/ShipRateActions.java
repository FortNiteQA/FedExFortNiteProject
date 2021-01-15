package fedex.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import fedex.Elements.ShipRateElements;
import fedex.Utilities.SetupDrivers;

public class ShipRateActions {

ShipRateElements rateEle;
	
	public ShipRateActions() {		
		this.rateEle = new  ShipRateElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, rateEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}

	
	public void shipRate() {
		
		rateEle.rateShip.click();
	}
	
	
	public void from() throws InterruptedException {
		rateEle.from.sendKeys("Norwich , CT , USA ");
		Thread.sleep(2000);
		rateEle.from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		rateEle.from.sendKeys(Keys.ENTER);
		
	}
	
	public void to() throws InterruptedException {
		rateEle.to.sendKeys("Queens County, 11417, United States");
		Thread.sleep(3000);
		rateEle.to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		rateEle.to.sendKeys(Keys.RETURN);
		
	}
	
	public void check() {
		rateEle.checkBox.isDisplayed();
		rateEle.checkBox.click();
		
		//JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
		//js.executeScript("arguments[0].click();", rateEle.checkBox);
		
		
		
	}
	
	public void selectPkg() {
		
		Select s1 = new Select(rateEle.pkgOpt);
		s1.selectByVisibleText("Your Packaging");
	}
	
	public void pkgNum() {
		
		Select s2 = new Select(rateEle.pkgNum);
		s2.selectByVisibleText("2");
	}
	
	public void pkgWeight() {
		
		rateEle.lb.sendKeys("3");
	}
	
	
	public void length() {
		rateEle.length.sendKeys("5");
		
	}
	
	
	public void weight() {
		rateEle.weight.sendKeys("3");
		
	}
	public void height() {
		
		rateEle.height.sendKeys("4");
	}
	
	
	
	public void shipDate() {
		Select s3 = new Select(rateEle.shipDate);
		s3.selectByVisibleText("Tuesday , January 12,2021");
		
	}
	
	public void showRateBtn() {
		
		rateEle.showRate.click();
	}
	
	public void showRateMsg() {
		
		
	}
	
}
