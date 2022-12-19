package PageTestPackage;

import Basepackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LandingPage;
import PageClassPackage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass {
    HomePage home;
    LandingPage land;
    LoginPage log;

    public LandingPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        Initialization();
        home = new HomePage(driver);
        log = new LoginPage(driver);
        land = new LandingPage(driver);
        home.clicklogin();

        log.loginmethod(prop.getProperty("username"), prop.getProperty("password") );


    }
    @AfterMethod
    public void teardowm(){
        //driver.close();

    }
@Test
    public void logouttest(){
       boolean outtest =  land.out();
        Assert.assertTrue(outtest);

    }

}