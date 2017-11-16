package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 11/15/2017.
 */
public class TestBase {
    protected static WebDriver driver;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);

        //Close all tabs
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            driver.close();

        }
    }
}
