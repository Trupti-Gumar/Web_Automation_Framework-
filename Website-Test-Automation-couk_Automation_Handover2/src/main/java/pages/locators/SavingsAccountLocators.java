package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingsAccountLocators {

	@FindBy(xpath="//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement SavingsLink;
	
	@FindBy(xpath="//a[normalize-space()='Savings home']")
	public WebElement SavingsAccountLink;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	
	
	//Masthead Medium
	
	@FindBy(xpath="//h1[normalize-space()='Savings accounts']")
	public WebElement SavingsAccPageHeader;
	
	@FindBy(xpath="//*[name()='rect' and contains(@width,'79')]")
	public WebElement FSCSLogo;
	
	//Cards
	
	@FindBy(xpath="//h2[normalize-space()='Easy access accounts']")
	public WebElement EasyAccessAccHeader;
	
	@FindBy(xpath="//div[@id='Personal savings account links']//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Easy access savings accounts']")
	public WebElement EasyAccessAcclink;
	
	@FindBy(xpath="//h2[normalize-space()='Notice accounts']")
	public WebElement NoticeAccHeader;
	
	@FindBy(xpath="(//a[normalize-space()='Notice savings accounts'])[1]")
	public WebElement NoticeAccLink;
	
	
	@FindBy(xpath="//h2[normalize-space()='Fixed rate accounts']")
	public WebElement FixedrateAccountHeader;
	
	@FindBy(xpath="//div[@id='Personal savings account links']//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Fixed rate savings accounts']")
	public WebElement FixedrateAccountLink;
	
	@FindBy(xpath="//h2[normalize-space()='Cash ISAs']")
	public WebElement CashISAHeader;
	
	@FindBy(xpath="(//a[contains(text(),'Cash ISAs')])[1]")
	public WebElement CashISALink;
	
	
	@FindBy(xpath="//h2[normalize-space()='Easy access business savings']")
	public WebElement EasyAccessBusinessSavingsHeader;
	
	@FindBy(xpath="//div[@id='Business savings accounts']//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Easy access savings accounts']")
	public WebElement EasyAccessBusinessSavingsLink;
	
	@FindBy(xpath="//h2[normalize-space()='Fixed rate business savings']")
	public WebElement FixedrateBusinessSavingsHeader;
	
	@FindBy(xpath="//div[@id='Business savings accounts']//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Fixed rate savings accounts']")
	public WebElement FixedrateBusinessSavingsLink;
	
	@FindBy(xpath="//h2[normalize-space()='Corporate deposits']")
	public WebElement CorporateDepositsHeader;
	
	@FindBy(xpath="(//a[normalize-space()='Corporate treasury'])[1]")
	public WebElement CorporateDepositsLink;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Award winning savings accounts']")
	public WebElement ImagecopyHeader;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
