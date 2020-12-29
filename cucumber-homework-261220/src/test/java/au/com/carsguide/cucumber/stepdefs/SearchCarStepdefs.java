package au.com.carsguide.cucumber.stepdefs;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.SearchCarsResultPage;
import au.com.carsguide.pages.SearchCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class SearchCarStepdefs {

    HomePage homePage = new HomePage();
    SearchCarsPage searchCarPage = new SearchCarsPage();
    SearchCarsResultPage seachCarResultPage = new SearchCarsResultPage();

    @Given("^I am on the Home Page of CarsGuide Website$")
    public void iAmOnTheHomePageOfCarsGuideWebsite() {

    }

    @When("^I mouse hover to buy\\+sell Menu$")
    public void iMouseHoverToBuySellMenu() {
        homePage.mouseHoverOnBuyPlusSell();

    }

    @And("^click on submenu \"([^\"]*)\" link$")
    public void clickOnSubmenuLink(String submenu) {

        for (WebElement element : homePage.options) {
            if (element.getText().equals(submenu)) {

                element.click();
                break;
            }
        }

    }

    @And("^select carMaker \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarMakerFromAnyMakeDropdown(String carMaker) {
        searchCarPage.selectMakeOfCar(carMaker);

    }

    @And("^select carModel \"([^\"]*)\" from AnyModel dropdown$")
    public void selectCarModelFromAnyModelDropdown(String carModel) {

        searchCarPage.selectModelOfCar(carModel);
    }

    @And("^select location \"([^\"]*)\" from SelectLocation dropdown$")
    public void selectLocationFromSelectLocationDropdown(String location) {
        searchCarPage.selectLocationOfCar(location);
    }


    @And("^select price \"([^\"]*)\" from price dropdown$")
    public void selectPriceFromPriceDropdown(String price) {
        searchCarPage.selectPriceOfCar(price);
        ;
    }


    @And("^click on Find_My_Next_Car button$")
    public void clickOnFind_My_Next_CarButton() {

        searchCarPage.submitFindMyNextCar();
    }


    @Then("^I should see list of searched cars\"([^\"]*)\" and the page title should be title \"([^\"]*)\"$")
    public void iShouldSeeListOfSearchedCarsAndThePageTitleShouldBeTitle(String cars, String title) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(seachCarResultPage.getTextFromListOfSearchedCars(), cars);

        softAssert.assertEquals(seachCarResultPage.getPageTitle(), title);

        softAssert.assertAll();
    }


}



