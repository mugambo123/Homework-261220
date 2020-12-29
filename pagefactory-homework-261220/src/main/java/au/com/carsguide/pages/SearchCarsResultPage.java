package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SearchCarsResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchCarsResultPage.class.getName());

    @FindBy(xpath = "//h1[@class = \"listing-search-title\"]")
    WebElement _listOfSearchedCars;


    //This method will get text from  search result page
    public String getTextFromListOfSearchedCars(){
        Reporter.log("Get text from search result : " + _listOfSearchedCars.toString() + "<br>");
        log.info("Get text from search result : "+ _listOfSearchedCars.toString());
        return getTextFromElement(_listOfSearchedCars);
    }

    //This method will get title of search result page
    public String getPageTitle(){
        Reporter.log("Get title from search result page : ");
        log.info("Get title of page : ");
        return driver.getTitle();
    }
}
