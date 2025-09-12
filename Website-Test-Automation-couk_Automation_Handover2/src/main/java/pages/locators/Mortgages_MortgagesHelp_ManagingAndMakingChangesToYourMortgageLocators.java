package pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageLocators {
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/div/div[1]/h2")
	public WebElement cardOption;

	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[3]/div/a")
	public WebElement cardOptionCTA;
	
	@FindBy(xpath = "//div[@class='masthead-small-text-container']/h1")
	public WebElement PAgeTitle;
	
	@FindBy(xpath = "//*[@class='umb-block__root  ']/div/h2")
	public WebElement header;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[1]/div[1]/button/h3")
	public WebElement subheader1;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[1]/button/h3")
	public WebElement subheader2;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[3]/div[1]/button/h3")
	public WebElement subheader3;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[4]/div[1]/button/h3")
	public WebElement subheader4;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[5]/div[1]/button/h3")
	public WebElement subheader5;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[6]/div[1]/button/h3")
	public WebElement subheader6;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[7]/div[1]/button/h3")
	public WebElement subheader7;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[8]/div[1]/button/h3")
	public WebElement subheader8;
}
