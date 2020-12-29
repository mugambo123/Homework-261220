package au.com.carsguide.cucumber.stepdefs;

import au.com.carsguide.pages.SearchCarsResultPage;
import cucumber.api.java.en.Then;
import org.testng.asserts.SoftAssert;

public class UsedCarSearchStepdefs {
    SearchCarsResultPage seachCarResultPage = new SearchCarsResultPage();
    @Then("^I should see list of Used cars \"([^\"]*)\" and the page title should match expected title  \"([^\"]*)\"$")
    public void iShouldSeeListOfUsedCarsAndThePageTitleShouldMatchExpectedTitle(String cars, String title) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(seachCarResultPage.getTextFromListOfSearchedCars(), cars);

        softAssert.assertEquals(seachCarResultPage.getPageTitle(), title);

        softAssert.assertAll();;
    }
}
