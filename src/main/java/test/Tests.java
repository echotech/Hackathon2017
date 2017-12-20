package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.HomePage;
import util.Helpers;

import static org.testng.Assert.assertEquals;

/**
 * Created by admin on 11/15/2017.
 */
public class Tests extends TestBase {

    @Test
    public void setupTest() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.startAssessment("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
        homePage.enterName("Jed", "32", "male");
        homePage.enterEthnicity("caucasian");
        homePage.enterCity("Salt Lake City");
        homePage.chemExposure(77);
        homePage.sunExposure(50);
        homePage.setSkinType("dry");
        homePage.setSkinIrritability(5);
        homePage.setAhaUse("stopped");
        homePage.setAgeSpots(20);
        homePage.setWrinkles(30,45,55);
        homePage.setPoreSize(40);
        homePage.setFirmness("veryFirm");
        homePage.setRadiance("veryRadiant");
        homePage.setTexture("rough");
        homePage.setFragrance("yes");
        homePage.setDayMoisturizer("");
        homePage.setFragrance("no");
        homePage.setNightMoisturizer("20");
        homePage.finishAssessment();
        //System.out.println(homePage.getTitle());
        assertEquals( homePage.getCareCode(), "AB73");
    }

    @Test(priority=1)
    public void setupGalaxyTest() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.startAssessment("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
        homePage.enterName("Jed", "32", "male");
        homePage.enterEthnicity("caucasian");
        homePage.enterCity("Salt Lake City");
        homePage.chemExposure(77);
        homePage.sunExposure(50);
        homePage.setSkinType("dry");
        homePage.setSkinIrritability(5);
        homePage.setAhaUse("stopped");
        homePage.setAgeSpots(20);
        homePage.setWrinkles(30,45,55);
        homePage.setPoreSize(40);
        homePage.setFirmness("veryFirm");
        homePage.setRadiance("veryRadiant");
        homePage.setTexture("rough");
        homePage.setFragrance("yes");
        homePage.setDayMoisturizer("");
        homePage.setFragrance("no");
        homePage.setNightMoisturizer("20");
        homePage.finishAssessment();
        //System.out.println(homePage.getTitle());
        assertEquals( homePage.getCareCode(), "AB73");
    }

    @Test(priority=2)
    public void setupIpadTest() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.startAssessment("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
        homePage.enterName("Jed", "32", "male");
        homePage.enterEthnicity("caucasian");
        homePage.enterCity("Salt Lake City");
        homePage.chemExposure(77);
        homePage.sunExposure(50);
        homePage.setSkinType("dry");
        homePage.setSkinIrritability(5);
        homePage.setAhaUse("stopped");
        homePage.setAgeSpots(20);
        homePage.setWrinkles(30,45,55);
        homePage.setPoreSize(40);
        homePage.setFirmness("veryFirm");
        homePage.setRadiance("veryRadiant");
        homePage.setTexture("rough");
        homePage.setFragrance("yes");
        homePage.setDayMoisturizer("");
        homePage.setFragrance("no");
        homePage.setNightMoisturizer("20");
        homePage.finishAssessment();
        //System.out.println(homePage.getTitle());
        assertEquals( homePage.getCareCode(), "AB73");
    }


}
