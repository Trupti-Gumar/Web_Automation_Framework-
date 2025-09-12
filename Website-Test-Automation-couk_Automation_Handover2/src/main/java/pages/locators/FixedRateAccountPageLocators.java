package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FixedRateAccountPageLocators {

	// Page Factory - OR:

	// UAT- Locators
	
	@FindBy(xpath="//span[normalize-space()='Savings']")
	public WebElement SavingsNavLink;
	
	@FindBy(xpath="//a[contains(@href,'/savings-accounts/personal-savings-accounts/fixed-rate-savings-accounts/')]//span[contains(@class,'navigation__menu-item__span')][normalize-space()='Fixed rate savings']")
	public WebElement FixedRateSavingsLink;
	
	//Masthead
	
	@FindBy(xpath="//h1[normalize-space()='Fixed rate savings accounts']")
	public WebElement FixedRateSavingsHeader;
	
	@FindBy(xpath="//ul[@class='unique-selling-points__section__grid']")
	public WebElement USPSection;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Key features']")
	public WebElement ImageCopyHeader1;
	
	
	@FindBy(xpath="//h2[normalize-space()='FSCS Protection']")
	public WebElement ImageCopyHeader2;
	
	
	@FindBy(xpath="//a[normalize-space()='Find out more about FSCS Protection']")
	public WebElement ImageCopylink;
	
	
	//Fixed Rate FAQ
	
	@FindBy(xpath="//h2[normalize-space()='Fixed rate savings account FAQs']")
	public WebElement FAQHeader;
	
	@FindBy(xpath="//h3[contains(text(),'What do I need to open a fixed rate savings accoun')]")
	public WebElement Accordian;
	
	//More Card
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardOnFAQ;
	
	@FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button ald_more_card_analytics']")
	public WebElement MoreCardOnFAQLink;
	
	
	@FindBy(xpath="//p[contains(text(),'You simply need to be aged 18 years or over, resid')]")
	public WebElement AccordianBlock;
	
	//Cards
	
	@FindBy(xpath="//h2[normalize-space()='Important personal savings forms and documents']")
	public WebElement CardHeader1;
	
	@FindBy(xpath="//a[normalize-space()='Forms and documents']")
	public WebElement CardLink1;
	
	@FindBy(xpath="//h2[normalize-space()='Protecting yourself from fraud']")
	public WebElement CardHeader2;
	
	
	@FindBy(xpath="//a[normalize-space()='Online security and protecting yourself from fraud']")
	public WebElement CardLink2;
	
	
	
	
	
	
}
