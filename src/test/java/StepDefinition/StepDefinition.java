package StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class StepDefinition extends BrowserDriver {
    public Faker faker;
    public String username;
    public String email;

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
        email = username+"@test.co.za";
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

    @And("Confirm the correct name is stored")
    public void confirmTheCorrectNameIsStored() {
        WebElement storedName = driver.findElement(By.id("name"));
        storedName.getAttribute("value");
        Assert.assertEquals(username, storedName.getAttribute("value"));
    }

    @And("Confirm the correct email is stored")
    public void confirmTheCorrectEmailIsStored() {
        WebElement storedEmail = driver.findElement(By.xpath("email"));
        Assert.assertEquals(email, storedEmail.getText());
    }

    @And("Enter password")
    public void enterPassword() {
        driver.findElement(By.id("password")).sendKeys("password1234$");
    }

    @And("Enter FirstName")
    public void enterFirstName() {
        driver.findElement(By.id("first_name")).sendKeys(username);
    }

    @And("Enter LastName")
    public void enterLastName() {
        String lastName = faker.name().lastName();
        driver.findElement(By.id("last_name")).sendKeys(lastName);
    }

    @And("Enter Address")
    public void enterAddress() {
        driver.findElement(By.id("address1")).sendKeys("123 ABC Street");
    }

    @And("Enter Company name")
    public void enterCompanyName() {
        driver.findElement(By.id("company")).sendKeys("Private company");
    }

    @And("Select {string} as a Country")
    public void selectSouthAfricaAsACountry(String country) {
        driver.findElement(By.id("country")).sendKeys(country);
    }

    @And("Enter {string} as a State")
    public void enterAsAState(String state) {
       driver.findElement(By.id("state")).sendKeys(state);
    }

    @And("Enter {string} as a City")
    public void enterAsACity(String city) {
        driver.findElement(By.id("city")).sendKeys(city);
    }

    @And("Enter Zipcode")
    public void enterZipcode() {
        String zipCode = faker.address().zipCode();
        driver.findElement(By.id("zipcode")).sendKeys(zipCode);
    }

    @And("Enter Mobile number")
    public void enterMobileNumber() {
        String mobile = faker.phoneNumber().cellPhone();
        driver.findElement(By.id("mobile_number")).sendKeys(mobile);
    }

    @And("Click on the Create Account button")
    public void clickOnTheCreateAccountButton() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
    }

    @And("Enter user's Date of Birth")
    public void enterUserSDateOfBirth() {

    }

    @And("Enter user{string}YYYY{string}MM{string}DD'")
    public void enterUserSDateOfBirthYYYYMMDD(String year, String month, String day) {
        driver.findElement(By.id("years")).sendKeys(year);
        driver.findElement(By.id("months")).sendKeys(month);
        driver.findElement(By.id("days")).sendKeys(day);

    }

    @And("Enter user{string}{int}{string}{int}{string}{int}'")
    public void enterUserDateOfBirth(String year, int month, String monthText, int day, String dayText, int year2) {
        // Locate the Year, Month, and Day fields
        driver.findElement(By.id("years")).sendKeys(year);  // Year field
        //driver.findElement(By.id("months")).sendKeys(String.valueOf(month));  // Month field (convert to String if necessary)
        //driver.findElement(By.id("days")).sendKeys(String.valueOf(day));  // Day field (convert to String if necessary)

        // Additional logic can be added depending on the need to process monthText or dayText if applicable
        //System.out.println("Entered Date of Birth: " + year + "/" + month + "/" + day);
    }

    @And("Enter users Date of Birth {string}-{string}-{string}")
    public void enterUsersDateOfBirth(int year, String month, int day) {
        driver.findElement(By.id("years")).sendKeys(String.valueOf(year));  // Year field
        driver.findElement(By.id("months")).sendKeys(String.valueOf(month));  // Month field (convert to String if necessary)
        driver.findElement(By.id("days")).sendKeys(String.valueOf(day));  // Day field (convert to String if necessary)

    }
}
