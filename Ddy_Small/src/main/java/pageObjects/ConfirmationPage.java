package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "/html/body/form/p[1]") 
	private WebElement names;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/p[2]") 
	private WebElement addresses;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div/input") 
	private WebElement confirm;
	
	public String get_Names() {
		String checkname= names.getText();
		return checkname;
	}
	
	public String get_Addresses() {
		String checkaddress= addresses.getText();
		return checkaddress;
	}
	
	public void clickOn_Confirm() {
		confirm.click();
	}
	
	public void goto_Create_Profile() {
		
		driver.navigate().back();
		driver.navigate().back();
	}
	
}