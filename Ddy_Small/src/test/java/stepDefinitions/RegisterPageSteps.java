package stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RegisterPage;

public class RegisterPageSteps {
	
	TestContext testContext;
	RegisterPage registerPage;
	
	public RegisterPageSteps(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}

	@When("^enter email (.*) on Register page$")
    public void enter_email_on_register_page(String email){
	    registerPage.enter_Email(email);
	    
	}

	@When("^enter Password (.*) on Register page$")
    public void enter_password_on_register_page(String password){
	    registerPage.enter_Password(password);
	}

	@When("^clicks on CreateAccount Button$")
	public void clicks_on_CreateAccount_Button() throws InterruptedException{
	   registerPage.clickOn_CreateAccount();
	   Thread.sleep(1000);
	}
	
	/*@When("^enter empty email  on Register page$")
	public void enter_email_on_Register_page() throws Throwable {
		registerPage.enter_Email("");
	}*/
	
	@Then("^user should get the failure (.*) message$")
	public void user_should_get_the_failure_message(String failure) throws Throwable {
	    String msg=registerPage.get_EmailError();
	    assertEquals(failure, msg);
	    }
	
	
}