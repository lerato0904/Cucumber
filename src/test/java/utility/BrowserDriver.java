package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    public static WebDriver driver;

    public BrowserDriver()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("www.automationexercise.com");
    }

    public void Close()
    {
        driver.close();
    }

}
