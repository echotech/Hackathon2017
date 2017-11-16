package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.HomePage;

import static org.testng.Assert.assertEquals;

/**
 * Created by admin on 11/15/2017.
 */
public class Test extends TestBase {

    @Test
    public void titleTest(){
        HomePage homePage = new HomePage(driver);
        //System.out.println(homePage.getTitle());
        assertEquals( driver.getTitle(), "Ski Utah | Utah Ski Resorts, Lift Tickets, Ski Passes, Maps & More! - Ski Utah");
    }

}
