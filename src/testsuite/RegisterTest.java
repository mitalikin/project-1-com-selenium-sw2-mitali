package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        //Verify the text ‘Register’
        String expectedMessage = "Register";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Register page", expectedMessage, actualMessage);

    }

    @Test
    //userShouldRegisterAccountSuccessfully * click
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        sendTexToElement(By.xpath("//button[contains(text(),'Register')]"), "Register");
        // Select gender radio button
        clickOnElement(By.xpath("//label"));
        //  clickOnElement(By.id("gender-female"));
        clickOnElement(By.id("gender-male"));
        //Enter First name
        sendTexToElement(By.name("FirstName"), "John");
        //Enter Last name
        sendTexToElement(By.name("LastName"), "White");
        // Select Day Month and Year
        clickOnElement(By.name("DateOfBirthDay"));
        sendTexToElement(By.name("DateOfBirthDay"), "3");
        clickOnElement(By.name("DateOfBirthMonth"));
        sendTexToElement(By.name("DateOfBirthMonth"), "January");
        clickOnElement(By.name("DateOfBirthYear"));
        sendTexToElement(By.name("DateOfBirthYear"), "1925");
        //Enter Email address
        sendTexToElement(By.id("Email"), "test789@gmail.com");
        // Enter Password

        sendTexToElement(By.name("Password"), "Test123456");
        //Enter Confirm password
        sendTexToElement(By.name("ConfirmPassword"), "Test123456");

        String expectMessage = "Your registration completed";
        //Click on REGISTER button
        clickOnElement(By.name("register-button"));
        //Verify the text 'Your registration completed’
        String expectedMessage = "Your registration completed";
        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Registration message not displayed", expectedMessage, actualMessage);

    }

    @After
    public void testDown() {
        closeBrowser();
    }
}