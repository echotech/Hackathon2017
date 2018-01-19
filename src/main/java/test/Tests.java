package test;

import base.TestBase;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.HomePage;
import util.ExcelReader;
import util.Helpers;
import util.Log;

import java.io.File;

import static org.testng.Assert.assertEquals;

/**
 * Created by admin on 11/15/2017.
 */
public class Tests extends TestBase {

    @DataProvider(name="userData")
    public Object[][] createData1() throws Exception{
        Object[][] retObjArr=getTableArray("C:\\\\Users\\\\Jed Reisner\\\\IdeaProjects\\\\Hackathon2017\\\\src\\\\main\\\\java\\\\testdata\\\\assessmentdata.xls",
                "Sheet1");
        return(retObjArr);
    }

    public String[][] getTableArray(String xlFilePath, String sheetName) throws Exception{
        String[][] tabArray=null;

        Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
        Sheet sheet = workbook.getSheet(sheetName);
        int startRow,startCol, endRow, endCol,ci,cj;
        Cell tableStart=sheet.findCell("country");
        startRow=tableStart.getRow();
        startCol=tableStart.getColumn();

        Cell tableEnd= sheet.getCell(26,33);

        endRow=tableEnd.getRow();
        endCol=tableEnd.getColumn();
        System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                "startCol="+startCol+", endCol="+endCol);
        tabArray=new String[endRow-startRow-1][endCol-startCol-1];
        ci=0;

        for (int i=startRow+1;i<endRow;i++,ci++){
            cj=0;
            for (int j=startCol+1;j<endCol;j++,cj++){
                tabArray[ci][cj]=sheet.getCell(j,i).getContents();
            }
        }


        return(tabArray);
    }

    @Test
    public void setupTest() throws Exception{
        Log.startTestCase("setupTest");
        setMobileTest(true);
        Log.info("Mobiletest is "+mobileTest);
        HomePage homePage = new HomePage(driver);
        homePage.startAssessment("https://www.nuskin.com/content/nuskin/en_BE/ageloc-me-assessment.html");
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
        Log.endTestCase("setupTest");
    }

    @Test(dataProvider="userData")
    public void setupTestExcel(String CountryURL, String Country, String Age, String Gender, String Race, String City, String ChemExp, String SunExp, String SkinType,
    String Irritability, String Aha, String AgeSpots, String Wrinkles, String Nose, String Pores, String PoreSize, String Firmness, String Radiant, String Texture,
    String DayFrag, String DayMoist, String NightFrag, String NightMoist, String OrigAssessment) throws Exception{
        Log.startTestCase("setupTestExcel");
        setMobileTest(true);
        Log.info("Mobiletest is "+mobileTest);
        HomePage homePage = new HomePage(driver);
        homePage.startAssessment(CountryURL);
        homePage.enterName(Country, Age, Gender);
        homePage.enterEthnicity(Race);
        homePage.enterCity(City);
        homePage.chemExposure(Integer.parseInt(ChemExp));
        homePage.sunExposure(Integer.parseInt(SunExp));
        homePage.setSkinType(SkinType);
        homePage.setSkinIrritability(Integer.parseInt(Irritability));
        homePage.setAhaUse(Aha);
        homePage.setAgeSpots(Integer.parseInt(AgeSpots));
        homePage.setWrinkles(Integer.parseInt(Wrinkles),Integer.parseInt(Nose),Integer.parseInt(Pores));
        homePage.setPoreSize(Integer.parseInt(PoreSize));
        homePage.setFirmness(Firmness);
        homePage.setRadiance(Radiant);
        homePage.setTexture(Texture);
        homePage.setFragrance(DayFrag);
        homePage.setDayMoisturizer("");
        homePage.setFragrance(NightFrag);
        homePage.setNightMoisturizer("");
        homePage.finishAssessment();
        //System.out.println(homePage.getTitle());
        assertEquals( homePage.getCareCode(), OrigAssessment);
        Log.endTestCase("setupTest");
    }

}
