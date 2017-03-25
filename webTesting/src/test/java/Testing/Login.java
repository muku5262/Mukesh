package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by muku on 3/11/2017.
 */
public class Login {

    /*public void getDriver()
    {

    }**/

    public void loginValidation()
    {
        System.setProperty("webdriver.gecko.driver", "c:/tools/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.gmail.com");

        driver.findElement(By.id("Email")).sendKeys("22ymukesh@gmail.com");

        driver.findElement(By.id("next")).click();

        //wait 5 secs for  userid to be entered
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("Passwd")).sendKeys("mukesh5262");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("signIn")).click();


        // start dealing with drop down


        driver.close();
    }

    public void clickOnSubmit()
    {

        System.out.print("hiii");
    }

}