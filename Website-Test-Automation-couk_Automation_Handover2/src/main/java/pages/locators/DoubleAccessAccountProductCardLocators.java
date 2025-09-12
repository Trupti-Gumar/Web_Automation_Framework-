package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoubleAccessAccountProductCardLocators {

	@FindBy(xpath = "//h1[normalize-space()='Double access account']")
	public WebElement DoubleAccessAccHeader;

	// Product Card Values

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-label'])[1]")
	public WebElement InterestRateValue1;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-label'])[2]")
	public WebElement InterestRateValue2;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption__double'])[1]")
	public WebElement GrossMonthlyInterestValue1;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption__double'])[2]")
	public WebElement GrossMonthlyInterestValue2;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption__double'])[3]")
	public WebElement GrossAnnualInterestValue1;

	@FindBy(xpath = "(//span[@class='product-section-savings__rate-caption__double'])[4]")
	public WebElement GrossAnnualInterestValue2;

	@FindBy(xpath = "(//span[@class='product-section-savings__sub-header-caption'])[1] ")
	public WebElement OpeningBalanceValue;

	@FindBy(xpath = "(//span[@class='product-section-savings__sub-header-caption'] )[2]")
	public WebElement TermValue;

	// FAQ-Product Summary

	@FindBy(xpath = "//h2[normalize-space()='Product summary']")
	public WebElement ProductSummaryFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Can Aldermore change the interest rate?']")
	public WebElement ProductSummaryAccordian;

	@FindBy(xpath = "//div[@class='section-body']//div[@class='text-block text-block-grey']")
	public WebElement ProductSummaryAccordianTextBox;

	// Image Copy Section

	@FindBy(xpath="//h2[normalize-space()='Opening an account']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath="//h2[normalize-space()='FSCS Protection']")
	public WebElement ImageCopyHeader2;

	// Double access account FAQs

	@FindBy(xpath = "//h2[normalize-space()='Double access account FAQs']")
	public WebElement DoubleAccessAccountFAQHeader;

	@FindBy(xpath="//h3[normalize-space()='What do I need to open a double access account?']")
	public WebElement DoubleAccessAccountFAQccordian;

	@FindBy(xpath = "//p[contains(text(),'You simply need to be aged 18 years or over, resid')]")
	public WebElement DoubleAccessAccountFAQAccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath = "//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement MoreCardHelpSupportLink;

	// Yellow and White CTA Banner

	@FindBy(xpath="//a[normalize-space()='Apply now for a double access savings account']")
	public WebElement YellowCTABanner;

	@FindBy(xpath = "//a[contains(text(),'Existing customers - log in to your account to app')]")
	public WebElement WhiteCTABanner;
	
	@FindBy(xpath="//a[normalize-space()='Apply now']")
	public WebElement doubleAccessApplynow;
	// Cards- Double Access Acc Summary box

	@FindBy(xpath="//h2[normalize-space()='Double Access Account Summary Box']")
	public WebElement SummaryBoxCardHeader;

	@FindBy(xpath="//a[@aria-label='Download Double Access Account Summary Box']")
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
