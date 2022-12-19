package PageClassPackage;

import Basepackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {


    @FindBy(id = "logo")
    WebElement logo;

    @FindBy(id="loginButton")
    WebElement loginbtn;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public boolean checklogo(){
        boolean log=logo.isDisplayed();
        return log;
    }

    public LoginPage clicklogin() {
        loginbtn.click();
        return new LoginPage(driver);
    }

}
