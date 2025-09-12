package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorFinancebyMotoNovoLocators {

	@FindBy(xpath="//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Motor finance']")
	public WebElement MotorfinanceLink;
	
	@FindBy(xpath="//a[@aria-label='Motor Finance by MotoNovo']")
	public WebElement MotorFinancebyMotoNovoLink;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	@FindBy(xpath="//h1[normalize-space()='Motor Finance by MotoNovo']")
	public WebElement MotorFinancebyMotoNovoPageHeader;
	
	@FindBy(xpath="//h2[normalize-space()='MotoNovo Finance']")
	public WebElement MastheadBlackboxHeader;
	
	@FindBy(xpath="//span[normalize-space()='Find a car']")
	public WebElement MastheadBlackboxLink1;
	
/*	@FindBy(xpath="//span[contains(@class,'masthead-black-box__link-title-a')][normalize-space()='Motor Finance']")
	public WebElement MastheadBlackboxLink2; */
	
	@FindBy(xpath="//a[normalize-space()='Visit website']")
	public WebElement MastheadBlackboxLink2;
	
}
