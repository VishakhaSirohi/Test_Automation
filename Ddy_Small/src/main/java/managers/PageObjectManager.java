package managers;



import org.openqa.selenium.WebDriver;

import pageObjects.ConfirmationPage;
import pageObjects.NewAddressPage;

import pageObjects.NewProfilePage;



import pageObjects.RegisterPage;

import pageObjects.SignInPage;
import pageObjects.SuccessPage;



public class PageObjectManager {

	private WebDriver driver;

	private SignInPage signInPage;

	private NewAddressPage newAddressPage;

	private RegisterPage registerPage;

	private NewProfilePage newProfilePage;
	
	private ConfirmationPage confirmationPage;
	
	private SuccessPage successPage;
	
	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public SignInPage getSignInPage(){

		return (signInPage == null) ? signInPage = new SignInPage(driver) : signInPage;

	}

	

	public RegisterPage getRegisterPage() {

		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;

	}

	

	public NewAddressPage getNewAddressPage() {

		return (newAddressPage == null) ? newAddressPage = new NewAddressPage(driver) : newAddressPage;

	}

	

	public NewProfilePage getNewProfilePage() {

		return (newProfilePage == null) ? newProfilePage = new NewProfilePage(driver) : newProfilePage;

	}
	
	public ConfirmationPage getConfirmationPage() {

		return (confirmationPage == null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;

	}
	
	public SuccessPage getSuccessPage() {

		return (successPage == null) ? successPage = new SuccessPage(driver) : successPage;

	}
}