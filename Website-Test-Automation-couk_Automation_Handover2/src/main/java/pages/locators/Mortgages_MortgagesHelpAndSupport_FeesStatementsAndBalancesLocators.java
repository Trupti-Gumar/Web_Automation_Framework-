package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesLocators {

	
	@FindBy(xpath = "//ul/li/div[@class='card']/div/h2[contains(text(),'Fees, statements and balances')]")
	public WebElement CardText;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/div/a")
	//ul/li[2]/div[@class='card']/div[3]
	public WebElement CardCTAbutton;
	
	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	public WebElement CardPageTitle;
	
	@FindBy(xpath = "//*[@id='annual-statement']/div/p[2]/span")
	public WebElement Subheader1;
	
	@FindBy(xpath = "//*[@id='remaining-balance']/div/p[1]/span")
	public WebElement Subheader2;
	
	@FindBy(xpath = "//*[@id='certificate-of-interest']/div/p[1]/span")
	public WebElement Subheader3;
	
	@FindBy(xpath = "//*[@id=\"remaining-balance\"]/div/p[3]/a")
	public WebElement Link1;
	
	@FindBy(xpath ="//*[@id='certificate-of-interest']/div/div/a")
	public WebElement Link2;
	
	@FindBy(xpath = "//div[@class='masthead-text-container__small']/h1")
	public WebElement LinkPage1;
	
	@FindBy(xpath = "//div[@class='full-width-hero__inner inner']/h1")
	public WebElement LinkPage2;
	
	@FindBy(xpath = "//span[@class='masthead-blackbox']/section/h2")
	public WebElement Quicklinkheader;
	
	@FindBy(xpath = "//*[@id=\"13f53eb1-3611-46f4-b9f7-a319ccbbc896\"]/div/span/section/ul/li[1]/a")
	public WebElement Sublink1;
	
	@FindBy(xpath = "//*[@id=\"13f53eb1-3611-46f4-b9f7-a319ccbbc896\"]/div/span/section/ul/li[2]/a")
	public WebElement sublink2;
	
	@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
	public WebElement Pagetitle1;
	
	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	public WebElement PageTitle2;
	}
