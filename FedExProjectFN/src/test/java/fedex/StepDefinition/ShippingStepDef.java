package fedex.StepDefinition;

import fedex.Actions.ShippingActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingStepDef {

	ShippingActions shipaction=new ShippingActions();
	
	@Given("User lands on FedEx homepage")
	public void user_lands_on_FedEx_homepage() {
		shipaction.getFedexHomepage();
	    
	}

	@When("clicks Return A Package")
	public void clicks_Return_A_Package() {
		shipaction.clickReturnPackage();
	    
	}

	@When("clicks on creating a shipping level")
	public void clicks_on_creating_a_shipping_level() {
		shipaction.clickCreateShipmentLevel();
	    
	}


	@Then("new window will be open for shipment")
	public void new_window_will_be_open_for_shipment() {
		shipaction.verifyShippingPage();
	    
	}
}
