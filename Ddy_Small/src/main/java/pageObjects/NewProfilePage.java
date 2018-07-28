package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class NewProfilePage {
	WebDriver driver;
	
	public NewProfilePage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "#profile_name") 
	private WebElement txtbx_FirstName;
	
	@FindBy(how = How.CSS, using = "#profile_surname") 
	private WebElement txtbx_LastName;
	
	@FindBy(how = How.CSS, using = "#profile_date_of_birth_1i") 
    private static WebElement drpdwn_Year;
    
    @FindBy(how = How.CSS, using = "#profile_date_of_birth_2i") 
    private static WebElement drpdwn_Month;
    
    @FindBy(how = How.CSS, using = "#profile_date_of_birth_3i") 
    private static WebElement drpdwn_Date;
	
	@FindBy(how = How.CSS, using = "body > form > div.actions > input[type=\"submit\"]") 
	private WebElement btn_CreateProfile;
	
	@FindBy(how = How.CSS, using = "body > a") 
	private WebElement link_Back;
	
	public void enter_Name(String name) {
		txtbx_FirstName.clear();
		txtbx_FirstName.sendKeys(name);
	}
	
	public void enter_LastName(String lastName) {
	    txtbx_LastName.clear();
		txtbx_LastName.sendKeys(lastName);
	}

	public void enter_Year(String inputYear) {
	Select year = new Select (drpdwn_Year);
    year.selectByValue(inputYear);
	}
	
	public void enter_Month(String inputMonth) {
    Select month = new Select (drpdwn_Month);
    month.selectByValue(inputMonth);
    }
    
	public void enter_Date(String inputDate) {
	Select date = new Select (drpdwn_Date);
    date.selectByValue(inputDate);

	}

	public void clickOn_CreateProfile() {
		btn_CreateProfile.submit();
	}
	
	
	public void clickOn_Back() {
		link_Back.click();
	}
	
	public String getUrl () {
		return driver.getCurrentUrl();
	}
	
}