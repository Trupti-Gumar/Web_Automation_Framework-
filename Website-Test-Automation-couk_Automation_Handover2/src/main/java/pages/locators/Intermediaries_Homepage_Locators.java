package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_Homepage_Locators {

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;

	@FindBy(xpath = "//a[@aria-label='Intermediaries']")
	public WebElement IntermediariesLink;

	@FindBy(xpath = "//h1[normalize-space()='Aldermore Intermediaries']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Mortgage intermediaries']")
	public WebElement MortgageIntermediariesCardHeader;

	@FindBy(xpath = "//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Mortgages']")
	public WebElement MortgageIntermediariesCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Residential mortgages']")
	public WebElement ResidentialowneroccupiedmortgagesCardHeader;

	@FindBy(xpath = "//a[contains(text(),'Residential owner-occupied')]")
	public WebElement ResidentialowneroccupiedmortgagesCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Buy to let mortgages']")
	public WebElement BuytoletmortgagesCardHeader;

	@FindBy(xpath = "//a[contains(text(),'Buy to Let')]")
	public WebElement BuytoletmortgagesCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Commercial mortgages']")
	public WebElement CommercialMortgagesCardHeader;

	@FindBy(xpath = "//a[contains(text(),'Commercial mortgages')]")
	public WebElement CommercialMortgagesCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Product switching']")
	public WebElement ProductswitchCardHeader;

	@FindBy(xpath = "//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Product switch']")
	public WebElement ProductswitchCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Asset finance']")
	public WebElement AssetfinanceCardHeader;

	@FindBy(xpath = "//a[contains(text(),'Asset Finance')]")
	public WebElement AssetfinanceCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Invoice finance']")
	public WebElement InvoicefinanceCardHeader;

	@FindBy(xpath = "//a[contains(text(),'Invoice Finance')]")
	public WebElement InvoicefinanceCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Property development finance']")
	public WebElement PropertydevelopmentfinanceCardHeader;

	@FindBy(xpath = "//a[normalize-space()='Property Development finance - Intermediaries']")
	public WebElement PropertydevelopmentfinanceCardLink;

}
