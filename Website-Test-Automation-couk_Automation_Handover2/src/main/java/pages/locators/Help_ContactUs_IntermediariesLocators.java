package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_ContactUs_IntermediariesLocators {
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[4]/div/div[1]/h2")
	public WebElement IntermediariesCardname;

	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[4]/div/a")
	public WebElement IntermediariesCTAButton;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement IntermediariesPageTitle;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[1]/div/div[1]/h2") 
	public WebElement Card1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/div/div[1]/h2")
	public WebElement Card2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/div[1]/h2")
	public WebElement Card3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[4]/div/div[1]/h2")
	public WebElement Card4;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[5]/div/div[1]/h2")
	public WebElement Card5;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[1]/div/a")
	public WebElement CardCTA1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[2]/div/a")
	public WebElement CardCTA2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[3]/div/a")
	public WebElement CardCTA3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[4]/div/a")
	public WebElement CardCTA4;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[5]/div/a")
	public WebElement CardCTA5;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div/aside/div/div/h1")
	public WebElement CardPagetitle1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement CardPagetitle2;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement CardPagetitle3;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement CardPagetitle4;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement CardPagetitle5;
}
