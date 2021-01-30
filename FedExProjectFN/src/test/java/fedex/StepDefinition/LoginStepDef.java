package fedex.StepDefinition;

import fedex.Actions.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	LoginActions loginAction = new LoginActions();
	
	@Given("Customer land on Fedex Homepage")
	public void customer_land_on_Fedex_Homepage() {

	loginAction.getFedexHomepage();
	loginAction.verifyHomepage();
	}

	@When("customer clicks on Signup or login")
	public void customer_clicks_on_Signup_or_login() {

	loginAction.SignuporLogin();
	}

	@When("customer enter as {string}")
	public void customer_enter_as(String userid) {

	loginAction.inputUserName(userid);
	}

	@When("Customer enters {string}")
	public void customer_enters (String password) {

	loginAction.inputPassword(password);
	}

	@Then("Customer able to Login Successfully")
	public void customer_able_to_Login_Successfully() throws InterruptedException {
	loginAction.clickLoginBtn();
	Thread.sleep(4000);

	}
}
