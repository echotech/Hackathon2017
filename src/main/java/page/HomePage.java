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

    //General nav
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
    @FindBy(className = "nextButton")
    WebElement nextButton;
    @FindBy(xpath="//*[@id=\"page-wrap-prefs\"]/div[2]/button")
    WebElement continueFour;
    @FindBy(xpath="//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[3]/div[1]/button")
    WebElement finishButton;



    //Name and age
    @FindBy(xpath = "//*[@id=\"name-text\"]")
    WebElement nameField;
    @FindBy(xpath = "//*[@id=\"age-text\"]")
    WebElement ageField;

    //Gender
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/button[1]")
    WebElement female;
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/button[2]")
    WebElement male;

    //Ethnicity
    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li")
    List<WebElement> ethnicityList;
    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[17]")
    WebElement otherEthnicity;

    //Location
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/div[1]/div/i")
    WebElement clearLocation;
    @FindBy(id = "locationText")
    WebElement cityField;
    @FindBy (id = "map")
    WebElement map;

    //Pollution exposure
    @FindBy(xpath = "//*[@id=\"pollution-window\"]/div/div[2]/div[2]")
    WebElement exposure;
    @FindBy(id = "pollution-window")
    WebElement pollutionWindow;

    //Sun exposure slider
    @FindBy(xpath = "//*[@id=\"environment-window\"]/div/div[2]/div[2]")
    WebElement sunExposure;

    //Skin dryness
    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[2]")
    WebElement drySkin;
    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[3]")
    WebElement normalSkin;
    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[4]")
    WebElement comboSkin;
    @FindBy(xpath = "//*[@id=\"skin-type-window\"]/button[5]")
    WebElement oilySkin;

    //Skin irritability slider
    @FindBy(xpath = "//*[@id=\"skin-sensitivity-window\"]/div/div[2]/div[2]")
    WebElement irritability;

    //AHA usage
    @FindBy(xpath = "//*[@id=\"skin-aha-window\"]/button[1]")
    WebElement stopped;
    @FindBy(xpath = "//*[@id=\"skin-aha-window\"]/button[2]")
    WebElement continued;
    @FindBy(xpath = "//*[@id=\"skin-aha-window\"]/button[3]")
    WebElement noReaction;
    @FindBy(xpath = "//*[@id=\"skin-aha-window\"]/button[4]")
    WebElement neverUsed;

    //Age spots slider
    @FindBy(xpath = "//*[@id=\"skin-spots-window\"]/div/div[2]/div[2]")
    WebElement ageSpots;

    //Wrinkle slider
    @FindBy(xpath = "//*[@id=\"skin-lines-window\"]/div[2]/div[2]/div[2]")
    WebElement wrinkles;

    //Firmness
    @FindBy(xpath="//*[@id=\"skin-firmness-window\"]/button[1]")
    WebElement firm;
    @FindBy(xpath="//*[@id=\"skin-firmness-window\"]/button[2]")
    WebElement someFirm;
    @FindBy(xpath="//*[@id=\"skin-firmness-window\"]/button[3]")
    WebElement someSag;
    @FindBy(xpath="//*[@id=\"skin-firmness-window\"]/button[4]")
    WebElement sigSag;

    //Radiance
    @FindBy(xpath="//*[@id=\"skin-radiance-window\"]/button[1]")
    WebElement shiny;
    @FindBy(xpath="//*[@id=\"skin-radiance-window\"]/button[2]")
    WebElement someShine;
    @FindBy(xpath="//*[@id=\"skin-radiance-window\"]/button[3]")
    WebElement someDull;
    @FindBy(xpath="//*[@id=\"skin-radiance-window\"]/button[4]")
    WebElement veryDull;

    //Pore
    @FindBy(xpath = "//*[@id=\"skin-pores-window\"]/div/div[2]/div[2]")
    WebElement poreSize;

    //Texture
    @FindBy(xpath = "//*[@id=\"skin-texture-window\"]/button[1]")
    WebElement smooth;
    @FindBy(xpath = "//*[@id=\"skin-texture-window\"]/button[2]")
    WebElement someSmooth;
    @FindBy(xpath = "//*[@id=\"skin-texture-window\"]/button[3]")
    WebElement someRough;
    @FindBy(xpath = "//*[@id=\"skin-texture-window\"]/button[4]")
    WebElement rough;

    //Fragrance
    @FindBy(xpath="//*[@id=\"preferences-fragrance-window\"]/button[1]")
    WebElement yesFragrance;
    @FindBy(xpath="//*[@id=\"preferences-night-moisturizer-window\"]/div/div[2]/div[2]")
    WebElement nightFragrance;
    @FindBy(xpath="//*[@id=\"preferences-fragrance-window\"]/button[2]")
    WebElement noFragrance;
    @FindBy(xpath="//*[@id=\"preferences-day-moisturizer-window\"]/div/div[2]/div[2]")
    WebElement richness;
    @FindBy(xpath="//*[@id=\"preferences-night-moisturizer-window\"]/div/div[2]/div[2]")
    WebElement nightRichness;
    @FindBy(xpath="//*[@id=\"nuskinBespokeApp\"]/div/div[4]/div/div/div/button[1]")
    WebElement modContinue;
    @FindBy(xpath = "//div[@class='alert-options']/button")
    List<WebElement> modalOptions;
    @FindBy(xpath="//*[@id=\"nuskinBespokeApp\"]/div/div[4]/div/div/div/button[2]")
    WebElement keepPref;


    //Finishing up
    @FindBy(xpath="//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[3]/div[2]/div[2]/p[1]")
    WebElement careCode;


    public void startAssessment(String url){
        String start = url;
        driver.navigate().to(start);
        acceptLicense();

        }

    public void acceptLicense(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(agreeCheckbox));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agreeCheckbox);

        agreeCheckbox.click();
        continueButton.click();
        continueTwo.click();
    }

    public void enterName(String name, String age, String gender){
        //waitForElement(nameField);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(nameField));
        nameField.sendKeys(name);
        ageField.sendKeys(age);
        if (gender.equalsIgnoreCase("female")){
            female.click();
        } else {
            male.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        //waitForElement(nameField);
        nextButton.click();
    }

    public void enterEthnicity(String ethnicity){
        WebDriverWait wait = new WebDriverWait(driver, 15);

        for (WebElement e : ethnicityList){
            wait.until(ExpectedConditions.elementToBeClickable(e));

            if (e.getText().trim().equalsIgnoreCase(ethnicity)){
                e.click();
                break;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        //waitForElement(nextButton);
        nextButton.click();
    }

    public void enterCity(String city) throws Exception {
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-location");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(clearLocation));
        //Thread.sleep(4000);
        clearLocation.click();
        Actions cityText = new Actions(driver);
        cityField.sendKeys(city);
        Thread.sleep(1000);
        cityText.sendKeys(Keys.DOWN, Keys.ENTER).perform();
        cityText.moveToElement(nextButton).click().perform();

    }

    public void chemExposure(int exp){
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-pollution");
        //acceptLicense();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(exposure));
        int width=exposure.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(exposure, ((width*exp)/100),0 ).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void sunExposure(int exp){
        //Debugging code
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-environment");
        //acceptLicense();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(sunExposure));
        int width=sunExposure.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(sunExposure, ((width*exp)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(continueButtonThree));
        continueButtonThree.click();
    }

    public void setSkinType(String type){
        //Debugging code
        //driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/skin-type");
        //acceptLicense();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(drySkin));
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
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void setSkinIrritability(int exp){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(irritability));
        int width=irritability.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(irritability, ((width*exp)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();


    }

    public void setAhaUse(String use){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(stopped));
        Actions act = new Actions(driver);

        if (use.equalsIgnoreCase("stopped")) {
            act.moveToElement(stopped).click().perform();
        } else if (use.equalsIgnoreCase("noReaction")) {
            act.moveToElement(noReaction).click().perform();
        } else if (use.equalsIgnoreCase("never")) {
            act.moveToElement(neverUsed).click().perform();
        } else if (use.equalsIgnoreCase("continued")) {
            act.moveToElement(continued).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void setAgeSpots(int exp){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(ageSpots));

        int width=ageSpots.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(ageSpots, ((width*exp)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();

    }

    public void setWrinkles(int wrink, int nose, int fore)  {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(wrinkles));

        int width=wrinkles.getSize().getWidth();
        Actions act = new Actions(driver);
        //Set wrinkles
        act.moveToElement(wrinkles, ((width*wrink)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();
        //Set nose wrinkles
        wait.until(ExpectedConditions.elementToBeClickable(wrinkles));
        act.moveToElement(wrinkles, ((width*nose)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        //Set forehead wrinkles
        act.moveToElement(nextButton).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(wrinkles));
        act.moveToElement(wrinkles, ((width*fore)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();
    }

    public void setPoreSize(int exp){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(poreSize));

        int width=poreSize.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(poreSize, ((width*exp)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();

    }

    public void setFirmness(String use) throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(firm));
        Actions act = new Actions(driver);

        if (use.equalsIgnoreCase("veryFirm")) {
            act.moveToElement(firm).click().perform();
        } else if (use.equalsIgnoreCase("someFirm")) {
            act.moveToElement(someFirm).click().perform();

        } else if (use.equalsIgnoreCase("someSag")) {
            act.moveToElement(someSag).click().perform();
        } else if (use.equalsIgnoreCase("verySag")) {
            act.moveToElement(sigSag).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void setRadiance(String rad) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(shiny));
        Actions act = new Actions(driver);

        if (rad.equalsIgnoreCase("veryRadiant")) {
            act.moveToElement(shiny).click().perform();
        } else if (rad.equalsIgnoreCase("someRadiant")) {
            act.moveToElement(someShine).click().perform();
        } else if (rad.equalsIgnoreCase("someDull")) {
            act.moveToElement(someDull).click().perform();
        } else if (rad.equalsIgnoreCase("veryDull")) {
            act.moveToElement(veryDull).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void setTexture(String rad) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(smooth));
        Actions act = new Actions(driver);

        if (rad.equalsIgnoreCase("smooth")) {
            act.moveToElement(smooth).click().perform();
        } else if (rad.equalsIgnoreCase("someSmooth")) {
            act.moveToElement(someSmooth).click().perform();
        } else if (rad.equalsIgnoreCase("someRough")) {
            act.moveToElement(someRough).click().perform();
        } else if (rad.equalsIgnoreCase("rough")) {
            act.moveToElement(rough).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(continueFour));
        continueFour.click();
    }

    public void setDayFragrance(String frag) throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(yesFragrance));
        Actions act = new Actions(driver);
        if (frag.equalsIgnoreCase("yes")){
            act.moveToElement(yesFragrance).click().perform();
        } else {
            act.moveToElement(noFragrance).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();

        }

    public void setNightFragrance(String frag) throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(yesFragrance));
        Actions act = new Actions(driver);
        if (frag.equalsIgnoreCase("yes")){
            act.moveToElement(yesFragrance).click().perform();
        } else {
            act.moveToElement(noFragrance).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();

    }

    public void setDayMoisturizer(String moist){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(richness));
        int width=richness.getSize().getWidth();
        int percent;
        Actions act = new Actions(driver);
        if (moist.equals("")){
            percent=51;
        } else {
            percent= Integer.parseInt(moist);
        }
        act.moveToElement(richness, ((width*percent)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();
        if(percent<29||(percent>57&&percent<72)){
            if(modContinue.isDisplayed()) {
                System.out.println("No SPF");
                wait.until(ExpectedConditions.elementToBeClickable(modContinue));
                act.moveToElement(modContinue).click().perform();
                wait.until(ExpectedConditions.elementToBeClickable(nextButton));
                act.moveToElement(nextButton).click().perform();
            }
        } else if(keepPref.isDisplayed()) {
            if(keepPref.isDisplayed()) {
                System.out.println("Irritated Skin");
                wait.until(ExpectedConditions.elementToBeClickable(keepPref));
                act.moveToElement(keepPref).click().perform();
                wait.until(ExpectedConditions.elementToBeClickable(nextButton));
                act.moveToElement(nextButton).click().perform();
            }
        }


    }

    public void setNightMoisturizer(String moist) throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(nightRichness));
        int width=nightRichness.getSize().getWidth();
        int percent;
        Actions act = new Actions(driver);
        if (moist.equals("")){
            percent=51;
        } else {
            percent= Integer.parseInt(moist);
        }

        act.moveToElement(nightRichness, ((width*percent)/100),0 ).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        act.moveToElement(nextButton).click().perform();

        if (percent<26){
            System.out.println("Light moisturizer");
            wait.until(ExpectedConditions.elementToBeClickable(keepPref));
            act.moveToElement(keepPref).click().perform();
            wait.until(ExpectedConditions.elementToBeClickable(nextButton));
            act.moveToElement(nextButton).click().perform();
            }


    }

    public void finishAssessment(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(finishButton));

        finishButton.click();


    }

    public String getCareCode(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(careCode));

        return careCode.getText();
    }

    public void waitForElement(WebElement e) throws Exception {
        do {
            Thread.sleep(100);
        } while (!e.isDisplayed());
    }
}
