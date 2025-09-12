package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import pages.actions.Help_ContactUs_IntermediariesActions;
import utils.SeleniumDriver;

public class Help_ContactUs_IntermediariesSteps {
 
	Help_ContactUs_IntermediariesActions IntermediariesActions = new 
			Help_ContactUs_IntermediariesActions();
	
	@Then("{string} CTA button")
	public void CardName_CTA_button(String header) {
		String Actual = IntermediariesActions.getCardName();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("Clicked button")
	public void Clicked_button() {
		IntermediariesActions.CardClicked();
	}
	
	@Then("respective {string} displayed")
	public void respective_InterdiariesPageTitle_diplayed(String header) {
		String Actual = IntermediariesActions.getIntermiadriesPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Intermediaries Page")
	public void i_navigate_to_Intermediaries_page() {
		IntermediariesActions.CardClicked();
	}
	
	@Then("I {string} on the page")
	public void i_see_cardheader_on_the_page(String header) {
		String Actual = IntermediariesActions.getCardheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	
	@When("I will click {string}")
	public void i_will_click_cards(String cards) {

	}
	
	@Then("I will click {string} and redirected to {string}")
	public void and_redirected_to_pageTitle(String Cards, String title ) {
		String ActualText = null;
		String ExpectedText= null;;
		switch(Cards) 
		{
		case"First Card":
			ActualText = IntermediariesActions.getPageTitle();
		    ExpectedText = title;
			break;
		}
		assertEquals(ActualText, ExpectedText);
	}
	
	
}

