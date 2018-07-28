package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SignInPage;

public class SignInPageSteps {
	
	TestContext testContext;
	SignInPage signInPage;
	
	public SignInPageSteps(TestContext context) {
		testContext = context;
		signInPage = testContext.getPageObjectManager().getSignInPage();
	}
	
	
	@Given("^user is on SignIn Page$")
	public void user_is_on_SignIn_Page() {
		signInPage.navigateToHome();
	}

	@When("^he clicks on Register link$")
	public void he_clicks_on_Register_link() throws InterruptedException{
	    signInPage.clickOn_Register();
	    Thread.sleep(1000);
	    }
	@Then("^user should get the Failure message$")
	public void user_should_get_the_Failure_message(String failure)throws Throwable {
	    String msg=signInPage.get_EmailError();
	    assertEquals(failure, msg);
	}


    @When("^enter email (.+) on SignIn page$")
    public void enter_email_on_signin_page(String email) throws Throwable {
        signInPage.enter_Email(email);
    }

    @Then("^user checks the details (.+)$")
    public void user_checks_the_details(String outputemail) throws Throwable {
        String email = signInPage.get_Details();
        Assert.assertEquals(outputemail,email);
    }

    @And("^enter Password (.+) on SignIn page$")
    public void enter_password_on_signin_page(String password) throws Throwable {
        signInPage.enter_Password(password);
    }

    @When("^clicks on SignIn Button$")
    public void clicks_on_signin_button() throws Throwable {
        signInPage.clickOn_SignIn();
    }

}