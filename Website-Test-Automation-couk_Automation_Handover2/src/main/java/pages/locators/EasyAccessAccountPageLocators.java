package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EasyAccessAccountPageLocators {

	//UAT-Locators
	
	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement SavingsNavLink;
	
	
	@FindBy(xpath="//a[@href='/savings-accounts/personal-savings-accounts/easy-access-savings-accounts/']//span[@class='navigation__menu-item__span'][normalize-space()='Easy access savings']")
	public WebElement EasyAccessAccLink;
	
	@FindBy(xpath="//h1[normalize-space()='Easy access savings accounts']")
	public WebElement EasyAccessAccHeader;
	
	@FindBy(xpath="//ul[@class='unique-selling-points__section__grid']")
	public WebElement USPSection;
	
	//Easy Access Accounts values
	
	@FindBy(xpath="//span[@class='product-card-savings__rate-value__label']")
	public WebElement EAAInterestRateValue;
	
	
	@FindBy(xpath="//span[@class='product-card-savings-balance__caption']")
	public WebElement EAAMinOpeningBalanceValue;
	
	@FindBy(xpath="//span[@class='product-card-savings-term__caption']")
	public WebElement EAATermValue;
	
	
	//Image copy Section- Benefits of an easy access account
	
	@FindBy(xpath="//h2[normalize-space()='Key features']")
	public WebElement ImgCpySectionHeader1;
	
	//Image copy Section-FSCS Protection
	
	@FindBy(xpath="//h2[normalize-space()='FSCS Protection']")
	public WebElement ImgCpySectionHeader2;
	
	//Easy access account FAQs
	
	@FindBy(xpath="//h2[normalize-space()='Easy access account FAQs']")
	public WebElement EAAFAQHeader;
	
	@FindBy(xpath="//h3[normalize-space()='What do I need to open a easy access account?']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="//div[@class='section-body']//div[@class='text-block text-block-white']")
	public WebElement AccordianTextBlock;
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeaderOnFAQ;
	
	@FindBy(xpath="//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement MoreCardLinkOnFAQ;
	
	//Cards- Important personal savings forms and documents
	
	@FindBy(xpath="//h2[normalize-space()='Important personal savings forms and documents']")
	public WebElement CardHeader1;
	
	@FindBy(xpath="//a[normalize-space()='Forms and documents']")
	public WebElement CardLink1;
	
	//Cards-Protecting yourself from fraud
	
	@FindBy(xpath="//h2[normalize-space()='Protecting yourself from fraud']")
	public WebElement CardHeader2;
	
	
	@FindBy(xpath="//a[normalize-space()='Online security and protecting yourself from fraud']")
	public WebElement CardLink2;
	
	
	
	
	
	
	


}

