package pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupport_BorrowingMoreLocators {

//	@FindBy(xpath = "//*[@id='Desktop_Nav_Mortgages']/div[2]/ul[4]/li[4]/a/span")
	@FindBy(xpath = "//*[@id=\"Desktop_Nav_Mortgages\"]/div[2]/ul[3]/li[4]/a/span")
	public WebElement dropDownOption1;
	
//	@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
	@FindBy(xpath = "//div[@class='masthead-small-text-container padding-side']/h1")
	public WebElement PageTitle;
	
//	@FindBy(xpath = "//*[@id='What you could borrow for']/article/div[1]/h2")
	@FindBy(xpath = "//*[@id=\"What you could borrow for\"]/div/article/div[2]/h2")
	public WebElement ImageTitle1;
	
	@FindBy(xpath ="//*[@id='Eligibility']/article/div[1]/h2")
	public WebElement ImageTitle2;
	
//	@FindBy(xpath = "//*[@id='Eligibility']/article/div[1]/div[2]/a")
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/ul/li[3]/span/a")
	public WebElement ImageLink;
	
//	@FindBy(xpath = "//div[@class='item-container backlink']/div/h1")
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement LinkPageTitle;
}
