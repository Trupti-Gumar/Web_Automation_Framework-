package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpAndSupport_ContactUsLocators {

	@FindBy(xpath = "//span[normalize-space()='Savings']")
	public WebElement SavingsLink;

	@FindBy(xpath="//a[@class='navigation__menu-item__link ald-focus ald_nav_top_nav_sub']//span[@class='navigation__menu-item__span'][normalize-space()='Contact us']")
	public WebElement ContactUSLink;

	@FindBy(xpath = "//p[contains(text(),'re currently experiencing high call volumes and it')]")
	public WebElement AlertComponent;

	@FindBy(xpath = "//button[@aria-label='Expand or collapse Alert']//*[name()='svg']")
	public WebElement AlertExpandCollapseButton;

	@FindBy(xpath="//a[@class='ald_cta_quick_link black ald-focus__button ald-underline-hover']")
	public WebElement MastheadBackLink;

	@FindBy(xpath="//h1[normalize-space()='Contact information for savings customers']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Email us']")
	public WebElement EmailUSContactCard;

	@FindBy(xpath = "//h2[normalize-space()='Message us']")
	public WebElement MessageUSContactCard;

	@FindBy(xpath = "//h2[normalize-space()='Write to us']")
	public WebElement WriteToUSContactCard;

	@FindBy(xpath = "//h2[normalize-space()='Call us']")
	public WebElement CallUSContactCard;
	
	@FindBy(xpath="//h3[normalize-space()='Personal savings']")
	public WebElement PersonalsavingsLink;
	

}
