package au.com.carsguide.testsuite;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.SearchCarsPage;
import au.com.carsguide.pages.SearchCarsResultPage;
import au.com.carsguide.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchCarsTest extends TestBase {

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
    public void validateSearchCarsPage() {

        homePage.mouseHoverOnBuyPlusSell();
        homePage.clickOnSubmenuLink("Search Cars");
        searchCarPage.selectMakeOfCar("BMW");
        searchCarPage.selectModelOfCar("1 Series");
        searchCarPage.selectLocationOfCar("NSW - Sydney");
        searchCarPage.selectPriceOfCar("$30,000");
        searchCarPage.submitFindMyNextCar();

        SoftAssert softAssert = new SoftAssert();

        String expectedList = " 20 BMW 1 Series for Sale under $30,000 in Sydney, NSW";
        softAssert.assertEquals(searchCarResultPage.getTextFromListOfSearchedCars(), expectedList);

        String expectedTitle = "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide";
        softAssert.assertEquals(searchCarResultPage.getPageTitle(), expectedTitle);

        softAssert.assertAll();


    }
}
