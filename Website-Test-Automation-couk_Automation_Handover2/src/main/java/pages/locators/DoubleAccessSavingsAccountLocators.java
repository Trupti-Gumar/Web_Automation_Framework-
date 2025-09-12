package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoubleAccessSavingsAccountLocators {

	// UAT - Locators

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement SavingsNavLink;

	@FindBy(xpath = "//span[normalize-space()='Double access savings']")
	public WebElement DoubleAccessAccountLink;

	@FindBy(xpath = "//h1[normalize-space()='Double access savings account']")
	public WebElement DoubleAccessAccountHeader;

	// Double access account

	@FindBy(xpath = "(//div[@id='DA Account']//li[@class='rate-list-item']//span[@class='product-card-savings__rate-value__label'])[1] ")
	public WebElement DoubleAccessAccountInterestValue1;

	@FindBy(xpath = "(//div[@id='DA Account']//li[@class='rate-list-item']//span[@class='product-card-savings__rate-value__label'])[2] ")
	public WebElement DoubleAccessAccountInterestValue2;

	@FindBy(xpath = "//div[@id='DA Account']//span[@class='product-card-savings-balance__caption']")
	public WebElement DoubleAccessAccountOpeningBalanceValue;

	@FindBy(xpath = "//span[@class='product-card-savings-term__caption']")
	public WebElement DoubleAccessAccountTermValue;

	@FindBy(xpath = "//h2[normalize-space()='Double access account']")
	public WebElement DoubleAccessAccHeader;

	@FindBy(xpath="//div[contains(text(),'Read more & apply')]")
	public WebElement DoubleAccessViewBtn;
	// Image copy Section

	@FindBy(xpath="//h2[normalize-space()='Key features']")
	public WebElement ImageCopySectionHeader1;

	@FindBy(xpath = "//h2[normalize-space()='FSCS Protection']")
	public WebElement ImageCopySectionHeader2;

	// FAQ

	@FindBy(xpath = "//h2[normalize-space()='Double access account FAQs']")
	public WebElement DAAFAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='What do I need to open a double access account?']")
	public WebElement AccordianLink;

	@FindBy(xpath = "//div[@class='section-body']//div[@class='text-block text-block-white']")
	public WebElement AccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeaderOnFAQ;

	@FindBy(xpath = "//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement MoreCardLinkOnFAQ;

	// Cards- Important personal savings forms and documents

	@FindBy(xpath = "//h2[normalize-space()='Important personal savings forms and documents']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//a[normalize-space()='Forms and documents']")
	public WebElement CardLink1;

	// Cards-Protecting yourself from fraud

	@FindBy(xpath = "//h2[normalize-space()='Protecting yourself from fraud']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//a[normalize-space()='Online security and protecting yourself from fraud']")
	public WebElement CardLink2;

}
