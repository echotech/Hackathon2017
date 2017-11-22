package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.HomePage;

import static org.testng.Assert.assertEquals;

/**
 * Created by admin on 11/15/2017.
 */
public class Tests extends TestBase {

    @Test
    public void setupTest() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.clickContinue();
        homePage.enterName("Jed", "32", "male");
        homePage.enterEthnicity("caucasian");
        homePage.enterCity("Salt Lake City");
        homePage.chemExposure("77");
        //System.out.println(homePage.getTitle());
        assertEquals( driver.getTitle(), "ageLOC Me Assessment");
    }

    @Test
    public void chemExposureTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.chemExposure("77");
    }

}
