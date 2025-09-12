package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_BuytoletmortgagedocumentsLocators {

	@FindBy(xpath = "//span[normalize-space()='Buy to let mortgage documents']")
	public WebElement BuytoletmortgagedocumentsLink;

	@FindBy(xpath = "//h1[normalize-space()='Buy to let mortgage documents for intermediaries']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Residential mortgage documents']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Product switching documents']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Commercial mortgage documents']")
	public WebElement CardHeader3;
	
	@FindBy(xpath="//a[contains(text(),'Residential mortgage documents')]")
	public WebElement CardLink1;
	
	@FindBy(xpath="//a[contains(text(),'Product switching documents')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="//a[contains(text(),'Commercial mortgage documents')]")
	public WebElement CardLink3;
	
}
