package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BSFixedRateSavingsAccount_6MonthFixedRateAccountLocators {

	@FindBy(xpath="//a[@aria-label='View 6 month fixed rate business savings account']//div[contains(text(),'Read more & apply')]")
	public WebElement SixMonthViewAccLink;

	// Masthead medium

	@FindBy(xpath="//h1[normalize-space()='6 month fixed rate account']")
	public WebElement MastheadHeader;

	// OneYearFixedRateAccountCard

	@FindBy(xpath = "//span[@class='product-section-savings__rate-label']")
	public WebElement InterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[1]")
	public WebElement GrossMonthlyInterestValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[2]")
	public WebElement GrossAnnualInterestValue;

	@FindBy(xpath="//span[normalize-space()='£1,000']")
	public WebElement OpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='6 months']")
	public WebElement TermValue;

	// FAQ-Product Summary

	@FindBy(xpath = "//h2[normalize-space()='Product summary']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath = "//p[contains(text(),'No, the interest rate is fixed and will not change')]")
	public WebElement ProductSummaryAccordianTextBox;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Eligibility']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader2;

	// Fixed_rate_business_savings_accounts_FAQs

	@FindBy(xpath = "//h2[normalize-space()='Fixed rate business savings accounts FAQs']")
	public WebElement FixedRateAccountFAQHeader;

	@FindBy(xpath="//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement FixedRateAccountFAQAccordian;

	@FindBy(xpath="//p[contains(text(),'No, the interest rate is fixed and will not change')]")
	public WebElement FixedRateAccountFAQAccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath = "//a[normalize-space()='Read our business savings FAQs']")
	public WebElement MoreCardHelpSupportLink;

	// Yellow CTA Banner

	@FindBy(xpath="//a[contains(text(),'Apply now for a 6 month fixed rate business saving')]")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;
}
