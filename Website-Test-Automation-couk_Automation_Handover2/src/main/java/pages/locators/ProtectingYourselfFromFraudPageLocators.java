package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProtectingYourselfFromFraudPageLocators {

	@FindBy(xpath="//a[normalize-space()='Online security and protecting yourself from fraud']")
	public WebElement ProtectingYourselfFromFraudLink;
	
	@FindBy(xpath="//h1[normalize-space()='Online security and protecting yourself from fraud']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//div[@id='protect-yourself']//strong[1]")
	public WebElement TextAreaHeader1;
	
	@FindBy(xpath="(//span[@class='lead-paragraph'][normalize-space()='Identity fraud'])[1]")
	public WebElement TextAreaHeader2;
	
	@FindBy(xpath="//span[@class='lead-paragraph'][normalize-space()='Shopping online']")
	public WebElement TextAreaHeader3;
	
	@FindBy(xpath="//span[@class='lead-paragraph'][normalize-space()='Money mules']")
	public WebElement TextAreaHeader4;
	
	@FindBy(xpath="//h2[normalize-space()='Latest scams']")
	public WebElement AccordianHeader;
	
	@FindBy(xpath="//h3[normalize-space()='Undelivered parcel scams']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="(//div[@class='text-block text-block-grey'])[5]")
	public WebElement AccordianTextArea;
	
	
	
	
	
	
	
	
	
	
	
	
}
