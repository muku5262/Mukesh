package example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import java.util.List;


/**
 * Created by muku on 3/15/2017.
 */


// facebook drop down handling for day month year

public class dropDownTest {


    WebDriver driver;

    @Test
    @Given("user is on drop down page")
    public void dropDownTestPage() throws InterruptedException
    {
        System.setProperty("webdriver.gecko.driver", "c:/tools/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://www.facebook.com");
        //driver.findElement(By.xpath("//span[text()='Testing']"));

        driver.manage().window().maximize();
        WebElement month = driver.findElement(By.id("month"));
        Select month_dd =new Select(month);
        month_dd.selectByIndex(2);
        Thread.sleep(2000);

        month_dd.selectByValue("3");
        Thread.sleep(2000);

        month_dd.selectByVisibleText("Aug");


        //   get the first selected value
        WebElement selected_data = month_dd.getFirstSelectedOption();
        System.out.print(selected_data.getText());

        // add asserstion point


        // get all selected option

        // get selected option list

        List<WebElement> month_list=month_dd.getOptions();
        int month_size=month_list.size();

        System.out.print("Size of month list is  : "+month_size);
        Assert.assertEquals(month_size,13);

        //print size if needed

        for(WebElement ele: month_list)
        {
            String list_name=ele.getText();
            System.out.println("Getting data is : "+list_name);
        }



    }

    @After
    @When("open google")
    public void openGoogle()
    {
        driver.get("http://www.google.com");

    }

}

