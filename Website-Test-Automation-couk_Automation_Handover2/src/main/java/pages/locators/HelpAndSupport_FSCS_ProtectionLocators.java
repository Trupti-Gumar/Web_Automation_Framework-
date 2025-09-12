package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpAndSupport_FSCS_ProtectionLocators {

	@FindBy(xpath = "//span[normalize-space()='Savings']")
	public WebElement SavingsLink;
	
	@FindBy(xpath="//span[normalize-space()='FSCS Protection']")
	public WebElement FSCSProtectionLink;
	
	//Masthead
	
	@FindBy(xpath="//h1[normalize-space()='FSCS Protection']")
	public WebElement MastheadHeader;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Keeping your data and money safe']")
	public WebElement ImageCopySectionHeader;
	
	@FindBy(xpath="//a[normalize-space()='Take Five']")
	public WebElement TakeFiveWebsiteLink;
	
	
	//Cards
	
	@FindBy(xpath="//h2[normalize-space()='Personal savings help']")
	public WebElement PersonalSavingsHelpCardHeader;
	
	@FindBy(xpath="//a[normalize-space()='Personal savings help']")
	public WebElement PersonalSavingsHelpCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Personal savings log in']")
	public WebElement PersonalSavingsLoginCardLink;
	
	@FindBy(xpath="//h2[normalize-space()='Personal savings log in']")
	public WebElement PersonalSavingsLoginCardHeader;
	
}
