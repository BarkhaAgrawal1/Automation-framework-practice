package PageTestPackage;

import Basepackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    HomePage home;
    LoginPage login;

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        logger.info("here Webdriver inti will happen");
        logger.info("Url and waits will be applied ");
        home=new HomePage(driver);

    }
    @AfterMethod
    public void teardown(){
        driver.close();
        logger.info("window will closes after method excecuted");
    }
    @Test
    public void checklogo1(){
        boolean logo1=home.checklogo();
        Assert.assertTrue(logo1);
    }
    @Test
    public void clickloginbtn(){
        home.clicklogin();
    }


}
