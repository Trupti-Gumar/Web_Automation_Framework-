package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_MortgagesHelpAndSupport_MortgagesFAQLocators {
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[7]/div/div[1]/h2")
	public WebElement CardName;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[7]/div/a")
	public WebElement CTACardName;
	
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement CardPageTitle;
	
	@FindBy(xpath ="//*[@id=\"General mortgage FAQs\"]/div/h2")
	public WebElement Card1;
	
	@FindBy(xpath = "//*[@id=\"Applying for a mortgage with Aldermore FAQs\"]/div/h2")
	public WebElement Card2;
	
	@FindBy(xpath = "//*[@id=\"c5d3c78c-e9f5-40ff-a5e5-e6d5ecfd41a0\"]/div/h2")
	public WebElement Card3;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/div[1]/h2")
	public WebElement Cardname1;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/div/div[1]/h2")
	public WebElement Cardname2;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/div/div[1]/h2")
	public WebElement Cardname3;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/a")
	public WebElement CTACard1;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/div/a")
	public WebElement CTACard2;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/div/a")
	public WebElement CTACard3;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/div/aside/div/div/h1")
	public WebElement PageTitle1;
	
	@FindBy(xpath = "//*[@id=\"b071da18-bc52-4608-a7cf-8f82eab9ca06\"]/div/aside/div/div/h1")
	public WebElement PageTitle2;
	
	@FindBy(xpath = "//*[@id=\"551c4101-a180-4aeb-8e89-579e45233c5d\"]/div/aside/div/div/h1")
	public WebElement PageTitle3;
}
