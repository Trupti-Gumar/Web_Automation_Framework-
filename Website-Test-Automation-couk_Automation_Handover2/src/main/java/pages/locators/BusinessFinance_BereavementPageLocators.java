package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_BereavementPageLocators {

	@FindBy(xpath="//a[@data-parent-title='Business finance']//span[contains(text(),'Bereavement guide')]")
	public WebElement BereavementGuideLink;
	
	@FindBy(xpath="//h1[normalize-space()='Bereavement']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//h2[normalize-space()='What to do first']")
	public WebElement TextBlockHeader1;
	
	@FindBy(xpath="//h2[contains(text(),'Terms you')]")
	public WebElement TextBlockHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Who else can help']")
	public WebElement TextBlockHeader3;
	
	@FindBy(xpath="//h2[normalize-space()='How to contact us']")
	public WebElement AccordianHeader;
	
	@FindBy(xpath="//h3[normalize-space()='Personal savings customers']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="//div[@class='margin-bottom']//p[contains(text(),'The paperwork you need to send us depends on what ')]")
	public WebElement AccordianText;
}
