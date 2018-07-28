package stepDefinitions;

import static org.junit.Assert.*;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.SuccessPage;


public class SuccessPageSteps {
	
	TestContext testContext;
	SuccessPage successPage;
	
	public SuccessPageSteps(TestContext context) {
		testContext = context;
		successPage = testContext.getPageObjectManager().getSuccessPage();
	}
	
	@Then("^user should get the Success message$")
	public void user_should_get_the_Success_message() throws Throwable {
		String message = successPage.get_Message();
		assertEquals("Successfully registered", message);
		
	}
	
	@And("^user clicks on signout$")
    public void user_clicks_on_signout() throws Throwable {
        successPage.clickOn_SignOut();
    }
	
	@And("^checks user get back on signin page$")
    public void checks_user_get_back_on_signin_page() throws Throwable {
		Thread.sleep(2000);
		String url1=successPage.getUrl();
        Assert.assertEquals("User is on incorrect page: ", "http://localhost:3000/sign_in", url1);
        
    }


}