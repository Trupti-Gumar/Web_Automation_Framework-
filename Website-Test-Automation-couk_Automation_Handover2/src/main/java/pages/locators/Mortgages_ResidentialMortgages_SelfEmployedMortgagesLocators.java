package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_ResidentialMortgages_SelfEmployedMortgagesLocators {

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement OneTrustCookies;
	
	@FindBy(xpath = "//*[@id='Menu_Root']/nav/ul/li[2]/button")
	public WebElement MortgageNavigationLink;	
	
	@FindBy(xpath = "//span[contains(text(),'Self-employed mortgages')]")
	public WebElement SelfEmployedOption;
	
//	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement SelfEmployedPageTitle;
	
	@FindBy(xpath = "//div[@class = 'image-copy-default__container']/h2")
	public WebElement SelfEmplyedImageSectionTitle;
	
	@FindBy(xpath = "//div[@class = 'accordion_fullwidth background__light-grey-tint margin-bottom margin-side']/h2" )
	public WebElement SelfEmployedFAQsTitle;
	
	@FindBy(xpath = "//div[@class = 'card-more-faq-link background__black margin-bottom margin-side']/h2")
	public WebElement moreCardHeader;
	
	@FindBy(xpath = "//a[@class = 'ald_cta_textlink white__text ald-focus__button']")
	public WebElement CTAButton;
	
	@FindBy(xpath = "//div[@class = 'item-container backlink']/div/h1")
	public WebElement CTAPageTitle;
	
	//@FindBy(xpath = "//a[contains(text(),'First time buyer mortgages')]")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/a")
	public WebElement Cardheader1;
	
	//@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/div/section[1]/article/div[2]/div/span[1]")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/div/a")
	public WebElement Cardheader2; 
	
	//@FindBy(xpath = "//*[contains(text(),'Mortgages for customers with credit problems')]")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/div/a")
	public WebElement CardHeader3;
	
	//@FindBy(xpath = "//*[@id='db9bc61e-8de1-44e3-b252-7db22c3b9055']/div/section[3]/article/a")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/article/a")
	public WebElement Cardheader4;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/article/a")
	public WebElement Cardheader5;
}
