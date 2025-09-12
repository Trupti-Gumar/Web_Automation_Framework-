package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_BusinessFinance_CommericalRealEstateLocators {
	
	@FindBy(xpath ="//*[@id=\"Desktop_Nav_Business_finance\"]/div[2]/ul/li[4]/a/span")
	public WebElement CommericalRealEstate;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement CommericalRealEstateHeader;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/h2")
	public WebElement CommericalRealEstateQuickHeader;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/ul/li[1]/a/span")
	public WebElement QuickLink1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/ul/li[2]/a/span")
	public WebElement QuickLink2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/ul/li[1]/article/h2")
	public WebElement USPheader1;

	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/ul/li[2]/article/h2")
	public WebElement USPheader2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/ul/li[3]/article/h2")
	public WebElement USPheader3;
	
	@FindBy(xpath = "//*[@id=\"Purpose built student accommodation (PBSA)\"]/article/div[1]/h2")
	public WebElement ImageHeader1;
	
	@FindBy(xpath = "//*[@id=\"Care homes\"]/article/div[1]/h2")
	public WebElement ImageHeader2;
	
	@FindBy(xpath = "//*[@id=\"Build to Rent (BTR)\"]/article/div[1]/h2")
	public WebElement ImageHeader3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[1]/div/a")
	public WebElement CardHeader1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/div/a")
	public WebElement CardHeader2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/a")
	public WebElement CTABanner;
}
