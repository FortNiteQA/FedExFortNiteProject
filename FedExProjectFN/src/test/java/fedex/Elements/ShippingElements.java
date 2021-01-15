package fedex.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingElements {

	@FindBy(xpath = "/html/body/main/div/div[3]/div[4]/div/table[2]/thead/tr/th[4]/div[3]/div/a")
	public WebElement returnPackage;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[4]/div/div[2]/div[13]/div/a")
	public WebElement shippingLevel;
	
}
