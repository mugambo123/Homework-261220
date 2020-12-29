package au.com.carsguide.testbase;

import au.com.carsguide.propertyreader.PropertyReader;
import au.com.carsguide.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"regression"})
    public void openBrowser(){
        selectBrowser(browser);
    }
    @AfterMethod(groups = {"regression"})
    public void tearDown(){
        closerBrowser();
    }
}
