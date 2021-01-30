package fedex.StepDefinition;

import fedex.Actions.SignUpActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDef {

	SignUpActions signup=new SignUpActions();
	

@Given("Customer launch in Home Page of the FedEx Website")
public void customer_launch_in_Home_Page_of_the_FedEx() {	
	signup.fedExHomePage();
    
}

@When("Customer click on Sign Up")
public void customer_click_on_Sign_Up() {
	signup.SignUpLogin();
}

@When("click on Create Account")
public void click_on_Create_Account() {
	signup.creatAccount();
}

@When("Click on Open Account")
public void click_on_Open_Account() {
	signup.openAccount();
}

@When("enter First Name and Last Name")
public void enter_First_Name_and_Last_Name() {
	signup.firstNameLastName();
}

@When("enter E-mail Name and Re- enter e-mail")
public void enter_E_mail_Name_and_Re_enter_e_mail() {
	signup.email();
}

@When("enter Address and City")
public void enter_Address_and_City() {
	signup.addressandCity();
    
}

@When("enter State")
public void enter_State() {
	signup.state();
}

@When("enter ZIP and Phone Number")
public void enter_ZIP_and_Phone_Number() {
	signup.zipAndPhone();
}

@When("enter Valid User ID, Password and Re-enter Password")
public void enter_Valid_User_ID_Password_and_Re_enter_Password() {
	signup.useridPassword();
}

@When("Customer select a secret question and enter  answer")
public void customer_select_a_secret_question_and_enter_answer() {
	signup.secretQuestionAnswer();
}

@When("Customer accept terms and conditions")
public void customer_accept_terms_and_conditions() {
	signup.acceptTerms();
	
}

@When("Customer clik on continue button")
public void Customer_clik_on_continue_button() {
	signup.continueToAccount();
}

@Then("User should see the error message")
public void User_should_see_the_error_message() {
	signup.verifySignUppage();
}
}
