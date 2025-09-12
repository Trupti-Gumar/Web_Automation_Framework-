package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpAndSupport_BankOfEnglandBaseRateLocators {

	@FindBy(xpath = "//span[normalize-space()='Savings']")
	public WebElement SavingsLink;
	
	@FindBy(xpath="//a[@data-parent-title='Savings'][normalize-space()='Help and support']")
	public WebElement helpAndSupportLink;

	@FindBy(xpath="//a[normalize-space()='Find out more']")
	public WebElement BankOFEnglandBaseRate;

	// Masthead small

	@FindBy(xpath = "//h1[normalize-space()='Bank of England base rate changes']")
	public WebElement MastheadHeader;

	// Accordian

	@FindBy(xpath = "//h2[normalize-space()='Information for Aldermore customers']")
	public WebElement AccordianHeader;

	@FindBy(xpath = "//h3[normalize-space()='Mortgage customers']")
	public WebElement AccordianLink;

	@FindBy(xpath="//strong[contains(text(),'Existing customers with mortgages linked to the Ba')]")
	public WebElement AccordianLinkTextBlock;

	// Cards

	@FindBy(xpath = "//h2[normalize-space()='Personal savings help and support']")
	public WebElement PersonalsavingshelpandsupportCardHeader;

	@FindBy(xpath = "//a[normalize-space()='Personal savings help and support']")
	public WebElement PersonalsavingshelpandsupportCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Mortgages help and support']")
	public WebElement MortgageshelpandsupportCardHeader;

	@FindBy(xpath = "//a[normalize-space()='Mortgages help and support']")
	public WebElement MortgageshelpandsupportCardLink;

}
