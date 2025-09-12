package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageLocators {

@FindBy(xpath = "//div[@class='umb-block__root margin-bottom margin-side']/ul/li[4]/div/div[1]/h2")
public WebElement CardName;

@FindBy(xpath = "/html/body/div[3]/div/div[3]/ul/li[4]/div/a")
public WebElement CardNAmeCTA;
	
@FindBy(xpath = "//div[@class='masthead-small-text-container padding-side']/h1")
public WebElement PageTitle;

@FindBy(xpath = "//*[@id='What you could borrow for']/article/div[1]/h2")
public WebElement ImageHeader1;

@FindBy(xpath = "//*[@id='Eligibility']/article/div[1]/h2")
public WebElement ImageHeader2;

@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/div/span/section/h2")
public WebElement ImageHeader3;

@FindBy(xpath = "//*[@id='Eligibility']/article/div[1]/div[2]/a")
public WebElement ImageCTAbutton;
	
@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/div/section/div/div/h1")
public WebElement CTAPageTitle;

}
