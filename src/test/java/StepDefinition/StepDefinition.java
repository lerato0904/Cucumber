package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class StepDefinition extends BrowserDriver {

    @Given("Automation exercise webpage is launched")
    public void launchwebpage(){
        driver.get("https://automationexercise.com/");
    }

    @When("User clicks on the SignupLogin link")
    public void clickOnSignUpLoginLink(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }
}
