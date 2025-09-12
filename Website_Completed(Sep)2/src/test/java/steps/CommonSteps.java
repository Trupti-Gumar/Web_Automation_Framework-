package steps;

import io.cucumber.java.en.Given;
import utils.SeleniumDriver;

public class CommonSteps {

    @Given("I am on the Aldermore homepage")
    public void i_am_on_the_aldermore_homepage() {
        // Update with the correct Aldermore homepage URL
        String url = "https://preprod.aldermoreaz.co.uk/";
        SeleniumDriver.openPage(url);
        System.out.println("✅ Navigated to Aldermore homepage: " + url);
    }
}

