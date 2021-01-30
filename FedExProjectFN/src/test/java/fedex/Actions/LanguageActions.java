package fedex.Actions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import fedex.Elements.LanguageElements;
import fedex.Utilities.SetupDrivers;

public class LanguageActions {


	LanguageElements langEle ;
	
	
	public LanguageActions() {		
		this.langEle = new  LanguageElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, langEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void languageBtn() throws InterruptedException {
		langEle.language.click();
		Thread.sleep(2000);
	}
	
	
	public void selectLang() throws InterruptedException {
		
		
		
		langEle.selectEspaniol.click();
		Thread.sleep(2000);
		
	}
	
	public void espaniolText() throws InterruptedException {
		langEle.spanishText.isDisplayed();
		Thread.sleep(2000);
		
	}


}
