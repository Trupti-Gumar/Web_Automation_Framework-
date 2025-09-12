package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_PlatinumbrokerservicepropositionLocators {

	@FindBy(xpath = "//span[normalize-space()='Platinum Broker service proposition']")
	public WebElement PlatinumbrokerservicepropositionLink;

	@FindBy(xpath = "//h1[normalize-space()='Platinum Broker service proposition']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Introducing Platinum Broker']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Benefits of Platinum Broker']")
	public WebElement ImageCopyHeader2;

	@FindBy(xpath="//h2[normalize-space()='Affordability calculators']")
	public WebElement CardHeader1;
	
	@FindBy(xpath="//a[contains(text(),'calculators')]")
	public WebElement CardLink1;
//	@FindBy(xpath="//h2[normalize-space()='Affordability calculators']")
//	public WebElement CardLink1;
	
	@FindBy(xpath="//h2[normalize-space()='Product & eligibility guides']")
	public WebElement CardHeader2;
	
	@FindBy(xpath="//a[contains(text(),'Intermediaries mortgage documents')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="//h2[normalize-space()='Contact us']")
	public WebElement CardHeader3;
	
	@FindBy(xpath="//a[contains(text(),'Contact us')]")
	public WebElement CardLink3;
	

}
