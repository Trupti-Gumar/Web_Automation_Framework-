package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirtyDaysNoticeAccountPageLocators {

	@FindBy(xpath = "//h1[normalize-space()='30 day notice account issue 12']")
	public WebElement ThirtyDaynoticPageHeader;

	// Masthead Black box

	@FindBy(xpath = "//h3[normalize-space()='New customers']")
	public WebElement MastheadBlackBoxHeader;

	@FindBy(xpath = "//h4[normalize-space()='Existing customers']")
	public WebElement MastheadBlackBoxSecondaryTitle;

	@FindBy(xpath = "//a[normalize-space()='Apply now']")
	public WebElement ApplyButton;

	@FindBy(xpath = "//a[normalize-space()='Log in']")
	public WebElement LoginLink;
	
	@FindBy(xpath="//a[normalize-space()='Apply now']")
	public WebElement applyNowBtn;

	// Product Card Values

	@FindBy(xpath = "//span[@class='product-section-savings__rate-label']")
	public WebElement InterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[1]")
	public WebElement GrossMonthlyInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[2]")
	public WebElement GrossAnnualInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__sub-header-caption'])[1] ")
	public WebElement OpeningBalanceValue;

	@FindBy(xpath="(//span[@class='product-section-savings__sub-header-caption'] )[2]")
	public WebElement TermValue;

	// FAQ-Product Summary

	@FindBy(xpath="//h2[normalize-space()='Summary box']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath = "//div[@class='section-body']//div[@class='text-block text-block-grey']")
	public WebElement ProductSummaryAccordianTextBox;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Eligibility']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader2;

	// Notice account FAQs

	@FindBy(xpath = "//h2[normalize-space()='Notice account FAQs']")
	public WebElement NoticeAccountFAQHeader;

	@FindBy(xpath="//h3[normalize-space()='What do I need to open a notice account?']")
	public WebElement NoticeAccountFAQccordian;

	@FindBy(xpath = "//p[contains(text(),'You simply need to be aged 18 years or over, resid')]")
	public WebElement NoticeAccountFAQAccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath = "//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement MoreCardHelpSupportLink;

	// Yellow and White CTA Banner

	@FindBy(xpath="//a[normalize-space()='Apply now for a 30 day notice account']")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;

	// Cards- Notice Acc Summary box

	@FindBy(xpath = "//h2[contains(text(),'Notice Account Summary Box')]")
	public WebElement SummaryBoxCardHeader;

	@FindBy(xpath = "(//a[@class='card-download__a bold ald-focus ald-underline-hover'])[1]")
	public WebElement SummaryBoxCardDownloadLink;

	// Cards-Personal Savings

	@FindBy(xpath = "//h2[normalize-space()='Personal Savings Terms and Conditions']")
	public WebElement PersonalSavingsCardHeader;

	@FindBy(xpath = "(//a[@class='card-download__a bold ald-focus ald-underline-hover'])[2]")
	public WebElement PersonalSavingsCardDownloadLink;

	// Cards-FSCS

	@FindBy(xpath = "//h2[normalize-space()='FSCS Information Sheet']")
	public WebElement FSCSCardHeader;

	@FindBy(xpath = "(//a[@class='card-download__a bold ald-focus ald-underline-hover'])[3]")
	public WebElement FSCSCardDownloadLink;

}
