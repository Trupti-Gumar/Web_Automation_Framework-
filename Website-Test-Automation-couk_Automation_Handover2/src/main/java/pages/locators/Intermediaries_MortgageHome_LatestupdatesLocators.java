package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_LatestupdatesLocators {

	@FindBy(xpath = "//span[normalize-space()='Latest updates']")
	public WebElement LatestupdatesLink;

	@FindBy(xpath = "//h1[normalize-space()='Latest updates']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath = "//a[normalize-space()='current turnaround times.']")
	public WebElement recentIntermediaryUpdatesLink;
	
}
