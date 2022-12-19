package PageClassPackage;

import Basepackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {
    @FindBy(xpath="//a[@href=\"tel:925-400-7330\"]")
    WebElement Contact;




    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public boolean out(){
        boolean logout1 = Contact.isDisplayed();
        return logout1;

    }













}
