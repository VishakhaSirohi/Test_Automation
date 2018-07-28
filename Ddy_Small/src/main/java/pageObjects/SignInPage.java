package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;

public class SignInPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public SignInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	@FindBy(how = How.CSS, using = "#account_email") 
	private WebElement txtBox_Email;
	
	@FindBy(how = How.CSS, using = "#account_password_digest") 
	private WebElement txtBox_Password;
	
	@FindBy(how = How.CSS, using = "body > form > div.actions > input[type=\"submit\"]") 
	private WebElement signIn;
	
	@FindBy(how = How.CSS, using = "body > p:nth-child(2)") 
	private WebElement details;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/a") 
	private WebElement register;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"error_explanation\"]/ul/li") 
	private WebElement email_Error;
	
	public void navigateToHome() {
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
	
	public void enter_Email(String email) {
	   txtBox_Email.sendKeys(email);
	}
	    
	public void enter_Password(String password) {
		txtBox_Password.sendKeys(password);
	}
		
	public void clickOn_SignIn() {
		signIn.submit();
	}	

	public void clickOn_Register() {
		register.click();
	}
	
	public String get_EmailError() {
		return email_Error.getText();
	}
	
	public String get_Details() {
		return details.getText();
	}
}