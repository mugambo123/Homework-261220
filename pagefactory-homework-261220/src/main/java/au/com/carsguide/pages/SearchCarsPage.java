package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SearchCarsPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchCarsPage.class.getName());

    @FindBy(xpath = "//select[@id='makes']")
    WebElement _selectMake;

    @FindBy(xpath = "//option[@data-gtm-label = \"make\"]")
    WebElement _make;

    @FindBy(xpath = "//select[@id='models']")
    WebElement _selectModels;

    @FindBy(xpath = "//select[@id='locations']")
    WebElement _selectLocation;

    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement _selectPrice;

    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement _submitFindMyNextCar;

    //This method will select car brand
    public void selectMakeOfCar(String carMaker) {
        Reporter.log("Select car brand : " + _selectMake.toString() + "<br>");
        log.info("Select car brand : " + _selectMake.toString());
        selectByValueFromDropDown(_selectMake, carMaker);
    }

    //This method will select car model
    public void selectModelOfCar(String carModel) {
        Reporter.log("Select car model : " + _selectModels.toString() + "<br>");
        log.info("Select car model : " + _selectModels.toString());
        selectByValueFromDropDown(_selectModels, carModel);
    }

    //This method will select location of searched car
    public void selectLocationOfCar(String location) {
        Reporter.log("Select car location : " + _selectLocation.toString() + "<br>");
        log.info("Select car location : " + _selectLocation.toString());
        selectByValueFromDropDown(_selectLocation, location);
    }

    //This method will select maximum price of car you wish to buy
    public void selectPriceOfCar(String price) {
        Reporter.log("Select maximum price : " + _selectPrice.toString() + "<br>");
        log.info("Select car maximum price : " + _selectPrice.toString());
        selectByVisibleTextFromDropDown(_selectPrice, price);
    }

    //This method will submit your search criteria of car
    public void submitFindMyNextCar() {
        Reporter.log("Submit search criteria : " + _submitFindMyNextCar.toString() + "<br>");
        log.info("Submit search criteria : " + _submitFindMyNextCar.toString());
        clickOnElement(_submitFindMyNextCar);
    }
}
