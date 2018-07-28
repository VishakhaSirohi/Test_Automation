package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "account_email") 
	private WebElement txtBox_Email;
	
	@FindBy(how = How.ID, using = "account_password_digest") 
	private WebElement txtBox_Password;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/input") 
	private WebElement btn_CreateAccount;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"error_explanation\"]/ul/li") 
	private WebElement email_Error;
	
	
    public void enter_Email(String email) {
	   txtBox_Email.sendKeys(email);
	}
    
	public void enter_Password(String password) {
		txtBox_Password.sendKeys(password);
	}
	
	public void clickOn_CreateAccount() {
		btn_CreateAccount.submit();
	}
	
	public String get_EmailError() {
		return email_Error.getText();
	}
	
}