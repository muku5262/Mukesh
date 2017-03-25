package Testing;

import org.jbehave.core.annotations.Given;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by muku on 3/15/2017.
 */
public class dropDownPage {
    @Test
    @Given("user is on drop down page")
    public void dropDownTestPage()
    {
        System.setProperty("webdriver.gecko.driver","c:/tools/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.guru99.com/introduction-to-selenium.html");
        driver.findElement(By.xpath("//span[text()='Testing']"));


    }

}
