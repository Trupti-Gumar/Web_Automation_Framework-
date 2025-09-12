package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessSavingsAccountPageLocators {

	// Page Factory - OR:

	// UAT- Locators

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement savingsNavLink;

	@FindBy(xpath = "//a[contains(text(),'Business savings accounts')]")
	public WebElement BusinessSavingsAccountsLink;

	// Masthead

	@FindBy(xpath = "//h1[normalize-space()='Business savings accounts']")
	public WebElement BSAHeader;
	
	// USP Section
	
	@FindBy(xpath="//ul[@class='unique-selling-points__section__grid']	")
	public WebElement USPSection;
	
    //Product Cards
	
	@FindBy(xpath="//h2[normalize-space()='1 year fixed rate business savings account']")
	public WebElement OneYearFixedRateSavingsAccountHeader;
	
	@FindBy(xpath="//a[@aria-label='View 1 year fixed rate business savings account']//div[contains(text(),'Read more & apply')]")
	public WebElement OneYearFixedRateSavingsAccountCTALink;
	
	
	//FAQ Section
	
	@FindBy(xpath="//h2[normalize-space()='Business savings accounts FAQs']")
	public WebElement FAQHeader;
	
	@FindBy(xpath="//h3[contains(text(),'Am I eligible to open a business savings account, ')]")
	public WebElement FAQAccordian;
	
	@FindBy(xpath="(//div[@class='text-block text-block-grey'] )[2]")
	public WebElement FAQAccordianTextBlock;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Keeping your money safe']")
	public WebElement imageCopySectionHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Celebrating small businesses']")
	public WebElement imageCopySectionHeader2;
	
	
	
	
	
	
	
	
	
	
}
