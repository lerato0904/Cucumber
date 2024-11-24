package StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class StepDefinition extends BrowserDriver {
    public Faker faker;
    public String username;

    public StepDefinition()
    {
        faker = new Faker();
    }

    @Given("Automation exercise webpage is launched")
    public void launchwebpage(){
        driver.get("https://automationexercise.com/");
    }

    @When("User clicks on the SignupLogin link")
    public void clickOnSignUpLoginLink(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    @And("User enters a username")
        public void enterUsername(){
        username = faker.name().firstName();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys(username);
    }

    @And("User enters an email address")
    public void enterEmailAddress(){
        var email = username+"@test.com";
        driver.findElement((By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"))).sendKeys(email);
    }

    @And("User clicks on the signup button")
    public void clickOnSignupButton(){
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    }

    @Then("Confirm user has successfully signed up")
    public void confirmUserHasSuccessfullySignedUp() {
        WebElement confirmText = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b"));
        Assert.assertEquals("ENTER ACCOUNT INFORMATION", confirmText.getText());

    }
}
