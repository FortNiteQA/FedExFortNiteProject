package fedex.StepDefinition;

import fedex.Actions.AllProductInfoActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllProductInfoStepDef {

AllProductInfoActions allProAct = new AllProductInfoActions();
	
	@Given("user landed on the home page")
	public void user_landed_on_the_home_page() throws InterruptedException {
	allProAct.homePage(); 
	}

	@When("click on design and print menu and click on all product")
	public void click_on_design_and_print_menu_and_click_on_all_product() throws InterruptedException {
		allProAct.designPringMenu();  
	}

	@When("click four times on carosel right arrow icon")
	public void click_four_times_on_carosel_right_arrow_icon() throws InterruptedException {
		allProAct.caroselIcon();   
	}

}
