package au.com.carsguide.testsuite;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.SearchCarsPage;
import au.com.carsguide.pages.SearchCarsResultPage;
import au.com.carsguide.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsedCarsSearchTest extends TestBase {

    HomePage homePage;
    SearchCarsPage searchCarPage;
    SearchCarsResultPage searchCarResultPage;


    @BeforeMethod(groups = {"regression"})
    public void setUp() {
        homePage = new HomePage();
        searchCarPage = new SearchCarsPage();
        searchCarResultPage = new SearchCarsResultPage();
    }

    @Test(groups = {"regression"})
    public void validateUsedSearchCarsPage() {

        homePage.mouseHoverOnBuyPlusSell();
        homePage.clickOnSubmenuLink("Used");
        searchCarPage.selectMakeOfCar("Audi");
        searchCarPage.selectModelOfCar("A4");
        searchCarPage.selectLocationOfCar("SA - All");
        searchCarPage.selectPriceOfCar("$20,000");
        searchCarPage.submitFindMyNextCar();

        SoftAssert softAssert = new SoftAssert();

        String expectedList = "10 Used Audi A4s for Sale under $20,000 in SA";
        softAssert.assertEquals(searchCarResultPage.getTextFromListOfSearchedCars(), expectedList);

        String expectedTitle = "Used Audi A4 Under 20000 for Sale SA | carsguide";
        softAssert.assertEquals(searchCarResultPage.getPageTitle(), expectedTitle);

        softAssert.assertAll();


    }
}
