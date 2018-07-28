package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {
	
	WebDriver driver;
	public SuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"notice\"]") 
	private WebElement successfullMessage;
	
	@FindBy(how = How.XPATH, using = "/html/body/p[2]") 
	private WebElement emailCheck;
	
	@FindBy(how = How.XPATH, using = "/html/body/p[3]") 
	private WebElement names;
	
	@FindBy(how = How.XPATH, using = "/html/body/p[4]") 
	private WebElement addresses;
	
	@FindBy(how = How.XPATH, using = "/html/body/a") 
	private WebElement signOut;
	
	
	public String get_Message() {
		String message= successfullMessage.getText();
		return message;
	}
	
	public String get_Email() {
		String email= emailCheck.getText();
		return email;
	}
	
	public String get_Names() {
		String checkname= names.getText();
		return checkname;
	}
	
	public String get_Addresses() {
		String checkaddress= addresses.getText();
		return checkaddress;
	}
	
	public void clickOn_SignOut() {
		signOut.click();
	}
	
	public String getUrl () {
		return driver.getCurrentUrl();
	}
	
}