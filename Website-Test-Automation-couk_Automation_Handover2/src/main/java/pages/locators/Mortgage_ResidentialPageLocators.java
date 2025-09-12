package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgage_ResidentialPageLocators {
	
//	@FindBy(xpath = "//li[@class='navigation__mobile__sub-menu__base']/button[@aria-label='Residential mortgages']")
//	public WebElement ResidentialMortgageMenuItem;
	
	@FindBy(xpath = "//*[@aria-label = 'Residential mortgages']")
	public WebElement ResidentialMortgageOptions;
	
//	@FindBy(xpath = "//div[@class = 'masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class = 'masthead-text-container padding-side']/h1")
	public WebElement ResidentialMortgageHeader;
	
//	@FindBy(xpath = "//*[@id='Residential product links']/div/div[1]/a")
	@FindBy(xpath = "//*[@id='Residential product links']/ul/li/div[1]/a")
	public WebElement customerWithCreditIssue;
	
//	@FindBy(xpath = "//*[@id='Residential product links']/div/div[2]/a")
	@FindBy(xpath = "//*[@id='Residential product links']/ul/li[2]/div[1]/a")
	public WebElement SelfEmployedMortgages;
	
//	@FindBy(xpath = "//*[@id='Residential product links']/div/div[3]/a")
	@FindBy(xpath = "//*[@id='Residential product links']/ul/li[3]/div[1]/a")
	public WebElement FirstTimeBuyerMortgages;

//	@FindBy(xpath = "//*[@class='card-title-link__section-narrow']/article[1]/*[contains(text(),'Buy to let for individuals')]")
//	public WebElement Buytoletforindividuals;
	
	@FindBy(xpath = "//li[@class='card-title-link__section-narrow']/article[1]/*[contains(text(),'Why use a mortgage broker?')]")
	public WebElement Whyuseamortgagebroker;
	
//	@FindBy(xpath = "//*[@class='card-title-link__section-narrow']/article[1]/*[contains(text(),'How to get a self-employed mortgage')]")
//	public WebElement Howtogetaselfemployedmortgage;
	
	@FindBy(xpath = "//*[@class='card-title-link__section-narrow']/article[1]/*[contains(text(),'Divorce and mortgages – What you need to know')]")
	public WebElement Divorce_and_mortgages;
	
	@FindBy(xpath = "//*[@id='We take a different approach']/article/div/h2")
	public WebElement ImageSectionheader;
	
	@FindBy(xpath = "//*[@id='Residential mortgage FAQs']/div/h2")
	public WebElement ResidentialMortgageFAQs;
	
	@FindBy(xpath = "//h2[@class = 'card-more-faq__title']")
	public WebElement Morecardheader;
	
	@FindBy(xpath = "//*[@id='Residential mortgage FAQs']/div/div/div[2]/a")
	public WebElement CTAFAQslink;
	
	@FindBy(xpath = "//h1[@class = 'masthead-small__header']")
	public WebElement FAQsPageTitle;
	
	@FindBy(xpath = "//h2[@class= 'masthead-black-box__header']")
	public WebElement blackBoxHeader;
	
	@FindBy(xpath ="//li[@class='masthead-black-box__li'][1]/a/span")
	public WebElement Option1;
	
//	@FindBy(xpath = "//h1[@class='masthead-small__header']")
	@FindBy(xpath = "//h1[@class='masthead-medium__header']")
	public WebElement Option1Title;
	
	@FindBy(xpath ="//li[@class='masthead-black-box__li'][2]/a/span")
	public WebElement Option2;
	
//	@FindBy(xpath = "//h1[@class='masthead_homepage__heading']")
	@FindBy(xpath = "//h1[@class='masthead-medium__header']")
	public WebElement Option2Title;
	
	@FindBy(xpath ="//li[@class='masthead-black-box__li'][3]/a/span")
	public WebElement Option3;
	
//	@FindBy(xpath = "//h1[@class='masthead_homepage__heading']")
	@FindBy(xpath = "//h1[@class='masthead-medium__header']")
	public WebElement Option3Title;
	
}
