package PageClassPackage;

import Basepackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

@FindBy(xpath = "//*[@id=\"logo\"]")
    WebElement logo;

@FindBy(xpath = "/html/body/header/div[2]/div/div/ul/p[2]/a")
    WebElement mail;

@FindBy(id="loginbyfb")
WebElement freestudent;

@FindBy(xpath = "//*[@id=\"wblhead\"]")
WebElement WBL;

@FindBy(xpath = "//*[@id=\"username\"]")
WebElement username;
@FindBy(xpath = "//*[@id=\"password\"]")
WebElement password;
@FindBy(xpath = "//*[@id=\"login\"]")
WebElement loginbtn;




public LoginPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);

}

public boolean verifylogo(){
   boolean verlogo = logo.isDisplayed();
   return verlogo;
}

public boolean verifymail() {
    boolean vermail = mail.isDisplayed();
    return vermail;
}
public boolean VerfiyFreeStudent() {

    boolean frees= freestudent.isDisplayed();
    return frees;
}
public boolean checkwbl1(){
   boolean wbll= WBL.isDisplayed();
   return wbll;
}

public String VerifyloginTitle(){
    String title1= driver.getTitle();
    return title1;
}
public LandingPage loginmethod(String un,String pwd){
    username.sendKeys(un);password.sendKeys(pwd);
    loginbtn.click();
    return new LandingPage(driver);
}

}

