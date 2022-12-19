package PageTestPackage;

import Basepackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LandingPage;
import PageClassPackage.LoginPage;
import UtilPackage.ReadXl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageDDT extends BaseClass {
    HomePage home;
    LoginPage log;
    LandingPage land;


    public LoginPageDDT() {
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
        driver.close();
    }

        @Test(dataProvider = "logindata")
                public void loginddt(String username,String password){
            log.loginmethod(username,password);

        }
    @DataProvider(name="logindata")
    String [][]getdata() throws IOException{
        String path="C:\\Users\\deepa\\Documents\\Barkha new intellij\\AutomationFrameworkPractice\\src\\" +
                "test\\resources\\ExcelData\\testdata.xlsx";
        int rownum=ReadXl.getRowCount(path, "Sheet1");
        int colcount=ReadXl.getCellCount(path, "Sheet1", 1);
        String logindata[][]=new String[rownum][colcount];
        //0 is for header..column is 0
        for(int i=1;i<=rownum;i++) {
            for(int j=0;j<colcount;j++ ) {
                logindata[i-1][j]=ReadXl.getCellData(path, "Sheet1", i, j);//1  0
            }
        }
        return logindata;
    }




}