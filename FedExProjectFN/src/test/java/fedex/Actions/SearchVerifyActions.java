package fedex.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import fedex.Elements.SearchVerifyElements;
import fedex.Utilities.SetupDrivers;

public class SearchVerifyActions {

	SearchVerifyElements searchEle;
	
	public SearchVerifyActions() {		
		this.searchEle = new  SearchVerifyElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, searchEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();	
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void searchIcon() {
		
		searchEle.searchIcon.click();
	}
	
	public void searchText() {
		searchEle.searchText.sendKeys("645645645757");
		
	}

	public void enterText() {
		
		searchEle.searchText.sendKeys(Keys.ENTER);
	}
	
	
	public void errorMsg() throws InterruptedException {
		searchEle.errorMsg.getText();
		Thread.sleep(2000);
	
	}
}
