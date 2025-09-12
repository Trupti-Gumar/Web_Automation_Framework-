package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesLocators {
	
	
	@FindBy (xpath = "//li[@aria-label= 'First time buyer mortgages']")
	public WebElement FirstTimeOption;
	
//	@FindBy(xpath = "//div[@class ='masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class ='masthead-text-container padding-side']/h1")
	public WebElement FirstTimePageTitle;
	
	@FindBy(xpath = "//div[@class='image-copy-default__container']/h2")
	public WebElement ImageSectionHeader1;
	
//	@FindBy(xpath ="//div[@class='image-copy-circle__right']/h2")
	@FindBy(xpath = "//div[@class='image-copy-default__container']/h2[contains(text(),'Real life stories')]")
	public WebElement ImageSectionHeader2;
	
	@FindBy(xpath = "//div[@class='accordion_fullwidth background__light-grey-tint margin-bottom margin-side']/h2")
	public WebElement FAQsHeader;
	
	@FindBy(xpath = "//h2[@class = 'card-more-faq__title']")
	public WebElement Morecardheader;
	
	//@FindBy(xpath = "//*[contains(text(),'View all mortgage FAQs')]")
	@FindBy(xpath = "//*[@class='umb-block__root  ']/div/div/div[2]/a")
	public WebElement CTAFAQslink;

//	@FindBy(xpath = "//h1[@class = 'masthead-small__header']")
	@FindBy(xpath = "//div[@class= 'masthead-text-container padding-side']/h1")
	public WebElement FAQsPageTitle;
	
//	@FindBy(xpath = "//h2[contains(text(),'Self-employed mortgages')]")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/a")
	public WebElement CardheaderTitle1;
	
//	@FindBy(xpath = "//h2[contains(text(),'Less than perfect credit')]")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/div/a")
	public WebElement CardheaderTitle2;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/div/a")
	public WebElement CardheaderTitle3;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/article/a")
	public WebElement CardheaderTitle4;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[2]/article/a")
	public WebElement CardheaderTitle5;
	
//	@FindBy(xpath = "//div[@class = 'image-copy__cta']/*[@aria-label='Find out more']")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/article/div[1]/div[2]/a")
	public WebElement CTAButton;
	
	@FindBy(xpath = "//div[@class = 'item-container backlink']/div/h1")
	public WebElement PageTitle;
}
