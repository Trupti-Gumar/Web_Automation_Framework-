package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpAndSupport_BereavementGuideLocators {

	@FindBy(xpath = "//span[normalize-space()='Savings']")
	public WebElement SavingsLink;

	@FindBy(xpath = "//span[normalize-space()='Bereavement guide']")
	public WebElement BereavementLink;

	// Masthead small

	@FindBy(xpath = "//h1[normalize-space()='What to do when someone dies']")
	public WebElement MastheadHeader;

	// Text Blocks

	@FindBy(xpath="//h2[normalize-space()='What do I need to do?']")
	public WebElement TextBlock1;

	@FindBy(xpath="//div[@id='terminology']//h2[@class='h2-heavy__header']")
	public WebElement TextBlock2;

	@FindBy(xpath="//h2[normalize-space()='If you need help with funeral expenses:']")
	public WebElement TextBlock3;

	@FindBy(xpath="//h2[normalize-space()='If you need help paying inheritance tax:']")
	public WebElement TextBlock4;

	@FindBy(xpath="//h2[contains(text(),'We’re here to help')]")
	public WebElement TextBlock5;

	// Accordian

	@FindBy(xpath = "//h2[@class='h2-heavy__header accordion__header']")
	public WebElement Accordianheader;

	@FindBy(xpath="//h3[contains(text(),'If you and your loved one had an Aldermore savings')]")
	public WebElement AccordianLink;

	@FindBy(xpath="//p[contains(text(),'Send us the original or a copy of the death certif')]")
	public WebElement AccordianTextBlock;

	// Morecard

	@FindBy(xpath = "//h2[normalize-space()='Do you need more help?']")
	public WebElement MorecardTitle;

	@FindBy(xpath = "//a[normalize-space()='Get in touch']")
	public WebElement MorecardLink;

	// Cards

	@FindBy(xpath = "//h2[normalize-space()='Personal savings help and support']")
	public WebElement PersonalSavingsCardHeader;

	@FindBy(xpath = "//a[normalize-space()='Personal savings help and support']")
	public WebElement PersonalSavingsCardLink;

	@FindBy(xpath = "//h2[normalize-space()='Contact us']")
	public WebElement ContactUsCardHeader;

	@FindBy(xpath = "//a[normalize-space()='Personal savings contact information']")
	public WebElement ContactUsCardLink;

}
