package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_MortagagesHelpAndSupport_ContactUsLocators {
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[8]/div/div[1]/h2")
	public WebElement CardName;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom margin-side\"]/ul/li[8]/div/a")
	public WebElement CardCTA;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/section/div/div/h1")
	public WebElement PageTitle;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div[1]/h2[contains(text(),'Residential and buy to let mortgage customers')]")
	public WebElement Subheader1;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root  \"]/div[1]/h2[contains(text(),'Commercial mortgage customers')]")
	public WebElement Subheader2;
}
