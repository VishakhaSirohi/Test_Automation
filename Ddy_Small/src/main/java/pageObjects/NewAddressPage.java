package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {
	
	WebDriver driver;
	
	public NewAddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "address_street") 
	private WebElement txtbx_Street;
	
	@FindBy(how = How.ID, using = "address_house_number") 
	private WebElement txtbx_HouseNumber;
	
	@FindBy(how = How.ID, using = "address_postcode")
	private WebElement txtbx_Postcode;	
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[4]/input") 
	private WebElement btn_CreateAddress;
	
	@FindBy(how = How.XPATH, using = "/html/body/a") 
	private WebElement link_Back;
	
	public void enter_Street(String street) {
		txtbx_Street.clear();
		txtbx_Street.sendKeys(street);
	}
	
	public void enter_HouseNumber(String housenumber) {
		txtbx_HouseNumber.clear();
		txtbx_HouseNumber.sendKeys(housenumber);
	}
	
	public void enter_Postcode(String postcode) {
		txtbx_Postcode.clear();
		txtbx_Postcode.sendKeys(postcode);
	}

	
	public void clickOn_CreateAddress() {
		btn_CreateAddress.submit();
	}
	
	
	public void clickOn_Back() {
		link_Back.click();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
		
	}
	
}