package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateDeposit_TermsAndConditionsPageLocators {

	@FindBy(xpath="//a[normalize-space()='Legal']")
	public WebElement BackLink;
	
	@FindBy(xpath="//span[normalize-space()='Terms and conditions']")
	public WebElement TermsAndConditionLink;
	
	@FindBy(xpath="//h1[normalize-space()='Terms and conditions']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Terms and conditions']")
	public WebElement AccordianHeader;
	
	@FindBy(xpath="//h3[normalize-space()='Copyright']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="//p[contains(text(),'All website design, text, graphics, the selection ')]")
	public WebElement AccordianText;
}
