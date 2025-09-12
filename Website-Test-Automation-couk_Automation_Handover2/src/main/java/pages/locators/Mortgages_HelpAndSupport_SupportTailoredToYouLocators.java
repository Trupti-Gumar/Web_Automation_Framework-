package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupport_SupportTailoredToYouLocators {

@FindBy(xpath = "//*[@id='Help during challenging times']/ul/li[1]/div/div[1]/h2")	
public WebElement cardOption;
	
@FindBy(xpath = "//*[@id='Help during challenging times']/ul/li[1]/div/a")
public WebElement CTACardOption;

@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
public WebElement CardPageTitle;

@FindBy(xpath = "//*[@id='How we can support you']/article/div[1]/h2")
public WebElement ImageSection1;

@FindBy(xpath = "//*[@id='money-worries']/article/div[1]/h2")
public WebElement ImageSection2;

@FindBy(xpath = "//*[@id='Bereavement']/article/div[1]/h2")
public WebElement ImageSection3;

@FindBy(xpath ="//*[@id='How we can support you']/article/div[1]/div[2]/a")
public WebElement Link1;

@FindBy(xpath ="//*[@id='money-worries']/article/div[1]/div/p[3]/a")
public WebElement Link2;

@FindBy(xpath = "//*[@id='money-worries']/article/div[1]/div/p[4]/a")
public WebElement Link3;

@FindBy(xpath = "//*[@id='Bereavement']/article/div[1]/div[2]/a")
public WebElement Link4;

@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
public WebElement PageTitle1;

@FindBy(xpath = "//div[@class='masthead-text-container__small']/h1")
public WebElement PageTitle2;

@FindBy(xpath = "//div[@class='masthead-text-container__small']/h1")
public WebElement PageTitle3;

@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
public WebElement PageTitle4;

}
