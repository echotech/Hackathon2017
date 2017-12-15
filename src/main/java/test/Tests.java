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
        homePage.setDayFragrance("yes");
        homePage.setDayMoisturizer("");
        homePage.setNightFragrance("no");
        homePage.setNightMoisturizer("20");
        homePage.finishAssessment();
        //System.out.println(homePage.getTitle());
        assertEquals( homePage.getCareCode(), "AB73");
    }

    @Test
    public void chemExposureTest(){
        HomePage homePage = new HomePage(driver);
        homePage.chemExposure(77);
    }

    @Test
    public void sunExposureTest(){
        HomePage homePage = new HomePage(driver);
        homePage.sunExposure(50);
    }

    @Test
    public void skinTypeTest(){
        HomePage homePage = new HomePage(driver);
        homePage.setSkinType("dry");
    }

}
