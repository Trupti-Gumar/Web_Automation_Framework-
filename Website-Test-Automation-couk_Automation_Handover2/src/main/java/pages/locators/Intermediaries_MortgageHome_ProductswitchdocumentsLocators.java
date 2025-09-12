package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_ProductswitchdocumentsLocators {

	@FindBy(xpath = "//span[normalize-space()='Product switch documents']")
	public WebElement ProductswitchdocumentsLink;

	@FindBy(xpath = "//h1[normalize-space()='Mortgage product switch documents for intermediaries']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Buy to let mortgage documents']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Residential mortgage documents']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Commercial mortgage documents']")
	public WebElement CardHeader3;
	
	@FindBy(xpath="//a[contains(text(),'Buy to let mortgage documents')]")
	public WebElement CardLink1;
	
	@FindBy(xpath="//a[contains(text(),'Residential mortgage documents')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="//a[contains(text(),'Commercial mortgage documents')]")
	public WebElement CardLink3;
	
}
