package fedex.StepDefinition;

import fedex.Actions.TrackingActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class TrackingStepDef {

		TrackingActions trackingAct = new TrackingActions();
	
		@Given("user navigate the homepage")
		public void user_navigate_the_homepage() {
			trackingAct.pageOpen();
		}

		@When("click on print and tracking menu")
		public void click_on_print_and_tracking_menu() {
			trackingAct.trackingLink();
		}

		@When("enter the tracking number as {string}")
		public void enter_the_tracking_number_as(String string) {
			trackingAct.trackingText();
		}

		@When("click on tracking button")
		public void click_on_tracking_button() throws InterruptedException {
			trackingAct.trackingBtn();
		}

		@Then("It shows tracking details")
		public void it_shows_tracking_details() {
			
		}
}
