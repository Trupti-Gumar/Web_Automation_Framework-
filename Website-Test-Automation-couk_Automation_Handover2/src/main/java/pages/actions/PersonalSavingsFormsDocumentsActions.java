package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PersonalSavingsFormsDocumentsLocators;
import utils.SeleniumDriver;

public class PersonalSavingsFormsDocumentsActions {

	PersonalSavingsFormsDocumentsLocators personalSavingsFormsDocumentsLocators = null;
	
	public PersonalSavingsFormsDocumentsActions() {
		
		this.personalSavingsFormsDocumentsLocators = new PersonalSavingsFormsDocumentsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), personalSavingsFormsDocumentsLocators);
	}
	
	public WebElement cardLink() {
		
		return personalSavingsFormsDocumentsLocators.cardLink;
	}
	
    public WebElement mastheadHeader() {
		
		return personalSavingsFormsDocumentsLocators.mastheadHeader;
	}
	
    public WebElement backLink() {
		
		return personalSavingsFormsDocumentsLocators.backLink;
	}
    
    public WebElement documentTableHeader() {
		
		return personalSavingsFormsDocumentsLocators.documentTableHeader;
	}
    
    public WebElement downloadDocumentLink() {
		
		return personalSavingsFormsDocumentsLocators.downloadDocumentLink;
	}
    
    
    
    
    
    
    
    
    
    
    
    
}
