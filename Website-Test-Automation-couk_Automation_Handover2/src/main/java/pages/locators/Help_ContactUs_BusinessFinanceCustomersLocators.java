package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_ContactUs_BusinessFinanceCustomersLocators {
	
	@FindBy(xpath = "//*[@id=\"Menu_Root\"]/div/div[4]/a[1]")
	public WebElement HelpButton;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/span/section/div/a")
	public WebElement ContactUsButton;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/div[1]/h2")
	public WebElement BusinessFinanceCardHeader;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/a")
	public WebElement BusinessFinanceCardCTAButton;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/div/section/div/div/h1")
	public WebElement BusinessFinancePageTitle;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement OneTrustCookies;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div/h2")
	public WebElement Subheader;
	
	@FindBy(xpath = "//h3[contains(text(),' Asset finance ')]")
	public WebElement ExpandOptions;
	
	@FindBy(xpath = "//div[@class='section-body']")
	public WebElement Options1;
}
