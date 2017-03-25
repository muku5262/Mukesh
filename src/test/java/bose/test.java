package bose;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Created by muku on 3/11/2017.
 */
class test {
    @Given("user bose")
    public void run ()
    {
        System.setProperty("webdriver.gecko.driver", "c:/tools/geckodriver.exe");

         WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");
        driver.close();

        System.out.println("Test PASSED");
    }
    public void action()
    {
    //    driver.get("https://mail.tcs.com");
    }


}
