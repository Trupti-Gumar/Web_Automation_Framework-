package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_ConveyancingspecialistbuytoletLocators {

	@FindBy(xpath = "//span[normalize-space()='Conveyancing - specialist buy to let']")
	public WebElement ConveyancingspecialistbuytoletLink;

	@FindBy(xpath = "//h1[normalize-space()='Conveyancing for specialist buy to let applications']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Multi property buy to let mortgage']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Speak to our team']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Buy to let mortgage documents']")
	public WebElement CardHeader3;
	
	@FindBy(xpath="//a[contains(text(),'Multi property buy to let mortgage')]")
	public WebElement CardLink1;
	
	@FindBy(xpath="//a[contains(text(),'Residential and Buy to Let mortgages contact information')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="(//a[normalize-space()='Buy to Let'])[1]")
	public WebElement CardLink3;
	
}
