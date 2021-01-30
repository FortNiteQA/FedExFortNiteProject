package fedex.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingElements {

	@FindBy(xpath = "/html/body/main/div/div[3]/div[5]/div/table[2]/thead/tr/th[4]/div[3]/div/a")
	public WebElement returnPkg;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[6]/div/div[2]/div[13]/div/a")
	public WebElement createLabel;
	
	@FindBy(xpath = "//input[@id='fx-from-name']")
	public WebElement yourName;
	
	@FindBy(xpath = "//input[@id='fx-to-name']")
	public WebElement returnName;
	
	@FindBy(xpath = "//button[@id='fx-address-button']")
	public WebElement continueButton;
	
	@FindBy(xpath = "//*[@id=\"fx-from-hideable-addr-section\"]/div[6]/span")
	public WebElement errorMsg;
}
