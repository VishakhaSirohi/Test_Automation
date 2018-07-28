package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.NewProfilePage;


public class NewProfilePageSteps {
	TestContext testContext;
	NewProfilePage newProfilePage;
	
	public NewProfilePageSteps(TestContext context) {
		testContext = context;
		newProfilePage = testContext.getPageObjectManager().getNewProfilePage();
	}
	
	@When("^enter Name (.*) on Profile page$")
    public void enter_name_on_profile_page(String name){
	    newProfilePage.enter_Name(name);
	}

	@When("^enter Surname (.*) on Profile page$")
	public void enter_SurName_on_Profile_page(String surname)  {
	    newProfilePage.enter_LastName(surname);
	}

	@When("^select Year (.*) on Profile page$")
    public void select_year_on_profile_page(String year){
	    newProfilePage.enter_Year(year);
	}
	
	@When("^select Month (.*) on Profile page$")
    public void select_month_on_profile_page(String month) {
        newProfilePage.enter_Month(month);
    }
	
	@When("^select Date (.*) on Profile page$")
    public void select_date_on_profile_page(String date) {
        newProfilePage.enter_Date(date);
    }


	@When("^clicks on CreateProfile Button$")
	public void clicks_on_CreateProfile_Button() throws InterruptedException {
	    newProfilePage.clickOn_CreateProfile();
	    Thread.sleep(1000);
	}
	
    @Then("^user should get the failure (.*) message on New Profile Page$")
    public void user_should_get_the_failure_message_on_new_profile_page(String failure){
        String url = newProfilePage.getUrl();
        Assert.assertEquals("System should have given error: "+ failure+ ", but it did not.", "http://localhost:3000/profiles/new", url);
        }

}