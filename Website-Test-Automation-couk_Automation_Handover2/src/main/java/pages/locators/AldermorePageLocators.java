package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AldermorePageLocators {

	// private WebDriver driver;
	// Page Factory - OR:

	// UAT- Locators

	// Masthead Homepage

	//@FindBy(xpath="//h1[normalize-space()='Backing you to achieve more']")
	//@FindBy(xpath = "//*[contains(normalize-space(.), 'Backing you to achieve more')]")
	//public WebElement mastheadHomepageHeader;
	@FindBy(xpath = "//*[contains(@class,'masthead')]//h1]")
	public WebElement mastheadHomepageHeader;
	//--------------------
	//@FindBy(xpath = "//*[contains(@class,'masthead')]//h1")
	//public WebElement mastheadHomepageHeader;
	//--------------------trupti keep in mind to validate this once 
	
	//public WebElement mastheadHeader;


	@FindBy(xpath = "//p[@class='masthead_homepage__description']")
	public WebElement mastheadHomepageDescription;

	@FindBy(xpath = "//button[@class='masthead_homepage_container__scrolldown'] ")
	public WebElement mastheadHomepageScrollDownButton;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;

	// Unique Selling points

	@FindBy(xpath = "//h2[contains(text(),'Proud to be different.')]")
	public WebElement uniqueSellingPointHeader;

	@FindBy(xpath="//h3[normalize-space()='Promoting inclusivity']")
	public WebElement UniqueSellingpointPromotinginclusivity;

	@FindBy(xpath="//h3[normalize-space()='Distinctly human']")
	public WebElement UniqueSellingpointDistinctivelyhumanSubHeader;

	@FindBy(xpath="//h3[normalize-space()='Enabling ambition']")
	public WebElement UniqueSellingpointEnablingambitionSubHeader;

	@FindBy(xpath = "//p[contains(text(),'Trusted, simple and FSCS protected savings account')]")
	public WebElement UniqueSellingpointAwardWinningSubDesc;

	@FindBy(xpath = "//p[contains(text(),'Our dedicated team look at every application indiv')]")
	public WebElement UniqueSellingpointDistinctivelyhumanDesc;

	@FindBy(xpath = "//p[contains(text(),'A flexible range of finance solutions and expert s')]")
	public WebElement UniqueSellingpointBackingbusinessesDesc;

	// Savings Block

	@FindBy(xpath = "//a[normalize-space()='Savings']")
	public WebElement SavingsBlockCTAButton;

	@FindBy(xpath = "//h2[normalize-space()='Savings']")
	public WebElement SavingsBlockHeader;

	// Mortgage Block

	@FindBy(xpath = "//h2[normalize-space()='Mortgages']")
	public WebElement MortgageBlockHeader;

	@FindBy(xpath = "//a[@class='ald-cta ald-cta-primary ald-focus__button']")
	public WebElement MortgageBlockCTAButton;

	// Business Finance Section

	@FindBy(xpath = "//h2[normalize-space()='Business finance']")
	public WebElement businessFinanceHeader;

	@FindBy(xpath = "//a[@class='ald-cta ald-cta-secondary-light ald-focus__button'][normalize-space()='Business finance']")
	public WebElement businessFinanceCTAButton;

	// Intermediaries Banner

	@FindBy(xpath = "//h2[normalize-space()='Intermediaries']")
	public WebElement IntermediariesBannerHeader;

	@FindBy(xpath = "//a[normalize-space()='Find out more']")
	public WebElement IntermediariesBannerLink;

}
