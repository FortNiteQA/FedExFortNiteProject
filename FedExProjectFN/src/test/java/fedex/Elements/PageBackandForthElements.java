package fedex.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageBackandForthElements {

	@FindBy(xpath = "//a[contains(text(),'About FedEx')]")
	public WebElement aboutFedex;
	
	@FindBy(xpath = "//a[contains(text(),'See full history')]")
	public WebElement seeHisBtn;
	
	
	@FindBy(xpath = "//h1[contains(text(),'About us')]")
	public WebElement aboutText;
	
}
