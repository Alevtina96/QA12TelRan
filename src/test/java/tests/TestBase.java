package tests;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

import java.lang.reflect.Method;


public class TestBase {

protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser",BrowserType.CHROME));
Logger logger= LoggerFactory.getLogger(TestBase.class);
// WebDriver wd;
//protected static ApplicationManager app = new ApplicationManager
  @BeforeMethod
  public void startLogger(Method m){
     logger.info("Test name ----->" +m.getName());
   }
    @AfterMethod(alwaysRun = true)
    public void endLogger(Method m) {
        logger.info("Test end" + m.getName());
    }
    @BeforeSuite
   public void setUp(){
        app.init();

   }
    @AfterSuite
   public void tearDown(){
        app.stop();
    }
    //app.stop();

}