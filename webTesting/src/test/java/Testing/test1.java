package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by muku on 3/11/2017.
 */
public class test1 {

    public static WebDriver driver;

    @BeforeTest
    public void open_browser()
    {
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void close_browser()
    {
        driver.close();
    }
}

