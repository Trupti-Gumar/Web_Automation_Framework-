package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_Mortgages_ToolsandlatestinformationLocators {

	@FindBy(xpath = "//a[normalize-space()='Tools and latest information']")
	public WebElement ToolsandlatestinformationLink;

	@FindBy(xpath = "//h1[normalize-space()='Tools and useful information']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Affordability calculators']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Latest service levels']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Latest news and updates']")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "//h2[normalize-space()='Residential and Buy to Let contact information']")
	public WebElement CardHeader4;

	@FindBy(xpath = "//h2[normalize-space()='Commercial mortgages contact information']")
	public WebElement CardHeader5;
	
	@FindBy(xpath = "//h2[normalize-space()='Platinum Broker service proposition']")
	public WebElement CardHeader6;
	
	@FindBy(xpath = "//h2[contains(text(),'backing you and your clients')]")
	public WebElement CardHeader7;
	
	@FindBy(xpath="//a[contains(text(),'Calculators')]")
	public WebElement CardLink1;
	
	@FindBy(xpath="//a[contains(text(),'Our latest service levels')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="//a[contains(text(),'Latest updates')]")
	public WebElement CardLink3;
	
	@FindBy(xpath="//a[contains(text(),'Residential and Buy to Let mortgages contact information')]")
	public WebElement CardLink4;
	
	@FindBy(xpath="//a[contains(text(),'Commercial mortgages contact information')]")
	public WebElement CardLink5;
	
	@FindBy(xpath="//a[contains(text(),'Our Platinum Broker service proposition')]")
	public WebElement CardLink6;
	
	@FindBy(xpath="//a[contains(text(),'Our core propositions')]")
	public WebElement CardLink7;

}
