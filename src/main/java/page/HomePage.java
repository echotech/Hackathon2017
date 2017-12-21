package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helpers;
import java.util.List;

/**
 * Created by admin on 11/15/2017.
 */
public class HomePage {
    private WebDriver driver;
    private Helpers h;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        h=new Helpers(driver);
    }

    //General nav
    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[3]/div/div/div[2]/button")
    WebElement continueButton;
    @FindBy(xpath = "(//button[contains(@class,'continueButton')])[1]")
    WebElement continueButtonThree;
    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[2]/button")
    WebElement continueTwo;
    @FindBy(className = "nextButton")
    WebElement nextButton;
    @FindBy(xpath = "//*[@id=\"page-wrap-prefs\"]/div[2]/button")
    WebElement continueFour;
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[3]/div[1]/button")
    WebElement finishButton;

    //Starting Assessment
    @FindBy(xpath = "//*[@id=\"home-list\"]/li[1]/h2")
    WebElement startButton;
    @FindBy(xpath = "//*[@id=\"agreeToCookies\"]")
    WebElement acceptCookies;
    @FindBy(xpath = "//label[@translate='terms-conditions-agree']")
    WebElement agreeCheckbox;

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

    //Location
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/div[1]/div/i")
    WebElement clearLocation;
    @FindBy(id = "locationText")
    WebElement cityField;

    //Pollution exposure
    @FindBy(xpath = "//*[@id=\"pollution-window\"]/div/div[2]/div[2]")
    WebElement exposure;

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
    @FindBy(xpath = "//*[@id=\"skin-firmness-window\"]/button[1]")
    WebElement firm;
    @FindBy(xpath = "//*[@id=\"skin-firmness-window\"]/button[2]")
    WebElement someFirm;
    @FindBy(xpath = "//*[@id=\"skin-firmness-window\"]/button[3]")
    WebElement someSag;
    @FindBy(xpath = "//*[@id=\"skin-firmness-window\"]/button[4]")
    WebElement sigSag;

    //Radiance
    @FindBy(xpath = "//*[@id=\"skin-radiance-window\"]/button[1]")
    WebElement shiny;
    @FindBy(xpath = "//*[@id=\"skin-radiance-window\"]/button[2]")
    WebElement someShine;
    @FindBy(xpath = "//*[@id=\"skin-radiance-window\"]/button[3]")
    WebElement someDull;
    @FindBy(xpath = "//*[@id=\"skin-radiance-window\"]/button[4]")
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
    @FindBy(xpath = "//*[@id=\"preferences-fragrance-window\"]/button[1]")
    WebElement yesFragrance;
    @FindBy(xpath = "//*[@id=\"preferences-fragrance-window\"]/button[2]")
    WebElement noFragrance;
    @FindBy(xpath = "//*[@id=\"preferences-day-moisturizer-window\"]/div/div[2]/div[2]")
    WebElement richness;
    @FindBy(xpath = "//*[@id=\"preferences-night-moisturizer-window\"]/div/div[2]/div[2]")
    WebElement nightRichness;
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[4]/div/div/div/button[1]")
    WebElement modContinue;
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[4]/div/div/div/button[2]")
    WebElement keepPref;

    //Finishing up
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[3]/div[2]/div[2]/p[1]")
    WebElement careCode;

    public void startAssessment(String url) {
        driver.navigate().to(url);
        acceptCookies.click();
        h.scrollToAndClickElement(startButton, 0);
        acceptLicense();
    }

    public void acceptLicense() {
        h.scrollToAndClickElement(agreeCheckbox,1);
        h.scrollToAndClickElement(continueButton,0);
        h.scrollToAndClickElement(continueTwo,0);
    }

    public void enterName(String name, String age, String gender) {
        h.waitForElement(nameField);
        nameField.sendKeys(name);
        ageField.sendKeys(age);
        if (gender.equalsIgnoreCase("female")) {
            h.scrollToAndClickElement(female,0);
        } else {
            h.scrollToAndClickElement(male,0);
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void enterEthnicity(String ethnicity) {
        for (WebElement e : ethnicityList) {
            h.waitForElement(e);
            if (e.getText().trim().toLowerCase().contains(ethnicity)) {
                h.scrollToAndClickElement(e,0);
                break;
            }
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void enterCity(String city) throws Exception {
        h.scrollToAndClickElement(clearLocation,0);
        Actions cityText = new Actions(driver);
        cityField.sendKeys(city);
        Thread.sleep(1000);
        cityText.sendKeys(Keys.DOWN, Keys.ENTER).perform();
        h.scrollToAndClickElement(nextButton,0);
    }

    public void chemExposure(int exp) {
        h.waitForElement(exposure);
        h.moveSlider(exposure,exp);
        h.scrollToAndClickElement(nextButton,0);
    }

    public void sunExposure(int exp) {
        h.moveSlider(sunExposure,exp);
        h.scrollToAndClickElement(nextButton,0);
        h.scrollToAndClickElement(continueButtonThree,0);
    }

    public void setSkinType(String type) {
        if (type.equalsIgnoreCase("dry")) {
            h.scrollToAndClickElement(drySkin,0);
        } else if (type.equalsIgnoreCase("normal")) {
            h.scrollToAndClickElement(normalSkin,0);
        } else if (type.equalsIgnoreCase("combination")) {
            h.scrollToAndClickElement(comboSkin,0);
        } else if (type.equalsIgnoreCase("oily")) {
            h.scrollToAndClickElement(oilySkin,0);
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setSkinIrritability(int exp) {
        h.moveSlider(irritability, exp);
        h.scrollToAndClickElement(nextButton,0);;
        }

    public void setAhaUse(String use) {
        if (use.equalsIgnoreCase("stopped")) {
            h.scrollToAndClickElement(stopped,0);
        } else if (use.equalsIgnoreCase("noReaction")) {
            h.scrollToAndClickElement(noReaction,0);
        } else if (use.equalsIgnoreCase("never")) {
            h.scrollToAndClickElement(neverUsed,0);
        } else if (use.equalsIgnoreCase("continued")) {
            h.scrollToAndClickElement(continued,0);;
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setAgeSpots(int exp) {
        h.moveSlider(ageSpots,exp);
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setWrinkles(int wrink, int nose, int fore) {
        //Set wrinkles
        h.moveSlider(wrinkles,wrink);
        h.scrollToAndClickElement(nextButton,0);
        //Set nose wrinkles
        h.moveSlider(wrinkles,nose);
        h.scrollToAndClickElement(nextButton,0);
        //Set forehead wrinkles
        h.moveSlider(wrinkles,fore);
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setPoreSize(int exp) {
        h.moveSlider(poreSize,exp);
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setFirmness(String use){
        if (use.equalsIgnoreCase("veryFirm")) {
            h.scrollToAndClickElement(firm,0);
        } else if (use.equalsIgnoreCase("someFirm")) {
            h.scrollToAndClickElement(someFirm,0);
        } else if (use.equalsIgnoreCase("someSag")) {
            h.scrollToAndClickElement(someSag,0);
        } else if (use.equalsIgnoreCase("verySag")) {
            h.scrollToAndClickElement(sigSag,0);
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setRadiance(String rad){
        if (rad.equalsIgnoreCase("veryRadiant")) {
            h.scrollToAndClickElement(shiny,0);
        } else if (rad.equalsIgnoreCase("someRadiant")) {
            h.scrollToAndClickElement(someShine,0);
        } else if (rad.equalsIgnoreCase("someDull")) {
            h.scrollToAndClickElement(someDull,0);
        } else if (rad.equalsIgnoreCase("veryDull")) {
            h.scrollToAndClickElement(veryDull,0);
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setTexture(String rad){
        if (rad.equalsIgnoreCase("smooth")) {
            h.scrollToAndClickElement(smooth,0);
        } else if (rad.equalsIgnoreCase("someSmooth")) {
            h.scrollToAndClickElement(someSmooth,0);
        } else if (rad.equalsIgnoreCase("someRough")) {
            h.scrollToAndClickElement(someRough,0);
        } else if (rad.equalsIgnoreCase("rough")) {
            h.scrollToAndClickElement(rough,0);
        }
        h.scrollToAndClickElement(nextButton,0);
        h.scrollToAndClickElement(continueFour,0);
    }

    public void setFragrance(String frag){
        if (frag.equalsIgnoreCase("yes")) {
            h.scrollToAndClickElement(yesFragrance,0);
        } else {
            h.scrollToAndClickElement(noFragrance,0);
        }
        h.scrollToAndClickElement(nextButton,0);
    }

    public void setDayMoisturizer(String moist) {
        h.waitForElement(richness);
        int percent;
        if (moist.equals("")) {
            percent = 51;
        } else {
            percent = Integer.parseInt(moist);
        }
        h.moveSlider(richness,percent);
        h.scrollToAndClickElement(nextButton, 0);
        if (percent < 29 || (percent > 57 && percent < 72)) {
            if (modContinue.isDisplayed()) {
                System.out.println("No SPF");
                h.scrollToAndClickElement(modContinue, 0);
                h.scrollToAndClickElement(nextButton, 0);
            }
        } else if (keepPref.isDisplayed()) {
            System.out.println("Irritated Skin");
            h.scrollToAndClickElement(keepPref, 0);
            h.scrollToAndClickElement(nextButton, 0);
        }
    }

    public void setNightMoisturizer(String moist){
        h.waitForElement(nightRichness);
        int percent;
        if (moist.equals("")) {
            percent = 51;
        } else {
            percent = Integer.parseInt(moist);
        }
        h.moveSlider(nightRichness, percent);
        h.scrollToAndClickElement(nextButton, 0);
        if (percent < 26) {
            System.out.println("Light moisturizer");
            h.scrollToAndClickElement(keepPref, 0);
            h.scrollToAndClickElement(nextButton, 0);
        }
    }

    public void finishAssessment() {
        h.scrollToAndClickElement(finishButton,0);
        }

    public String getCareCode() {
        h.waitForElement(careCode);
        return careCode.getText();
    }
}