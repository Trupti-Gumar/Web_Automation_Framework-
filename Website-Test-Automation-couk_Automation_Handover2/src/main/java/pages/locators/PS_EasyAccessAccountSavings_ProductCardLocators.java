package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PS_EasyAccessAccountSavings_ProductCardLocators {
	
	@FindBy(xpath="//div[contains(text(),'Read more & apply')]")
	public WebElement EasyAccessAccountViewButton;

	// Masthead_Medium

	@FindBy(xpath = "//h1[normalize-space()='Easy access account issue 15']")
	public WebElement EasyAccessAccountHeader;

	// Masthead Black box

	@FindBy(xpath = "//h3[normalize-space()='New customers']")
	public WebElement MastheadBlackBoxHeader;

	@FindBy(xpath = "//h4[normalize-space()='Existing customers']")
	public WebElement MastheadBlackBoxSecondaryTitle;
	
	@FindBy(xpath="//a[normalize-space()='Apply now']")
	public WebElement ApplyButton;
	
	@FindBy(xpath="//a[normalize-space()='Log in']")
	public WebElement LoginLink;

	// FiveYearFixedRateAccountCard

	@FindBy(xpath = "//span[@class='product-section-savings__rate-label']")
	public WebElement InterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[1]")
	public WebElement GrossMonthlyInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[2]")
	public WebElement GrossAnnualInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__sub-header-caption'])[1] ")
	public WebElement OpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='N/A']")
	public WebElement TermValue;

	// FAQ-Product Summary

	@FindBy(xpath="//h2[normalize-space()='Summary box']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath = "//div[@class='section-body']//div[@class='text-block text-block-grey']")
	public WebElement ProductSummaryAccordianTextBox;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader1;

	// Fixed_rate_business_savings_accounts_FAQs

	@FindBy(xpath="//h2[normalize-space()='Easy access account FAQs']")
	public WebElement EasyAccessAccountFAQHeader;

	@FindBy(xpath="//h3[normalize-space()='What do I need to open a easy access account?']")
	public WebElement EasyAccessAccountFAQAccordian;

	@FindBy(xpath="//p[contains(text(),'You simply need to be aged 18 years or over, resid')]")
	public WebElement EasyAccessAccountFAQAccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button ald_more_card_analytics']")
	public WebElement MoreCardHelpSupportLink;

	// Yellow CTA Banner

	@FindBy(xpath="//a[normalize-space()='Apply now for an easy access savings account']")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;

	// Cards-Summary box

	@FindBy(xpath="//h2[normalize-space()='Easy Access Account Summary Box']")
	public WebElement SummaryBoxCardHeader;

	@FindBy(xpath="//a[@aria-label='Download Easy Access Account Summary Box']")
	public WebElement SummaryBoxCardDownloadLink;

	// Cards-Personal Savings

	@FindBy(xpath = "//h2[normalize-space()='Personal Savings Terms and Conditions']")
	public WebElement PersonalSavingsCardHeader;

	@FindBy(xpath = "//a[@href='/media/dandclvi/personal-savings-terms-and-conditions.pdf'][normalize-space()='Download document']")
	public WebElement PersonalSavingsCardDownloadLink;

	// Cards-FSCS

	@FindBy(xpath = "//h2[normalize-space()='FSCS Information Sheet']")
	public WebElement FSCSCardHeader;

	@FindBy(xpath = "//a[@href='/media/zvzpitdz/fscs-information-sheet.pdf']")
	public WebElement FSCSCardDownloadLink;
	
	@FindBy(xpath="//a[normalize-space()='Apply now']")
	public WebElement EasyAccessAccApplyNow;

}
