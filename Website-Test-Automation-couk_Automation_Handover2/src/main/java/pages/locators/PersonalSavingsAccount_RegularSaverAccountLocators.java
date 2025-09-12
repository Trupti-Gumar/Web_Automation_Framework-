package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalSavingsAccount_RegularSaverAccountLocators {

	@FindBy(xpath="//h1[normalize-space()='Regular saver account']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//span[normalize-space()='Savings']")
	public WebElement SavingsLink;
	
	@FindBy(xpath="//span[normalize-space()='Regular savings']")
	public WebElement RegularSavingsLinks;
	
	@FindBy(xpath="//h2[normalize-space()='Open an account with...']")
	public WebElement USPHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Easy account opening']")
	public WebElement USPHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Rated \"Excellent\"']")
	public WebElement USPHeader3;
	
	@FindBy(xpath="//h2[normalize-space()='Award winning']")
	public WebElement USPHeader4;
	
	@FindBy(xpath="//h2[normalize-space()='Key features']")
	public WebElement ImageCopyHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Regular Saver account FAQs']")
	public WebElement AccordianHeader;
	
	@FindBy(xpath="//h3[normalize-space()='What is a regular savings account?']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="//p[contains(text(),'This is a type of savings account where you can pa')]")
	public WebElement AccordianText;
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;
	
	@FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button ald_more_card_analytics']")
	public WebElement MoreCardLink;
	
	@FindBy(xpath="//h2[normalize-space()='Things you need to know']")
	public WebElement TextBlockHeader;
	
	@FindBy(xpath="//h1[normalize-space()='Personal savings help and support']")
	public WebElement Personalsavingshelpandsupport;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
