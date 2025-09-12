package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThreeYearFixedRateSavingsPageLocators {

	// Masthead_Medium

	@FindBy(xpath = "//h1[normalize-space()='3 year fixed rate account']")
	public WebElement ThreeYearFixedRateHeader;

	// Masthead Black box

	@FindBy(xpath = "//h3[normalize-space()='New customers']")
	public WebElement MastheadBlackBoxHeader;

	@FindBy(xpath = "//h4[normalize-space()='Existing customers']")
	public WebElement MastheadBlackBoxSecondaryTitle;

	// ThreeYearFixedRateAccountCard

	@FindBy(xpath = "//span[@class='product-section-savings__rate-label']")
	public WebElement InterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[1]")
	public WebElement GrossMonthlyInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[2]")
	public WebElement GrossAnnualInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__sub-header-caption'])[1] ")
	public WebElement OpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='3 years']")
	public WebElement TermValue;

	// FAQ-Product Summary

	@FindBy(xpath="//h2[normalize-space()='Summary box']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath = "//p[contains(text(),'We guarantee to pay the interest rates shown provi')]")
	public WebElement ProductSummaryAccordianTextBox;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Eligibility']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader2;

	// Fixed_rate_business_savings_accounts_FAQs

	@FindBy(xpath = "//h2[normalize-space()='Fixed rate account FAQs']")
	public WebElement FixedRateAccountFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='What do I need to open a fixed rate account?']")
	public WebElement FixedRateAccountFAQAccordian;

	@FindBy(xpath = "//h3[normalize-space()='What do I need to open a fixed rate account?']")
	public WebElement FixedRateAccountFAQAccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath = "//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement MoreCardHelpSupportLink;

	// Yellow CTA Banner

	@FindBy(xpath = "//a[normalize-space()='Apply now for a 3 year fixed rate account']")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;

	// Cards-Summary box

	@FindBy(xpath="//h2[normalize-space()='Fixed Rate Account Summary Box']")
	public WebElement SummaryBoxCardHeader;

	@FindBy(xpath="//a[@aria-label='Download Fixed Rate Account Summary Box']")
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

}
