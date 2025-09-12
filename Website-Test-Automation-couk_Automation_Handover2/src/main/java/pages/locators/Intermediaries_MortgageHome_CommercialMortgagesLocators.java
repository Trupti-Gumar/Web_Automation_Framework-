package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_CommercialMortgagesLocators {
	
	
@FindBy(xpath = "//*[@id=\"Desktop_Nav_Mortgages\"]/div[1]/a")	
public WebElement MortgageHome;
	
@FindBy(xpath = "//*[@id='cd1d08f3-9298-4ed4-a47d-0166aecc3e8b']/ul/li[5]/div/a")	
public WebElement CommericalMortgages;	

@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
public WebElement CommericalMortgagesPage;

@FindBy(xpath = "//*[@id=\"Key features\"]/article/div/h2")
public WebElement ImagesectionCommericalMortgage;

@FindBy(xpath = "//*[@id=\"Key features\"]/article/div/h2")
public WebElement ImageSectionHeader;

@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div/span/section/h2")
public WebElement QuickLinkheader;

@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div/span/section/ul/li[1]/a/span")
public WebElement MastheadBlackboxLink1;

@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div/span/section/ul/li[2]/a/span")
public WebElement MastheadBlackboxLink2;

@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/section/ul/li[1]/article/h2")
public WebElement DocumentHeader1;

@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/section/ul/li[2]/article/h2")
public WebElement DocumentHeader2;

@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/section/ul/li[3]/article/h2")
public WebElement DocumentHeader3;

@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/section/ul/li[4]/article/h2")
public WebElement DocumentHeader4;

}
