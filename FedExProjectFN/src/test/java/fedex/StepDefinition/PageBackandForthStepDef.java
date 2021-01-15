package fedex.StepDefinition;

import fedex.Actions.PageBackandForthActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageBackandForthStepDef {
	
	PageBackandForthActions back=new PageBackandForthActions();
	
	@Given("Customer launch in  Home Page of the FedEx")
	public void customer_launch_in_FedEx_Home_Page_https_www_fedex_com_en_us_home_html() {
		back.fedExHomePage();
	    
	}

	@When("scroll end of the page and click on aboutFedex link")
	public void scroll_end_of_the_page_and_click_on_aboutFedex_link() throws InterruptedException {
		back.aboutFedex();
	    
	}

	@When("click on see full story button and go back")
	public void click_on_see_full_story_button_and_go_back() throws InterruptedException {
		back.seeHisLink();
	    
	}

	@Then("user should be see home page")
	public void user_should_be_see_home_page() {
	    
		back.verifyHomepage();
	}
}
