package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by admin on 11/15/2017.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[3]/div/div/div[2]/button")
    //@FindBy(className = "continueButton")
    WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[2]/button")
    WebElement continueTwo;

    @FindBy(xpath = "//div[@id='page-wrap-you']//label")
    WebElement agreeCheckbox;

    @FindBy(className = "popup-wrap")
    WebElement pageBody;



    public void clickContinue() throws Exception{
        driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-wrap-you']//label")));
        //waitForElement(agreeCheckbox);
        agreeCheckbox.click();
        continueButton.click();
        continueTwo.click();

    }

    public void waitForElement(WebElement e) throws Exception {
        do {
            Thread.sleep(500);
        } while (!e.isDisplayed());
    }
}
