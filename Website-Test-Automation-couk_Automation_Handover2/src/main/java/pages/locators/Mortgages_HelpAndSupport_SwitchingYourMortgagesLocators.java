package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupport_SwitchingYourMortgagesLocators {

	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[5]/div/div[1]/h2")
	public WebElement CardName;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[5]/div/a")
    public WebElement CardCTAbutton;
	
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement PageTitle;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/div/span/section/h2")
	public WebElement subheader1;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/ul/li[1]/article/h2")
	public WebElement subheader2;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/ul/li[2]/article/h2")
	public WebElement subheader3;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/ul/li[3]/article/h2")
	public WebElement subheader4;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/ul/li[4]/article/h2")
	public WebElement subheader5;

	@FindBy(xpath = "//*[@id='When can you switch?']/article/div[1]/h2")
	public WebElement ImageSectionheader1;
	
	@FindBy(xpath = "//*[@id='Who can switch?']/article/div[1]/h2")
	public WebElement ImageSectionheader2;
	
	@FindBy(xpath = "//*[@id='Execution only switching']/div/article/div[2]/h2")
	public WebElement ImageSectionheader3;
}
