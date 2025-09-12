package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneYearFixedRateCashISALocators {

	@FindBy(className = "masthead-medium__header")
	public WebElement OneYearFixedRateISAHeader;

	// Product Card

	@FindBy(className = "product-section-savings__rate-label")
	public WebElement InterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[1]")
	public WebElement GrossMonthlyInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[2]")
	public WebElement GrossAnnualInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__sub-header-caption'])[1]")
	public WebElement OpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='1 year']")
	public WebElement TermValue;

	// Product Summary FAQ

	@FindBy(xpath="//h2[normalize-space()='Summary box']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath = "//div[@class='section-body']//div[@class='text-block text-block-grey']")
	public WebElement ProductSummaryAccordianTextBox;

	// CTA Banner

	@FindBy(xpath="//a[normalize-space()='Apply now for a 1 year fixed rate cash ISA']")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Eligibility']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader2;

	@FindBy(xpath = "//h2[normalize-space()='ISA Transfers']")
	public WebElement ImageCopyHeader3;

	// Cash ISA FAQs

	@FindBy(xpath = "//h2[normalize-space()='Cash ISA FAQs']")
	public WebElement CashISAFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='How many Cash ISAs can I have?']")
	public WebElement CashISAFAQccordian;

	@FindBy(xpath = "//p[contains(text(),'You can split your annual ISA allowance across the')]")
	public WebElement CashISAFAQAccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath = "//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement MoreCardHelpSupportLink;

	// Cards- Cash ISA Summary box

	@FindBy(xpath = "//h2[normalize-space()='Fixed rate cash ISAs summary box']")
	public WebElement SummaryBoxCardHeader;

	@FindBy(xpath="//a[@aria-label='Download Personal Savings Terms and Conditions']")
	public WebElement SummaryBoxCardDownloadLink;

	// Cards-Personal Savings

	@FindBy(xpath = "//h2[normalize-space()='Personal Savings Terms and Conditions']")
	public WebElement PersonalSavingsCardHeader;

	@FindBy(xpath = "(//a[@class='card-download__a bold ald-focus ald-underline-hover'])[2]")
	public WebElement PersonalSavingsCardDownloadLink;
	
	//Masthead black box
	
	@FindBy(xpath="//a[normalize-space()='Log in']")
	public WebElement loginLinkBlackbox;
	
	@FindBy(xpath="//a[normalize-space()='Apply now']")
	public WebElement applyNow;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
