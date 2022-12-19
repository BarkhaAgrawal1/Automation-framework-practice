package Basepackage;

import UtilPackage.Utilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    public static Logger logger;
    public BaseClass() {
        try {

            prop = new Properties();
            FileInputStream fi = new FileInputStream("C:\\Users\\deepa\\Documents\\Barkha new intellij\\AutomationFrameworkPractice\\src\\main\\" +
                    "java\\ConficPackage\\Config.Properties");
            prop.load(fi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

        logger=Logger.getLogger("Automation Framework");
        PropertyConfigurator.configure("C:\\Users\\deepa\\Documents\\Barkha new intellij\\" +
                "AutomationFrameworkPractice\\src\\main\\resources\\log4j.properties");





        driver.manage().timeouts().pageLoadTimeout(Utilis.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utilis.IMPLICIT_WAIT,TimeUnit.SECONDS);
    }
}