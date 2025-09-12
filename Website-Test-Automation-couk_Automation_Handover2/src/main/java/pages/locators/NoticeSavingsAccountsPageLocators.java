package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoticeSavingsAccountsPageLocators {

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement SavingsNavLink;

	@FindBy(xpath = "//span[normalize-space()='Notice savings']")
	public WebElement NoticeSavingsAccountLink;
	
	@FindBy(xpath="//h1[normalize-space()='Notice savings accounts']")
	public WebElement NoticeSavingsAccountHeader;
	
	
	// 30 day notice account card values

	@FindBy(xpath = "//div[@id='30 day notice account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement ThirtyDaysInterestValue;

	@FindBy(xpath = "//div[@id='30 day notice account']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThirtyDaysOpeningBalanceValue;

	@FindBy(xpath = "(//div[@name='30 day notice account']//span)[5]")
	public WebElement ThirtyDaysTermValue;

	@FindBy(xpath = "//h2[normalize-space()='30 day notice account']")
	public WebElement ThirtyDaysNoticeAccountHeader;

	// 120 day notice account card values

	@FindBy(xpath = "//div[@id='120 day notice account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement days120InterestValue;

	@FindBy(xpath = "//div[@id='120 day notice account']//span[@class='product-card-savings-balance__caption']")
	public WebElement days120OpeningBalanceValue;

	@FindBy(xpath = "//div[@id='120 day notice account']//span[@class='product-card-savings-term__caption'] ")
	public WebElement days120TermValue;

	@FindBy(xpath = "//h2[normalize-space()='120 day notice account']")
	public WebElement OneTwentyDaysNoticeAccHeader;
	
	//USP Section
	
	@FindBy(xpath="//ul[@class='unique-selling-points__section__grid']")
	public WebElement USPSection;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Key features']")
	public WebElement ImageCopySectionHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='FSCS Protection']")
	public WebElement ImageCopySectionHeader2;
	
	@FindBy(xpath="//a[normalize-space()='Find out more about FSCS Protection']")
	public WebElement FindOutMoreLinkforFSCS;
	
	
	//Notice account FAQs
	
	@FindBy(xpath="//h2[normalize-space()='Notice account FAQs']")
	public WebElement FAQHeader;
	
	@FindBy(xpath="//h3[normalize-space()='What do I need to open a notice account?']")
	public WebElement AccordianHeader;
	
	@FindBy(xpath="//p[contains(text(),'You simply need to be aged 18 years or over, resid')]")
	public WebElement AccordianTextBlock;
	
	
	
	
	
	

}
