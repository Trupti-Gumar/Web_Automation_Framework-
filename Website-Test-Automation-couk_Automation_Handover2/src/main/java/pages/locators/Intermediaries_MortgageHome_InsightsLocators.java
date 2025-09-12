package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_InsightsLocators {

	@FindBy(xpath = "//span[normalize-space()='Insights']")
	public WebElement InsightsLink;

	@FindBy(xpath = "//h1[normalize-space()='Insights for mortgage intermediaries']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Storm before the Calm?']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Understanding the New Build Sector']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='5 Easy Ways to Refresh your Business']")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "//h2[normalize-space()='5 Ways to get into the New Build Sector']")
	public WebElement CardHeader4;
	
	@FindBy(xpath="//a[contains(text(),'Storm before the Calm?')]")
	public WebElement CardLink1;
	
	@FindBy(xpath="//a[contains(text(),'Understanding the New Build Sector')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="//a[contains(text(),'5 Easy Ways to Refresh your Business')]")
	public WebElement CardLink3;
	
	@FindBy(xpath="//a[contains(text(),'5 Ways to get into the New Build Sector')]")
	public WebElement CardLink4;
	
}
