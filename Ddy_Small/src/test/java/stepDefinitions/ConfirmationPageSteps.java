package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ConfirmationPage;


public class ConfirmationPageSteps {
	
	TestContext testContext;
	ConfirmationPage confirmationPage;
	
	public ConfirmationPageSteps(TestContext context) {
		testContext = context;
		confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
	}
	
	@Then("^user checks Names (.*) field$")
	public void user_checks_Names_field(String outputName) throws Throwable {
	   String name=confirmationPage.get_Names();
	   Assert.assertTrue("Incorrect name", name.contains(outputName));
	}



	@And("^user checks Addresses (.*) field$")
	public void user_checks_Addresses_field(String outputAddress) throws Throwable {
		   String address=confirmationPage.get_Addresses();
		   Assert.assertTrue("Incorrect address", address.contains(outputAddress));
	}

	@And("^clicks on Confirm Button$")
	public void clicks_on_Confirm_Button() throws Throwable {
		confirmationPage.clickOn_Confirm();
		Thread.sleep(1000);
	}
	
	 @When("^User goes back to Create Profile page$")
	    public void user_goes_back_to_create_profile_page() throws Throwable {
	        confirmationPage.goto_Create_Profile();
	    }

}