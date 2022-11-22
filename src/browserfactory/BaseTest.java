package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseurl) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //Webdriver driver=new Chrome driver();
        driver = new ChromeDriver();
        //launch the URL
        driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser() {
        driver.quit();
    }
}
