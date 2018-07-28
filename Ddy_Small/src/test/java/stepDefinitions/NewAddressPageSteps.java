package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.NewAddressPage;

public class NewAddressPageSteps {
	
	TestContext testContext;
	NewAddressPage newAddressPage;
	
	public NewAddressPageSteps(TestContext context) {
		testContext = context;
		newAddressPage = testContext.getPageObjectManager().getNewAddressPage();
	}
	
	@When("^enter Street (.*) on Address page$")
	public void enter_Street_on_Address_page(String street)  {
	    newAddressPage.enter_Street(street);
	}

	@When("^enter House Number (.*) on Address page$")
	public void enter_HouseNumber_on_Address_page(String housenumber)  {
	    newAddressPage.enter_HouseNumber(housenumber);
	}

	@When("^enter Post Code(.*) on Address page$")
	public void enter_PostCode_on_Address_page(String postcode)  {
	    newAddressPage.enter_Postcode(postcode);
	}

	@When("^clicks on CreateAddress Button$")
	public void clicks_on_CreateAddress_Button() throws InterruptedException  {
	    newAddressPage.clickOn_CreateAddress();
	    Thread.sleep(1000);
	}
	
	 @Then("^user should get the failure (.*) message on New Address Page$")
	public void user_should_get_the_failure_message_on_New_Address_Page(String failure){
		String url = newAddressPage.getUrl();
        Assert.assertEquals("System should have given error: "+ failure+ ", but it did not.", "http://localhost:3000/addresses/new", url);
        }
	 
	 @When("^user click on the back link$")
	 public void user_click_on_the_back_link() throws Throwable {
	     newAddressPage.clickOn_Back();
	 }
	 
	 @Then("^user should be on New profile page$")
	    public void user_should_be_on_new_profile_page() throws Throwable {
	        String url1=newAddressPage.getUrl();
	        Assert.assertEquals("User is on incorrect page: ", "http://localhost:3000/profiles/new", url1);
	        
	    }
	}

