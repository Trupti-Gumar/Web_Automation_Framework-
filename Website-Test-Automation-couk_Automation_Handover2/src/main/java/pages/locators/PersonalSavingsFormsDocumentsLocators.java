package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalSavingsFormsDocumentsLocators {

	@FindBy(xpath="//a[normalize-space()='Forms and documents']")
	public WebElement cardLink;
	
	@FindBy(xpath="//h1[normalize-space()='Personal savings forms and documents']")
	public WebElement mastheadHeader;
	
	@FindBy(xpath="//a[@aria-label='Personal savings help and support']")
	public WebElement backLink;
	
	@FindBy(xpath="//div[@id='Product literature']//button[@id='name']")
	public WebElement documentTableHeader;
	
	@FindBy(xpath="//td[normalize-space()='Fixed rate account summary box']")
	public WebElement downloadDocumentLink;
	
	
	
	
	
	
	
	
	
	
	
}
