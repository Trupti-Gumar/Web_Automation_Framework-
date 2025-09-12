package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessSavingsAccount_FixedRateSavingsAccountLocators {

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement SavingsLink;

	@FindBy(xpath = "//a[@href='/savings-accounts/business-savings-accounts/fixed-rate-savings-accounts/']//span[@class='navigation__menu-item__span'][normalize-space()='Fixed rate savings']")
	public WebElement FixedRateSavingsAccountLink;

	// Masthead

	@FindBy(xpath="//h1[normalize-space()='Fixed rate business savings accounts']")
	public WebElement FixedRateSavingsHeader;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Benefits of a fixed rate account']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Celebrating small businesses']")
	public WebElement ImageCopyHeader2;

	// Fixed Rate FAQ

	@FindBy(xpath = "//h2[normalize-space()='Fixed rate business savings accounts FAQs']")
	public WebElement FAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='What do I need to open a fixed rate account?']")
	public WebElement Accordian;

	@FindBy(xpath = "//p[normalize-space()='To open a business account with us you must be:']")
	public WebElement AccordianBlock;

	// More Card

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardOnFAQ;

	@FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button ald_more_card_analytics']")
	public WebElement MoreCardOnFAQLink;

	// 1 year fixed rate savings account

	@FindBy(xpath="//h2[normalize-space()='1 year fixed rate business savings account']")
	public WebElement OneYearProductCardHeader;

	@FindBy(xpath = "//div[@id='1 year fixed rate account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement OneYearInterestRateValue;

	@FindBy(xpath="//div[@id='1 year fixed rate account']//span[@class='product-card-savings-balance__caption'][normalize-space()='£1,000']")
	public WebElement OneYearOpeningBalance;

	@FindBy(xpath = "//span[normalize-space()='1 year']")
	public WebElement OneYearTerm;

	@FindBy(xpath="//a[@aria-label='View 1 year fixed rate business savings account']//div[contains(text(),'Read more & apply')]")
	public WebElement OneYearViewAccLink;

	// 6 month fixed rate savings account

	@FindBy(xpath = "//div[@id='6 month fixed rate account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement SixMonthInterestRateValue;

	@FindBy(xpath="//h2[normalize-space()='6 month fixed rate business savings account']")
	public WebElement SixMonthProductCardHeader;

	@FindBy(xpath="//div[@id='6 month fixed rate account']//span[@class='product-card-savings-balance__caption'][normalize-space()='£1,000']")
	public WebElement SixMonthOpeningBalance;

	@FindBy(xpath = "//span[normalize-space()='6 months']")
	public WebElement SixMonthTerm;

	@FindBy(xpath="//a[@aria-label='View 6 month fixed rate business savings account']//div[contains(text(),'Read more & apply')]")
	public WebElement SixMonthViewAccLink;

}
