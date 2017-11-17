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
    public void titleTest() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.clickContinue();
        //System.out.println(homePage.getTitle());
        assertEquals( driver.getTitle(), "ageLOC Me Assessment");
    }

}
