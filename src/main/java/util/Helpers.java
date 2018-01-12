package util;

import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;

public class Helpers {

    private WebDriver driver;
    private boolean mobileTest;

    public Helpers(WebDriver driver){
        this.driver=driver;
    }

    public void setMobileTest(boolean mobile){
        this.mobileTest=mobile;
    }
    public boolean getMobileTest(){return mobileTest;}

    //Helper methods
    public void scrollToAndClickElement(WebElement element, int offset) {
        try {
            waitForElement(element);
//            JavascriptExecutor jse = (JavascriptExecutor) driver;
//            jse.executeScript("window.scrollTo(0," + element.getLocation().getY() + ")");
//            jse.executeScript("window.scrollBy(0,-" + offset + ")");
            Actions act = new Actions(driver);
            act.moveToElement(element).click().perform();
            System.out.println("Clicked "+ element.getText());
//            if (mobileTest)
//                jse.executeScript("window.scrollTo(0,0)");
        } catch (Exception e) {
            System.out.println("Unable to locate element " + element.getText() + ".");
            e.printStackTrace();
        }
    }

    public void moveSlider(WebElement slider, int exp){
        waitForElement(slider);
        int width = slider.getSize().getWidth();
        Actions act = new Actions(driver);
        act.moveToElement(slider, ((width * exp) / 100), 0).click().perform();
    }

    public void waitForElement(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }
}
