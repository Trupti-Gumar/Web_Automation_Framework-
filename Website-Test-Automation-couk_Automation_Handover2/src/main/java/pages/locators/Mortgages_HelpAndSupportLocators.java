package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupportLocators {

//   @FindBy(xpath ="//*[@id='Desktop_Nav_Mortgages']/div[2]/ul[4]/li[1]/a")
	@FindBy(xpath = "//*[@id='Desktop_Nav_Mortgages']/div[2]/ul[3]/li[1]/a")
   public WebElement HelpandSupportOption;
   
   @FindBy(xpath = "//h1[@class='masthead-small__header']")
   public WebElement redirectedPageTitle;
   
   @FindBy(xpath = "//*[@id='Help during challenging times']/ul/li[1]/div/a")
   public WebElement CardHeader1;
   
   @FindBy(xpath = "//*[@id='Help during challenging times']/ul/li[2]/div/a")
   public WebElement CardHeader2;
   
   @FindBy(xpath = "//*[@id='Help during challenging times']/ul/li[3]/div/a")
   public WebElement CardHeader3;

   @FindBy(xpath = "//*[@id='help-category']/ul/li[1]/div/a")
   public WebElement CardHeader4;
   
   @FindBy(xpath = "//*[@id='help-category']/ul/li[2]/div/a")
   public WebElement CardHeader5;
   
   @FindBy(xpath = "//*[@id='help-category']/ul/li[3]/div/a")
   public WebElement CardHeader6;

   @FindBy(xpath = "//*[@id='help-category']/ul/li[4]/div/a")
   public WebElement CardHeader7;
   
   @FindBy(xpath = "//*[@id='help-category']/ul/li[5]/div/a")
   public WebElement CardHeader8;
   
   @FindBy(xpath ="//*[@id='Fraud']/article/div[1]/h2")
   public WebElement ImageSectionCard1;
   
   @FindBy(xpath ="//div[2]/div/div[6]/article/div[1]/h2")
   public WebElement ImageSectionCard2;
   
   @FindBy(xpath = "//span[@class='masthead-blackbox']/section[1]/h2")
   public WebElement BlackBoxHeader;
   
   @FindBy(xpath = "//span[@class='masthead-blackbox']/section[1]/div/a")
   public WebElement clickOnBlackOption;
   
 //  @FindBy(xpath = "//div[@class ='masthead-small-text-container']/h1")
   @FindBy(xpath = "//div[@class='masthead-small-text-container padding-side']/h1")
   public WebElement PageTitleHeader;
   
   //  @FindBy(xpath = "//div[@class ='masthead-small-text-container']/h1")
   @FindBy(xpath = "//div[@class='masthead-small-text-container padding-side']/h1")
   public WebElement CardPageTitleheader;
}
