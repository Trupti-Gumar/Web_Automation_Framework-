package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_AffordabilitycalculatorsLocators {

	@FindBy(xpath = "//span[normalize-space()='Affordability Calculators']")
	public WebElement AffordabilitycalculatorsLink;

	@FindBy(xpath = "//h1[normalize-space()='Calculators']")
	public WebElement MastheadHeader;

	@FindBy(xpath="//span[normalize-space()='Residential']")
	public WebElement TabHeader1;
	
	@FindBy(xpath="//span[normalize-space()='Buy to Let']")
	public WebElement TabHeader2;

}
