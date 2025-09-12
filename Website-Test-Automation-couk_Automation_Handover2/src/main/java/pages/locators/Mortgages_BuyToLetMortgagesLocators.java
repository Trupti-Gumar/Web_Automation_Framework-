package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_BuyToLetMortgagesLocators {

	@FindBy(xpath = "//*[@id='Menu_Root']/nav/ul/li[2]/button")
	public WebElement MortgageNavigationLink;
	
	@FindBy(xpath = "//a[@aria-label ='Buy to let mortgages']")
	public WebElement BuyToLetOption;
	
//	@FindBy(xpath = "//div[@class= 'masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class= 'masthead-text-container padding-side']/h1")
	public WebElement BuyToLetPageTitle;
	
//	@FindBy(xpath = "//div[@class='umb-block__root  ']/section/article[1]/h2")
	@FindBy(xpath = "//div[@class='umb-block__root  ']/ul/li[1]/article[1]/h2")
	public WebElement USPHeader1;
	
//	@FindBy(xpath = "//div[@class='umb-block__root  ']/section/article[2]/h2")
	@FindBy(xpath = "//div[@class='umb-block__root  ']/ul/li[2]/article[1]/h2")
	public WebElement USPHeader2;
	
//	@FindBy(xpath = "//div[@class='umb-block__root  ']/section/article[3]/h2")
	@FindBy(xpath = "//div[@class='umb-block__root  ']/ul/li[3]/article[1]/h2")
	public WebElement USPHeader3;
	
//	@FindBy(xpath = "//div[@class='umb-block__root  ']/section/article[4]/h2")
	@FindBy(xpath = "//div[@class='umb-block__root  ']/ul/li[4]/article[1]/h2")
	public WebElement USPHeader4;
	
	
	@FindBy(xpath = "//div[@class='image-copy-slant__container']/h2")
	public WebElement ImageHeader1;
	
	@FindBy(xpath ="//div[@class='image-copy-circle__right']/h2")
	public WebElement ImageHeader2;
	
	@FindBy(xpath ="//div[@class='int-banner-text-container']/h2")
	public WebElement ImageHeader3;
	
	@FindBy(xpath = "//section[@class='masthead-black-box']/h2")
	public WebElement QuickLinkHeader;
	
	@FindBy(xpath = "//span[contains(text(),'Limited company buy to let mortgages')]")
	public WebElement QuickLinkoption1;
	
	@FindBy(xpath ="//span[contains(text(),'Customer support')]")
	public WebElement QuickLinkoption2;
	
	@FindBy(xpath ="//span[contains(text(),'Request a callback')]")
	public WebElement QuickLinkoption3;
	
	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	public WebElement Option1TitlePage;
	
	@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
	public WebElement Option2TitlePage;
	
	@FindBy(xpath = "//title[contains(text(),'Contact information for mortgage customers')]")
	public WebElement Option3TitlePage;
	
	@FindBy(xpath ="//a[contains(text(),'Buy to let mortgages for limited companies')]")
	public WebElement CardHeader1;
	
//	@FindBy(xpath ="//a[contains(text(),'Residential owner occupied mortgages')]")
	@FindBy(xpath = "//*[@id='Related links']/ul/li[2]/div/a")
	public WebElement CardHeader2;
	
	@FindBy(xpath ="//a[contains(text(),'Mortgages help and support')]")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/article/a")
	public WebElement CardHeader4;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/article/a")
	public WebElement CardHeader5;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/article/a")
	public WebElement CardHeader6;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[4]/article/a")
	public WebElement CardHeader7;
	
	@FindBy(xpath ="//div[@class='accordion_fullwidth background__light-grey-tint margin-bottom margin-side']/h2")
	public WebElement FAQHeader;
	
	@FindBy(xpath ="//div[@class='card-more-faq-link background__black margin-bottom margin-side']/h2")
	public WebElement MoreCardHeader;
	
	@FindBy(xpath ="//a[@class='ald_cta_textlink white__text ald-focus__button']")
	public WebElement CTAbutton;
	
	@FindBy(xpath ="//div[@class = 'item-container backlink']/div/h1")
	public WebElement PageTitle;
}
