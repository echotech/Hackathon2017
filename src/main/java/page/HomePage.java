package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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

    @FindBy(xpath = "//*[@id=\"name-text\"]")
    WebElement nameField;

    @FindBy(xpath = "//*[@id=\"age-text\"]")
    WebElement ageField;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/button[1]")
    WebElement female;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/button[2]")
    WebElement male;

    @FindBy(className = "nextButton")
    WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li")
    List<WebElement> ethnicityList;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[17]")
    WebElement otherEthnicity;

    @FindBy(id = "locationText")
    WebElement cityField;

    @FindBy(className = "knob")
    WebElement exposure;

    public void clickContinue() throws Exception{
        driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-wrap-you']//label")));
        agreeCheckbox.click();
        continueButton.click();
        continueTwo.click();

    }

    public void enterName(String name, String age, String gender){
        nameField.sendKeys(name);
        ageField.sendKeys(age);
        if (gender.equalsIgnoreCase("female")){
            female.click();
        } else {
            male.click();
        }
        nextButton.click();
    }

    public void enterEthnicity(String ethnicity) throws Exception {

        for (WebElement e : ethnicityList){
            waitForElement(e);

            if (e.getText().trim().equalsIgnoreCase(ethnicity)){
                e.click();
                break;
            }


        }
        nextButton.click();
    }

    public void enterCity(String city) throws Exception {
        driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-location");
        waitForElement(cityField);
        cityField.sendKeys(city);
        cityField.sendKeys(Keys.DOWN);
        cityField.sendKeys(Keys.ENTER);
        nextButton.click();
    }

    public void chemExposure(String exp) throws Exception{
        driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-pollution");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementsByClassName('knob')[0].style.visibility='visible'");
        exposure.clear();
        exposure.sendKeys(exp);
    }

    public void waitForElement(WebElement e) throws Exception {
        do {
            Thread.sleep(500);
        } while (!e.isDisplayed());
    }
}
