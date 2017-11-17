package page;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(className = "continueButton")
    WebElement continueButton;

    @FindBy(className = "checkbox")
    WebElement agreeCheckbox;




    public void clickContinue(){
        driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
        WebDriverWait wait = new WebDriverWait(driver, 15, 100);
        WebElement loginLightbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("checkbox")));
        Actions actions = new Actions(driver);

        actions.moveToElement(agreeCheckbox).click().perform();


        continueButton.click();
    }
}
