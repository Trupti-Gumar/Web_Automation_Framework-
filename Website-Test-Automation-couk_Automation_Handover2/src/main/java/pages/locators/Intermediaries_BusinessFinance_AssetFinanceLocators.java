package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_BusinessFinance_AssetFinanceLocators {
	
	
	@FindBy(xpath = "//*[@id=\"Desktop_Nav_Business_finance\"]/div[2]/ul/li[2]/a/span")
	public WebElement AssetFinance;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement MastheadHeader;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/h2")
	public WebElement BlackBoxheader;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/ul/li[1]/article/h2")
	public WebElement USPheader1;

	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/ul/li[2]/article/h2")
	public WebElement USPheader2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/ul/li[3]/article/h2")
	public WebElement USPheader3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/ul/li[1]/a/span")
	public WebElement BlackBoxOption1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/ul/li[2]/a/span")
	public WebElement BlackBoxOption2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/ul/li[3]/a/span")
	public WebElement BlackBoxOption3;
	
	@FindBy(xpath = "//*[@id=\"57ca71e9-9f5b-4d9e-87bc-6a34093e1a38\"]/ul/li[1]/div/a")
	public WebElement Card1;
	
	@FindBy(xpath = "//*[@id=\"57ca71e9-9f5b-4d9e-87bc-6a34093e1a38\"]/ul/li[2]/div/a")
	public WebElement Card2;
	
	@FindBy(xpath = "//*[@id=\"57ca71e9-9f5b-4d9e-87bc-6a34093e1a38\"]/ul/li[3]/div/a")
	public WebElement Card3;
	
	@FindBy(xpath = "//*[@id=\"57ca71e9-9f5b-4d9e-87bc-6a34093e1a38\"]/ul/li[4]/div/a")
	public WebElement Card4;
	
	@FindBy(xpath = "//*[@id=\"52c809a0-9314-49b0-a8d5-3787b1c0333e\"]/ul/li/div/a")
	public WebElement Card5;
	
	@FindBy(xpath = "//*[@id=\"7bb88895-57d9-4238-a6a4-0f7af644d04b\"]/ul/li[1]/article/a")
	public WebElement Card6;
	
	@FindBy(xpath = "//*[@id=\"7bb88895-57d9-4238-a6a4-0f7af644d04b\"]/ul/li[2]/article/a")
	public WebElement Card7;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/a")
	public WebElement CTABanner1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement CTABannerPageTitle;
}
