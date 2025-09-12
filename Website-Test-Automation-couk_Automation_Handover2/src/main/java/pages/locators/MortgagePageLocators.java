package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgagePageLocators {
	
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement OneTrustCookies;
	
	@FindBy(xpath = "//*[@id='Menu_Root']/nav/ul/li[2]/button")
	public WebElement MortgageNavigationLink;
	
	@FindBy(xpath = "//li[@class='navigation__mobile__sub-menu__base']/button[@aria-label='Residential mortgages']")
	public WebElement ResidentialMortgageMenuItem;
	
	@FindBy(xpath = "//li[@class='navigation__mobile__sub-menu__base']/button[@aria-label='Buy to let mortgages']")
	public WebElement BuyToLetMortgagesMenuItem;
	
	@FindBy(xpath = "//li[@class='navigation__mobile__sub-menu__base']/button[@aria-label='Support for mortgage customers']")
	public WebElement SupportForMortgageCustomers;
	
	//@FindBy(xpath = "//div[@class='navigation-menu__dropdown-section-header__container']/*[@aria-label='Mortgages']")
	@FindBy(xpath = "//div[@class='navigation-menu__dropdown-section-header__container']/*[@aria-label='Mortgages home']")
	public WebElement mortgageHeaderLink;
	
	@FindBy(xpath ="//div[@class = 'masthead-text-container padding-side']/h1[@class='masthead-medium__header']")
	public WebElement mortagePageTitle;
	
	@FindBy(xpath = "//div[@class='card']/*[contains(text(), 'Mortgages for customers with credit issues')]")
	public WebElement customerWithCreditIssue;
	
	@FindBy(xpath = "//div[@class = 'card']/*[contains(text(), 'Self-employed mortgages')]")
	public WebElement SelfEmployedMortgages;
	
	@FindBy(xpath = "//div[@class = 'card']/*[contains(text(), 'First time buyer mortgages')]")
	public WebElement FirstTimeBuyerMortgages;
	
//	@FindBy(xpath = "//*[@aria-label='Mortgage FAQs']")
//	public WebElement MortgagesFAQs;

	@FindBy(xpath = "//*[@id=\"7795550c-67ee-4b93-9d89-e5d27a2fdc0f\"]/ul/li[1]/div/a")
	public WebElement Buy_to_let_mortgages;
	
	@FindBy(xpath = "//*[@aria-label='Mortgage guides']")
	public WebElement Mortgageguides;
	
	@FindBy(xpath = "//div[@class = 'card']/*[contains(text(), 'Commercial mortgages')]")
	public WebElement commericalMortgages;
	
	@FindBy(xpath = "//div[@class = 'card']/*[contains(text(), 'Buy to let mortgages for limited companies')]")
	public WebElement BuyToLetForLimitedoCompanies;
	
	@FindBy(xpath = "//*[@aria-label='Why use a mortgage broker? Here’s 10 great reasons']")
	public WebElement Why_use_a_mortgage_broker;
	
	@FindBy(xpath ="//*[@aria-label='Divorce and mortgages – What you need to know']")
	public WebElement Divorce_and_mortgages;
	
	//@FindBy(xpath = "//section[@class = 'unique-selling-points__section__grid']")
	@FindBy(xpath = "//ul[@class = 'unique-selling-points__section__grid']")
	public WebElement USPSection;
	
	@FindBy(xpath = "//section[@class = 'masthead-black-box']/h2[@class='masthead-black-box__header']")
	public WebElement QuickLinkBlackBox;
	
	@FindBy(xpath = "//div[@class = 'image-copy-slant__container']/h2")
	public WebElement imageSectionheader;
	
//	@FindBy(xpath = "//li[@class='masthead-black-box__li']/a/span[contains(text(),'Customer help & support')]")
	@FindBy(xpath = "//div[@class=\"umb-block__root  \"]/div/span/section/ul/li[1]/a/span")
	public WebElement quicklinkoption1;
	
//	@FindBy(xpath = "//li[@class='masthead-black-box__li']/a/span[contains(text(),'Frequently asked questions')]")
	@FindBy(xpath = "//div[@class=\"umb-block__root  \"]/div/span/section/ul/li[2]/a/span")
	public WebElement quicklinkoption2;
	
	@FindBy(xpath = "//div[@class=\"umb-block__root  \"]/div/span/section/ul/li[3]/a/span")
	public WebElement quicklinkoption3;
	
	@FindBy(xpath ="//div[@class='masthead-text-container padding-side']/h1")
	public WebElement Option1PageTitle;
	
//	@FindBy(xpath ="//div[@class='masthead_homepage']/h1")
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1[contains(text(),'Residential mortgages')]")
	public WebElement Option2PageTitle;
	
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1[contains(text(),'Mortgages help and support')]")
	public WebElement Option3PageTitle;

}
