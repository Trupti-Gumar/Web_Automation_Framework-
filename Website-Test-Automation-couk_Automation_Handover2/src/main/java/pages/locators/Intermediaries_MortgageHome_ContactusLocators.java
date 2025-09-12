package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_ContactusLocators {

	@FindBy(xpath = "//span[normalize-space()='Contact us']")
	public WebElement ContactusLink;

	@FindBy(xpath = "//h1[normalize-space()='Contact us - residential and buy to let mortgages']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath = "//h2[normalize-space()='New and existing case enquiries']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Find your Relationship Manager - new enquiries']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Other contact information']")
	public WebElement CardHeader3;
	
	
}
