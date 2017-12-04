package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
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
    WebElement continueButton;

    @FindBy(xpath = "//*[@id='home-list']/li[1]/h2")
    WebElement startEval;

    @FindBy(xpath = "(//button[contains(@class,'continueButton')])[1]")
    WebElement continueButtonThree;

    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[2]/button")
    WebElement continueTwo;

    @FindBy(xpath = "//div[@id='page-wrap-you']//label")
    WebElement agreeCheckbox;

    @FindBy(className = "popup")
    WebElement popup;

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

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/div[1]/div/i")
    WebElement clearLocation;

    @FindBy(id = "locationText")
    WebElement cityField;

    @FindBy (id = "map")
    WebElement map;

    @FindBy(xpath = "//*[@id=\"pollution-window\"]/div/div[2]/div[2]")
    WebElement exposure;

    @FindBy(id = "pollution-window")
    WebElement pollutionWindow;

    @FindBy(xpath = "//*[@id=\"environment-window\"]/div/div[2]/div[2]")
    WebElement sunExposure;

    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[2]")
    WebElement drySkin;

    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[3]")
    WebElement normalSkin;

    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[4]")
    WebElement comboSkin;

    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[5]")
    WebElement oilySkin;

    public void startAssessment(String url) throws Exception{
        String start = url+"#/you-start";
        driver.navigate().to(start);
        acceptLicense();


    }

    public void acceptLicense() throws Exception{
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-wrap-you']//label")));
        //waitForElement(agreeCheckbox);
        agreeCheckbox.click();
        continueButton.click();
        continueTwo.click();
    }

    public void enterName(String name, String age, String gender) throws Exception {
        waitForElement(nameField);
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
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-location");
        waitForElement(map);
        Thread.sleep(4000);
        clearLocation.click();
        Actions cityText = new Actions(driver);
        cityField.sendKeys(city);
        Thread.sleep(1000);
        cityText.sendKeys(Keys.DOWN, Keys.ENTER).perform();
        cityText.moveToElement(nextButton).click().perform();

    }

    public void chemExposure(int exp) throws Exception{
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-pollution");
        //acceptLicense();

        waitForElement(pollutionWindow);
        int width=exposure.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(exposure, ((width*exp)/100),0 ).click().perform();
        waitForElement(nextButton);
        nextButton.click();
    }

    public void sunExposure(int exp) throws Exception{
        //Debugging code
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-environment");
        //acceptLicense();

        waitForElement(sunExposure);
        int width=sunExposure.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(sunExposure, ((width*exp)/100),0 ).click().perform();
        waitForElement(nextButton);
        act.moveToElement(nextButton).click().perform();
        waitForElement(continueButtonThree);
        continueButtonThree.click();
    }

    public void setSkinType(String type) throws Exception {
        //Debugging code
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/skin-type");
        //acceptLicense();
        waitForElement(drySkin);
        Actions act = new Actions(driver);

        if (type.equalsIgnoreCase("dry")) {
            act.moveToElement(drySkin).click().perform();
        } else if (type.equalsIgnoreCase("normal")) {
            act.moveToElement(normalSkin).click().perform();
        } else if (type.equalsIgnoreCase("combination")) {
            act.moveToElement(comboSkin).click().perform();
        } else if (type.equalsIgnoreCase("oily")) {
            act.moveToElement(oilySkin).click().perform();
        }
        nextButton.click();
    }

    public void waitForElement(WebElement e) throws Exception {
        do {
            Thread.sleep(100);
        } while (!e.isDisplayed());
    }
}
