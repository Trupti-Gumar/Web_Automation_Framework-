package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_ProductswitchLocators {

	@FindBy(xpath = "//span[normalize-space()='Product switch']")
	public WebElement ProductswitchLink;

	@FindBy(xpath = "//h1[normalize-space()='Hassle free product switching']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Quick links']")
	public WebElement MastheadBlackboxHeader;

	@FindBy(xpath = "//span[normalize-space()='Product switch guide']")
	public WebElement MastheadBlackboxLink1;

	@FindBy(xpath = "//span[normalize-space()='How to switch guide']")
	public WebElement MastheadBlackboxLink2;

	@FindBy(xpath = "//span[normalize-space()='Login or register']")
	public WebElement MastheadBlackboxLink3;

	@FindBy(xpath = "//h2[normalize-space()='Great rewards']")
	public WebElement USPHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Fee free & hassle free']")
	public WebElement USPHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Switch alerts']")
	public WebElement USPHeader3;

	@FindBy(xpath = "//h2[normalize-space()='Residential Broker portal']")
	public WebElement USPHeader4;

	@FindBy(xpath = "//h2[@class='text__white h2-heavy__header image-copy__header']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[@class='text__black h2-heavy__header image-copy__header']")
	public WebElement ImageCopyHeader2;

	@FindBy(xpath = "//a[normalize-space()='Login to submit business']")
	public WebElement CTABanner;

	@FindBy(xpath = "//h2[normalize-space()='Product switch mortgage guide']")
	public WebElement UsefuldocumentsHeader1;

	@FindBy(xpath = "//h2[normalize-space()='How to switch your clients online']")
	public WebElement UsefuldocumentsHeader2;

	@FindBy(xpath = "//h2[normalize-space()='View all documents']")
	public WebElement UsefuldocumentsHeader3;
	
	@FindBy(xpath="//a[contains(text(),'Intermediaries documents')]")
	public WebElement ViewalldocumentsCardLink;
	
	@FindBy(xpath = "//a[normalize-space()='Login or register to submit business']")
	public WebElement BannerHeader;

}
