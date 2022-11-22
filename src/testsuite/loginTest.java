package testsuite;

import com.google.common.base.Verify;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class loginTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //* click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));
        // Verify the text ‘Welcome, Please Sign In!’
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals("not navigated to page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));
        //Enter valid username /EmailId
        sendTexToElement(By.id("Email"), "test789@gmail.com");
        //find password element
        sendTexToElement(By.name("Password"), "Test123456");
        //Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //Verify the ‘Log out’ text is display
        String expectMessage = "Log out";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("No such text passed", expectMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));
        //Enter invalid username/email
        sendTexToElement(By.id("Email"), "test12435@gmail.com");
        //Enter invalid password
        sendTexToElement(By.name("Password"), "Test123456");
        //click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //verify the error message----Login was unsuccessful.
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        Assert.assertEquals("not navigated to page", expectedMessage, actualMessage);

    }

    @After
    public void testDown() {
        // closeBrowser();
    }


}
