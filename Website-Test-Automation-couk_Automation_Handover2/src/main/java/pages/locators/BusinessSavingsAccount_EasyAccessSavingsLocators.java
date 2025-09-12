package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessSavingsAccount_EasyAccessSavingsLocators {

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement SavingsLink;

	@FindBy(xpath = "//a[@href='/savings-accounts/business-savings-accounts/easy-access-savings-account/']//span[@class='navigation__menu-item__span'][normalize-space()='Easy access savings']")
	public WebElement EasyAccessAccountLink;

	// Masthead

	@FindBy(xpath="//h1[normalize-space()='Easy access account']")
	public WebElement EasyAccessAccountHeader;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='Benefits of an easy access account']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Celebrating small businesses']")
	public WebElement ImageCopyHeader2;

	// Fixed Rate FAQ

	@FindBy(xpath = "//h2[normalize-space()='Business savings easy access account FAQs']")
	public WebElement FAQHeader;

	@FindBy(xpath = "//h3[contains(text(),'Am I eligible to open a business savings')]")
	public WebElement Accordian;

	@FindBy(xpath = "//li[normalize-space()='A business that is only tax resident in the UK']")
	public WebElement AccordianBlock;

	// More Card

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardOnFAQ;

	@FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button ald_more_card_analytics']")
	public WebElement MoreCardOnFAQLink;

	// Easy access savings account Product Card Values

	@FindBy(xpath = "//span[@class='product-card-savings__rate-value__label']")
	public WebElement EasyAccessAccountInterestValue;

	@FindBy(xpath = "//span[@class='product-card-savings-balance__caption']")
	public WebElement EasyAccessAccountOpeningBalance;

	@FindBy(xpath="//h2[normalize-space()='Easy access business savings account']")
	public WebElement EasyAccessAccountProductCardHeader;

	@FindBy(xpath="//div[contains(text(),'Read more & apply')]")
	public WebElement EasyAccessAccountViewLink;

}
