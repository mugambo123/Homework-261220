package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement _buyPlusSell;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement _searchCars;

    @FindBy(xpath ="//p[contains(text(),'Buy')]//parent::div[@class =\"uhf-child-menu\"]//a" )
    public List<WebElement> _buyOptions;
    public List<WebElement> options = _buyOptions;

    //This method will do mouse hover on buy+sell
    public void mouseHoverOnBuyPlusSell(){
        Reporter.log("Mouse Hover on buy+sell : "  + _buyPlusSell.toString() + "<br>");
        log.info("Mouse Hover on buy+sell : "  + _buyPlusSell.toString());
        mouseHoverToElement(_buyPlusSell);
    }

    public void clickOnSubmenuLink(String submenu) {

        for (WebElement element : options) {
            if (element.getText().equals(submenu)) {

                element.click();
                break;
            }
        }

    }

}
