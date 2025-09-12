package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_HelpAndSupport_JargonBusterLocators {
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[6]/div/div[1]/h2")
	public WebElement Cardname;

	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[6]/div/a")
	public WebElement CardCTAButton;
	
	@FindBy(xpath = "//div[@class='masthead-small-text-container padding-side']/h1")
	public WebElement PageTitle;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/a")
	public WebElement CTALink;
	
	@FindBy(xpath = "//div[@class='masthead-text-container padding-side']/h1")
	public WebElement CTAPageTitle;
	
}
