package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupport_MoneyWorriesLocators {
	
	
//	@FindBy(xpath = "//*[@id='Desktop_Nav_Mortgages']/div[2]/ul[4]/li[3]/a")
	@FindBy(xpath = "//*[@id=\"Desktop_Nav_Mortgages\"]/div[2]/ul[3]/li[3]/a/span")
	public WebElement MoneyWorriesDropDown;
	
//	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement MoneyWorriesPageTitle;
	
	@FindBy(xpath ="//*[@id='talk']/article/div[1]/h2")
	public WebElement USPSection1;
	
	@FindBy(xpath = "//*[@id='income-form']/article/div[1]/h2")
	public WebElement USPSection2;	
	
	@FindBy(xpath= "//*[@id='back-on-track']/article/div[1]/h2")
	public WebElement USPSection3;
	
	@FindBy(xpath= "//*[@id='who-can-help']/div/h2")
	public WebElement USPSection4;
	
	@FindBy(xpath ="//*[@id='important-information']/div/h2")
	public WebElement USPSection5;
	
	@FindBy(xpath = "//*[@id='income-form']/article/div[1]/div[2]/a")
	public WebElement Link;
	
//	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement LinkPageTitle;
}
