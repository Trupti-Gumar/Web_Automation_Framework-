package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupport_BereavementGuideLocators {
	
//	@FindBy(xpath ="//*[@id='Desktop_Nav_Mortgages']/div[2]/ul[4]/li[5]/a/span")
	@FindBy(xpath ="//*[@id=\"Desktop_Nav_Mortgages\"]/div[2]/ul[3]/li[5]/a/span")
	public WebElement Bereavement_guide;
	
//	@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
	@FindBy(xpath= "//div[@class='masthead-small-text-container padding-side']/h1")
	public WebElement BereavementGuidePageTitle;
	
	@FindBy(xpath = "//*[@id='What to do first']/div/h2")
	public WebElement header1;
	
//	@FindBy(xpath = "//*[@id='What to send to us']/div/h2")
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div[1]/h2[contains(text(),\"Terms you'll hear\")]")
	public WebElement header2;
	
	@FindBy(xpath = "//div[@class='page-control-container__column']/div/h2")
	public WebElement header3;
	
	@FindBy(xpath = "//*[@id='How to contact us']/div/h2")
	public WebElement header4;
	
	@FindBy(xpath = "//*[@id='bereavement-13450']/div/div/div/div/p/a")
	public WebElement LinkS;
	
	@FindBy(xpath = "//*[@class='masthead-small-text-container']/h1")
	public WebElement LinkPageTitle;

}
