package utility;


import org.junit.After;
import org.junit.Before;

public class Hooks {
    public static BrowserDriver driver;

    @Before
    public void Startup()
    {
        driver = new BrowserDriver();
    }

    @After
    public void Teardown()
    {
        driver.Close();
    }
}
