package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.*;
import pages.actions.Intermediaries_MortgageHome_CommercialMortgagesActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_CommercialMortgagesSteps {
	
	Intermediaries_MortgageHome_CommercialMortgagesActions CommercialMortgagesActions = new Intermediaries_MortgageHome_CommercialMortgagesActions();

@And("I click to Mortgage Home options")
public void i_click_to_mortgage_home_options(){
	SeleniumDriver.clickElementWithJavaScript(CommercialMortgagesActions.MortgageHome());
}
	
	
@And("I click on Commercial Mortgages link")
public void i_click_on_Commercial_Mortgages_link() {
	SeleniumDriver.waitForElementClickable(CommercialMortgagesActions.CommercialMortgagesLink());
	SeleniumDriver.clickElementWithJavaScript(CommercialMortgagesActions.CommercialMortgagesLink());
	
}

@Then("I should navigate to Commercial Mortgages page")
public void I_should_naviagte_to_Commercial_Mortgages_page() {
	String Expected = SeleniumDriver.getDriver().getTitle();
	String Actual = "Commercial Mortgages for Intermediaries | Aldermore Bank";
	assertEquals(Expected, Actual);
	
}	
	
@And("I should see the header for the Commercial Mortgages page")	
public void i_should_see_the_pageheader_for_the_commercial_mortgages()
{
	String Expected = SeleniumDriver.GetElementText(CommercialMortgagesActions.MastheadHeader());
	String Actual = "Commercial mortgages";
	assertEquals(Expected, Actual);
}

@And("{string} present on the commerical mortgage page")
public void ImageHeader_present_on_the_commerical_mortgage_page(String header) {
	String Expected = header;
	String Actual = SeleniumDriver.GetElementText(CommercialMortgagesActions.getImageHeader());
	assertEquals(Expected, Actual);
}

@Then("I should see the {string} as the header for the Masthead black box on the Commerical Mortgage Page")
public void i_should_see_the_quicklink_as_the_header_for_the_masthead_black_box(String header) {
	String Expected = header;
	String Actual = SeleniumDriver.GetElementText(CommercialMortgagesActions.getMastheadBlackBoxheader());
	assertEquals(Expected, Actual);
}

@Then("I should be able to click on the {string} link present on Commercial Mortgage page and redirected to the {string}")
public void i_should_be_able_to_click_on_the_link_present_on_the_residential_owner_occupied_page_and_redirected_to_the_page(String header, String title) {
	String Actual = CommercialMortgagesActions.getMastheadBlackboxLinkPage(header);
    String Expected = title;
    assertEquals(Actual, Expected);
}

@And("I see the {string} on the Commercial Mortgage Header")
public void i_see_the_Documents_header_on_the_commercial_mortgage_header(String title) {
	String Actual = CommercialMortgagesActions.getDocumentheaders(title);
	String Expected = title;
}

}
