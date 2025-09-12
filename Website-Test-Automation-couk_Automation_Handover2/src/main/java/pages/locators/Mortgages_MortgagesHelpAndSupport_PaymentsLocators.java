package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_MortgagesHelpAndSupport_PaymentsLocators {

	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement OneTrustCookies;
	
	@FindBy(xpath = "//ul/li/div[@class='card']/div/h2[contains(text(),'Payments')]")
	public WebElement CardHeader1;
	
	@FindBy(xpath = "//*[@id=\"7903bc61-70b9-4099-a6f5-8050e5347167\"]/ul/li[1]/div/a")
	public WebElement CardCTAButton;
	
	@FindBy(xpath = "//div[@class = 'masthead-text-container']/h1")
	public WebElement CardPageTitle;
	
	@FindBy(xpath = "//*[@aria-label='Your first payment']")
	public WebElement NavigationOption1;
	
	@FindBy(xpath = "//*[@aria-label='Ways to pay']")
	public WebElement NavigationOption2;
	
	@FindBy(xpath = "//*[@aria-label='Make an overpayment']")
	public WebElement NavigationOption3;
	
	@FindBy(xpath = "//*[@aria-label='Repaying your balance']")
	public WebElement NavigationOption4;
	
	@FindBy(xpath = "//*[@aria-label='Variable rate mortgages']")
	public WebElement NavigationOption5;
	
	@FindBy(xpath = "//*[@id='ways-to-pay']/article/div/h2")
	public WebElement ImageSectionHeader;
	
	@FindBy(xpath = "//*[@id='AMR']/div/p[1]/span")
	public WebElement subHeader1;
	
	@FindBy(xpath = "//*[@id='repay-balance']/div/p[1]/span")
	public WebElement subHeader2;
	
	@FindBy(xpath = "//*[@id='AMR']/div/p[8]/a")
	public WebElement Link1;
	
	@FindBy(xpath = "//*[@title='Switching your mortgage']")
	public WebElement Link2;
	
	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	public WebElement LinkPageTitle1;
	
	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	public WebElement LinkPageTitle2;
	
	@FindBy(xpath = "//*[@id='faqs']/div/h2")
	public WebElement FAQs;
	
	@FindBy(xpath = "//*[@id='faqs']/div/div/div[2]/h2")
	public WebElement moreheader;
	
	@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
	public WebElement CTAButtonPageTitle;
	
	@FindBy(xpath = "//*[@id='faqs']/div/div/div[2]/a")
	public WebElement PageTitle;
}
