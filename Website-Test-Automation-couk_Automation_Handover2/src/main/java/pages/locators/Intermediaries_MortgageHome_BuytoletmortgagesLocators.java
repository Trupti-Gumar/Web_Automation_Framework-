package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_BuytoletmortgagesLocators {

	@FindBy(xpath = "//span[normalize-space()='Buy to let mortgages']")
	public WebElement BuytoletmortgagesLink;

	@FindBy(xpath = "//h1[normalize-space()='Buy to let mortgages']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Quick links']")
	public WebElement MastheadBlackboxHeader;

	@FindBy(xpath = "//span[normalize-space()='Products and rates - download documents']")
	public WebElement MastheadBlackboxLink1;

	@FindBy(xpath = "//span[normalize-space()='Affordability calculator']")
	public WebElement MastheadBlackboxLink2;

	@FindBy(xpath = "//span[normalize-space()='Log in to submit business']")
	public WebElement MastheadBlackboxLink3;

	@FindBy(xpath = "//h2[normalize-space()='Buy to let for limited companies']")
	public WebElement USPHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Multiple properties on one application']")
	public WebElement USPHeader2;

	@FindBy(xpath = "//h2[normalize-space()='We lend on most property types']")
	public WebElement USPHeader3;

	@FindBy(xpath = "//h2[normalize-space()='Buy to let mortgages for smaller landlords']")
	public WebElement USPHeader4;

	@FindBy(xpath = "//h2[@class='h2-heavy__header intermediaries-banner__header']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='For your clients with adverse credit']")
	public WebElement ImageCopyHeader2;

	@FindBy(xpath = "//a[normalize-space()='Login to submit business, or register with us']")
	public WebElement CTABanner;

	@FindBy(xpath = "//a[@aria-label='Platinum Broker service proposition']")
	public WebElement UsefulLink1;

	@FindBy(xpath = "//a[@aria-label='View our latest updates and news']")
	public WebElement UsefulLink2;

	@FindBy(xpath = "//a[@aria-label='Product switch']")
	public WebElement UsefulLink3;
	
	@FindBy(xpath="//h2[normalize-space()='View all buy to let documents']")
	public WebElement ViewallbuytoletdocumentsHeader;
	
	@FindBy(xpath="//a[contains(text(),'Buy to let documents')]")
	public WebElement ViewallbuytoletdocumentsCardLink;
	
	@FindBy(xpath="//h2[normalize-space()='Residential mortgages broker portal']")
	public WebElement ResidentialmortgagesbrokerportalLoginCardHeader;
	
	@FindBy(xpath="//a[@data-parent-title='Residential mortgages broker portal']")
	public WebElement ResidentialmortgagesbrokerportalLoginCardLink;
	
	@FindBy(xpath="//h2[normalize-space()='Specialist buy to let mortgage portal']")
	public WebElement SpecialistbuytoletLoginCardHeader;
	
	@FindBy(xpath="//a[@data-parent-title='Specialist buy to let mortgage portal']")
	public WebElement SpecialistbuytoletLoginCardLink;

}
