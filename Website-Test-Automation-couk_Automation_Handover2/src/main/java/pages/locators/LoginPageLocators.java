package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	@FindBy(xpath = "//span[contains(@class,'navigation-menu__button-caption__span')][normalize-space()='Login']")
	public WebElement LoginLink;
	
	@FindBy(xpath = "//h1[normalize-space()='Login centre']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath = "//span[normalize-space()='All']")
	public WebElement TabHeader1;
	
	@FindBy(xpath = "//span[@class='anchor-link__tab-bar__label'][normalize-space()='Savings']")
	public WebElement TabHeader2;
	
	@FindBy(xpath = "//span[@class='anchor-link__tab-bar__label'][normalize-space()='Mortgages']")
	public WebElement TabHeader3;
	
	@FindBy(xpath = "//span[@class='anchor-link__tab-bar__label'][normalize-space()='Business finance']")
	public WebElement TabHeader4;
	
	@FindBy(xpath = "//div[@class='tab__panel']//h2[@class='h2-heavy__header'][normalize-space()='Savings']")
	public WebElement TextHeader1;
	
	@FindBy(xpath = "//div[@class='tab__panel']//h2[@class='h2-heavy__header'][normalize-space()='Mortgages']")
	public WebElement TextHeader2;
	
	@FindBy(xpath = "//div[@class='tab__panel']//h2[@class='h2-heavy__header'][normalize-space()='Business finance']")
	public WebElement TextHeader3;
	
	@FindBy(xpath = "(//h2[@class='h2-light__header product-card-half-height__header'][normalize-space()='Personal savings internet banking'])[1]")
	public WebElement CardHeader1;
	
	@FindBy(xpath = "(//h2[@class='h2-light__header product-card-half-height__header'][normalize-space()='Business savings internet banking'])[1]")
	public WebElement CardHeader2;
	
	@FindBy(xpath = "(//h2[@class='h2-light__header product-card-half-height__header'][normalize-space()='Residential mortgages broker portal'])[1]")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "(//h2[@class='h2-light__header product-card-half-height__header'][normalize-space()='Specialist buy to let mortgage portal'])[1]")
	public WebElement CardHeader4;
	
	@FindBy(xpath = "(//h2[@class='h2-light__header product-card-half-height__header'][normalize-space()='Asset finance Asset Backer'])[1]")
	public WebElement CardHeader5;
	
	@FindBy(xpath = "(//h2[@class='h2-light__header product-card-half-height__header'][normalize-space()='Invoice finance E3'])[1]")
	public WebElement CardHeader6;
	
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[1]")
	public WebElement CardLink1;
	
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[2]")
	public WebElement CardLink2;
	
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[3]")
	public WebElement CardLink3;
	
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[4]")
	public WebElement CardLink4;
	
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[5]")
	public WebElement CardLink5;
	
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[6]")
	public WebElement CardLink6;	
	
}
