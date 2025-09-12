package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_ResidentialOwnerOccupiedLocators {

	@FindBy(xpath = "//span[normalize-space()='Residential owner-occupied']")
	public WebElement ResidentialowneroccupiedLink;

	@FindBy(xpath = "//h1[normalize-space()='Residential mortgages']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Quick links']")
	public WebElement MastheadBlackboxHeader;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement MastheadBlackboxLink1;

	@FindBy(xpath = "//span[normalize-space()='Log in to submit business']")
	public WebElement MastheadBlackboxLink2;

	@FindBy(xpath = "//span[normalize-space()='Calculators']")
	public WebElement MastheadBlackboxLink3;

	@FindBy(xpath = "//h2[normalize-space()='Human underwriting']")
	public WebElement USPHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Self-employed specialists']")
	public WebElement USPHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Adverse credit']")
	public WebElement USPHeader3;

	@FindBy(xpath = "//h2[normalize-space()='High LTV available']")
	public WebElement USPHeader4;

	@FindBy(xpath = "//h2[@class='h2-heavy__header intermediaries-banner__header']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='For your clients with adverse credit']")
	public WebElement ImageCopyHeader2;

	@FindBy(xpath = "//a[normalize-space()='Login to submit business, or register with us']")
	public WebElement CTABanner;

	@FindBy(xpath = "//a[normalize-space()='View our latest service levels']")
	public WebElement UsefulLink1;

	@FindBy(xpath = "//a[normalize-space()='Our Platinum Broker service proposition']")
	public WebElement UsefulLink2;

	@FindBy(xpath = "//a[@aria-label='View all our residential mortgage documents']")
	public WebElement UsefulLink3;

}
