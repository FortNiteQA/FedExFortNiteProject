package fedex.StepDefinition;

import fedex.Actions.CouponPdfActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CouponPdfStepDef {

	CouponPdfActions cuponAct = new CouponPdfActions();
	
	@Given("user navigate the url of fedex")
	public void user_navigate_the_url_of_fedex() {
		cuponAct.pageOpen();
	}
	
	@When("click on print and design menu , select get cupon and deals")
	public void click_on_print_and_design_menu_select_get_cupon_and_deals() {
		cuponAct.menuSubmenu();
	    
	}

	@When("click on get cupon button")
	public void click_on_get_cupon_button() throws InterruptedException {
		cuponAct.getCupon();    
	}
	//
	@Then("Pdf file in new window should open")
	public void Pdf_file_in_new_window_should_open() {
		cuponAct.verifyCouponPdfpage();
	}
}
