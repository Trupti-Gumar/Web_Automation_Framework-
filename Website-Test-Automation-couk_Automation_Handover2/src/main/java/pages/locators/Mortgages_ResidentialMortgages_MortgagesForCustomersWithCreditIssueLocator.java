package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssueLocator {
	
	@FindBy(xpath = "//*[@id='Menu_Root']/nav/ul/li[2]/button")
	public WebElement MortgageNavigationLink;
	
//	@FindBy(xpath = "//span[contains(text(), 'Mortgages for customers with credit issues')]")
	@FindBy(xpath = "//*[@id=\"Desktop_Nav_Mortgages\"]/div[2]/ul[1]/li[4]/a/span")
	public WebElement dropDownOption;
	
//	@FindBy(xpath = "//div[@class='masthead-text-container']/h1")
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement PageTitle;
	
	@FindBy(xpath = "//div[@class = 'image-copy-default__container']/h2")
	public WebElement ImageSectionHeader;
	
	@FindBy(xpath = "//div[@class='accordion_fullwidth background__light-grey-tint margin-bottom margin-side']/h2")
	public WebElement FAQsHeader;

	@FindBy(xpath = "//div[@class='card-more-faq-link background__black margin-bottom margin-side']/h2")
	public WebElement MoreCardHeader;
	
	@FindBy(xpath = "//*[contains(text(),'Mortgage FAQs')]")
	public WebElement CTALink;
	
	@FindBy(xpath = "//div[@class = 'item-container backlink']/div/h1")
	public WebElement CTAPageTitle;
	
//	@FindBy(xpath = "//a[contains(text(),'First time buyer mortgages')]")
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/a")
	public WebElement Cardheader1;
	
//	@FindBy(xpath = "//a[contains(text(),'Self-employed mortgages')]")
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/div/a")
	public WebElement Cardheader2;
	
//	@FindBy(xpath = "//a[contains(text(),'5 tips for improving a poor credit score')]")
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/a")
	public WebElement Cardheader3;
	
	@FindBy(xpath = "//a[contains(text(),'Challenges getting a mortgage with a bad credit score?')]")
	public WebElement Cardheader4;
	
	@FindBy(xpath = "//a[contains(text(),'How to get a self-employed mortgage')]")
	public WebElement Cardheader5;
}
