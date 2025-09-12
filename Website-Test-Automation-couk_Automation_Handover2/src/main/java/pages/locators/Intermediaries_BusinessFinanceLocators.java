package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_BusinessFinanceLocators {
	
	@FindBy(xpath = "//*[@id='Menu_Root']/nav/ul/li[2]/button/span")
	public WebElement BusinessFinanceDropdown;
	
	@FindBy(xpath = "//*[@id='Desktop_Nav_Business_finance']/div[2]/ul/li[1]/a")
	public WebElement BusinessFinanceOptions;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[1]/div/div[1]/h2")
	public WebElement CardHeader1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/div/div[1]/h2")
	public WebElement CardHeader2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/div[1]/h2")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[1]/div/a")
	public WebElement PageTitle1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/div/a")
	public WebElement PageTitle2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/a")
	public WebElement PageTitle3;
}
