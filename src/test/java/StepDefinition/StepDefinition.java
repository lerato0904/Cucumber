package StepDefinition;

import io.cucumber.java.en.Given;
import utility.BrowserDriver;

public class StepDefinition extends BrowserDriver {

    @Given("Automation exercise webpage is launched")
    public void launchwebpage(){
        driver.get("www.automationexercise.com");
    }
}
