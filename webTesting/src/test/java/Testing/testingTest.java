package Testing;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.junit.Test;

/**
 * Created by muku on 3/11/2017.
 */



public class testingTest {


        Login log=new Login();

        public void main() throws Exception {

         //System.out.print("Hii This test is passed");

    }


    @Test
    @Given("user is on gmail page")
    public void userIsonGmailPage ()
    {
        log.loginValidation();
    }


    @Test
    @When("user clicks on submit button")
        public void userClicksOnSubmit()
    {
        log.clickOnSubmit();
    }


}