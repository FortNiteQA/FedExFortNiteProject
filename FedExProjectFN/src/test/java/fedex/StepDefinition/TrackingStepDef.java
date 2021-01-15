package fedex.StepDefinition;

import fedex.Actions.TrackingActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TrackingStepDef {

TrackingActions trackingAct = new TrackingActions();
	
	@Given("user navigate the homepage")
	public void user_navigate_the_url_of_fedex() {
		trackingAct.pageOpen();
}

	@When("click on print and tracking menu")
	public void click_on_print_and_tracking_menu() {
		trackingAct.trackingLink();
	    
	}

	@When("Input the tracking number")
	public void input_the_tracking_number() {
	    
		trackingAct.trackingText();
	}

	@When("click on tracking button")
	public void click_on_tracking_button() {
	    
		trackingAct.trackingBtn();
	}
}
