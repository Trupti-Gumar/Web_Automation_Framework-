package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_BuyToLetMortgagesForLimitedCompaniesLocators {

//	@FindBy(xpath = "//span[contains(text(),'Buy to let mortgages for limited companies')]")
	@FindBy(xpath = "//*[@id=\"Desktop_Nav_Mortgages\"]/div[2]/ul[2]/li[3]/a/span")
	public WebElement DropDownOption;
	
//	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	@FindBy(xpath ="//div[@class='masthead-text-container padding-side']/h1")
	public WebElement BuytoLetMortgagesPageTitle;
	
//	@FindBy(xpath = "//h2[contains(text(),'Buy to let mortgages for limited companies')]")
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/ul/li[1]/article/h2")
	public WebElement USPHeader1;
	
//	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[2]/h2")
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/ul/li[2]/article/h2")
	public WebElement USPHeader2;
	
//	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[3]/h2")
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/ul/li[3]/article/h2")
	public WebElement USPHeader3;
	
//	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[4]/h2")
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/ul/li[4]/article/h2")
	public WebElement USPHeader4;
	
	@FindBy(xpath ="//div[@class='fixed-height__container']/h2")
	public WebElement ImageSection1;
	
	@FindBy(xpath ="//div[@class='image-copy-circle__right']/h2")
	public WebElement ImageSection2;
	
//	@FindBy(xpath ="//div[@class='int-banner-text-container']/h2")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/div[1]/article/div[2]/h2[contains(text(),'Multiple properties on one application')]")
	public WebElement ImageSection3;
	
	@FindBy(xpath = "//section[@class='masthead-black-box']/h2")
	public WebElement getBlackBoxHeader;
	
//	@FindBy(xpath ="//*[@aria-label='Buy to let multi property']")
	@FindBy(xpath = "//*[@id=\"Related links\"]/ul/li[1]/div/a")
	public WebElement cardheader1;
	
//	@FindBy(xpath ="//*[@aria-label='Buy to let multi property']")
	@FindBy(xpath = "//*[@id=\"Related links\"]/ul/li[2]/div/a")
	public WebElement cardheader2;
	
//	@FindBy(xpath ="//*[@aria-label='Buy to let multi property']")
	@FindBy(xpath = "//*[@id=\"Related links\"]/ul/li[3]/div/a")
	public WebElement cardheader3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[1]/article/a")
	public WebElement cardheader4;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/article/a")
	public WebElement cardheader5;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/article/a")
	public WebElement cardheader6;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[4]/article/a")
	public WebElement cardheader7;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div/h2")
	public WebElement FAQheader;
}
