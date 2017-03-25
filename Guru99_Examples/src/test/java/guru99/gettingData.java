package guru99;

import org.jbehave.core.annotations.Given;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by muku on 3/25/2017.
 */
public class gettingData {

    WebDriver driver;

    @Test
    @Given("user is on Home page")
    public void userIsOnHomePage() throws  InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c:/tools/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
         Thread.sleep(3000);

        // Accessing link by given logo
        driver.findElement(By.cssSelector("a[title='Go to Facebook home']")).click();

        String title = driver.getTitle();
         System.out.print(title);
    }

}