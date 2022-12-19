package PageTestPackage;

import Basepackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LandingPage;
import PageClassPackage.LoginPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    HomePage home;
    LoginPage log;
    LandingPage land;


    public LoginPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        Initialization();
        home = new HomePage(driver);
        log = new LoginPage(driver);
        land = new LandingPage(driver);
        home.clicklogin();

    }

    @AfterMethod
    public void teardown() {
       // driver.close();
    }

    @Test
    public void verifylogoTest() {
        boolean verifylogo = log.verifylogo();
        Assert.assertTrue(verifylogo);


    }

    @Test
    public void verifymailTest() {
        boolean veifymail = log.verifymail();
        Assert.assertTrue(veifymail);
    }

    @Test
    public void verifyfreestudentaccesTesT() {
        boolean verifyfree = log.VerfiyFreeStudent();
        Assert.assertTrue(verifyfree);
    }

    @Test
    public void checkwblTest() {
        boolean wbl2 = log.checkwbl1();

        Assert.assertTrue(wbl2);

    }
    @Test
    public void verifylogintitleTest(){
       String actual  =  log.VerifyloginTitle();
       String expected = "QA/QE/SDET Training.";
       Assert.assertEquals(expected,actual);
    }
    @Test
public void loginTest(){
        land= log.loginmethod(prop.getProperty("username"), prop.getProperty("password") );

}


}




