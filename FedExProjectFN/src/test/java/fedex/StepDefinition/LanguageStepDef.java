package fedex.StepDefinition;

import fedex.Actions.LanguageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguageStepDef {
	
	LanguageActions langAct = new LanguageActions();
	@Given("customer is in homepage")
	public void customer_is_in_homepage() {
		langAct.pageOpen();
	}
	
	@When("scroll end of the page and click on language")
	public void scroll_end_of_the_page_and_click_on_language() throws InterruptedException {
		langAct.languageBtn();
	  
	}

	@When("select espaniol")
	public void select_espaniol() throws InterruptedException {
	    
		langAct.selectLang();
	}

	@Then("displayed spanish language")
	public void displayed_spanish_language() throws InterruptedException {
	    
		langAct.espaniolText();
	}

}
