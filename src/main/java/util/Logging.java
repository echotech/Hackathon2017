package util;

// Import Package Log4j.*

import org.apache.log4j.xml.DOMConfigurator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.yaml.snakeyaml.scanner.Constant;


public class Logging {

    private static WebDriver driver = null;

    public static void init() throws Exception {

        // Provide Log4j configuration settings

        DOMConfigurator.configure("Log4j.xml");

        Log.info("New driver instantiated");

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");

        Log.info("Click action is performed on Log Out link");

        driver.quit();

        Log.info("Browser closed");

        Log.endTestCase("Selenium_Test_001");

    }

}