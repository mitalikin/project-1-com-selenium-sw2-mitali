package testsuite;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class TopMenuTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        clickOnElement(By.linkText("Computers"));
        //* Verify the text ‘Computers’
        String text = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).getText();
        System.out.println(text);
        String expectedMessage = "Computers";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to computer page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //* click on the ‘Electronics’ Tab
        clickOnElement(By.linkText("Electronics"));
        //Verify the text ‘Electronics’
        String expectedMessage = "Electronics";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Electronics ')] "));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronics page", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));

        // Verify the text ‘Apparel’
        String expectedMessage = "Apparel";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Apparel ')] "));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel page", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // click on the ‘Digital downloads’ Tab
        clickOnElement(By.linkText("Digital downloads"));
        //verify the text 'digital download
        String expectedMessage = "Digital downloads";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Digital download page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        clickOnElement(By.linkText("Books"));
        // Verify the text ‘Books’
        String expectedMessage = "Books";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Books ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Books page", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        clickOnElement(By.linkText("Jewelry"));
        //verify the text 'Jewelary'
        String expectedMessage = "Jewelry";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Jewelry ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Jewelry page", expectedMessage, actualMessage);



    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        clickOnElement(By.linkText("Gift Cards"));
        //Verify the text ‘Gift Cards’
        String expectedMessage = "Gift Cards";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Gift Cards page", expectedMessage, actualMessage);


    }

    @After
    public void testDown() {

    }

}
