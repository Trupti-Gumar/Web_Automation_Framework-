package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_MultipropertybuytoletmortgagesLocators {

	@FindBy(xpath = "//span[normalize-space()='Multi property buy to let']")
	public WebElement MultipropertybuytoletmortgagesLink;

	@FindBy(xpath = "//h1[normalize-space()='Multi property buy to let mortgages']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Quick links']")
	public WebElement MastheadBlackboxHeader;

	@FindBy(xpath = "//span[normalize-space()='Products and rates - download documents']")
	public WebElement MastheadBlackboxLink1;

	@FindBy(xpath = "//span[normalize-space()='Calculators']")
	public WebElement MastheadBlackboxLink2;

	@FindBy(xpath = "//span[normalize-space()='Log in to submit business']")
	public WebElement MastheadBlackboxLink3;

	@FindBy(xpath = "//h2[normalize-space()='One application']")
	public WebElement USPHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Packaging and underwriting']")
	public WebElement USPHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Expert team']")
	public WebElement USPHeader3;

	@FindBy(xpath = "//h2[@class='h2-heavy__header intermediaries-banner__header']")
	public WebElement ImageCopyHeader1;
	
	@FindBy(xpath = "//h2[normalize-space()='View our latest turnaround times']")
	public WebElement UsefulLinkHeader1;

	@FindBy(xpath = "//a[normalize-space()='Our latest service levels']")
	public WebElement UsefulLink1;

	@FindBy(xpath = "//h2[normalize-space()='Product and eligibility guides']")
	public WebElement UsefulLinkHeader2;
	
	@FindBy(xpath = "//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Buy to let mortgage documents']")
	public WebElement UsefulLink2;
	
	@FindBy(xpath = "//h2[normalize-space()='Affordability calculators']")
	public WebElement UsefulLinkHeader3;

	@FindBy(xpath = "//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Calculators']")
	public WebElement UsefulLink3;

	@FindBy(xpath="//h2[normalize-space()='Specialist buy to let mortgage portal']")
	public WebElement SpecialistbuytoletLoginCardHeader;
	
	@FindBy(xpath="//a[@data-parent-title='Specialist buy to let mortgage portal']")
	public WebElement SpecialistbuytoletLoginCardLink;

}
