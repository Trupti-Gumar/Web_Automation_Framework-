package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BSEasyAccessAccountProductCardLocators {

	@FindBy(xpath="//div[contains(text(),'Read more & apply')]")
	public WebElement ViewAccBtn;

	// Masthead_Medium

	@FindBy(xpath="//h1[normalize-space()='Easy access account Issue 8']")
	public WebElement MastHeadHeader;
	
	

	// EasyAccessSavingsAccountProductCardvalues

	@FindBy(xpath = "//span[@class='product-section-savings__rate-label']")
	public WebElement InterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[1]")
	public WebElement GrossMonthlyInterestRateValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption'])[2]")
	public WebElement GrossAnnualInterestRateValue;

	@FindBy(xpath="//span[@class='product-section-savings__sub-header-caption']")
	public WebElement MinimumOpeningBalance;

	// FAQ-Product Summary

	@FindBy(xpath = "//h2[normalize-space()='Product summary']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath="//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath="//p[contains(text(),'Yes, the interest rate is variable. We can increas')]")
	public WebElement ProductSummaryAccordianTextBox;

	// CTA Banner

	@FindBy(xpath="//a[contains(text(),'Apply now for an easy access business savings acco')]")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;
	
	// Image Copy Section
	@FindBy(xpath="//h2[normalize-space()='Eligibility']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath="//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader2;

}
