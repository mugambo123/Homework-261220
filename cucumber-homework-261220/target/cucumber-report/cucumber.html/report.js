$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/searchcars.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that\r\nthe Search Cars page is working\r\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7768963900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "As a user I Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;as-a-user-i-validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SearchCars"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on submenu \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select carMaker \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select carModel \"1 Series\" from AnyModel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select location \"NSW - Sydney\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select price \"$30,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of searched cars\"20 BMW 1 Series for Sale under $30,000 in Sydney, NSW\" and the page title should be title \"Bmw 111111 Series Under 30000 for Sale Sydney NSW | carsguide\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCarStepdefs.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 331194800,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepdefs.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 1024933700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 18
    }
  ],
  "location": "SearchCarStepdefs.clickOnSubmenuLink(String)"
});
formatter.result({
  "duration": 546909600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 17
    }
  ],
  "location": "SearchCarStepdefs.selectCarMakerFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 1139965000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 17
    }
  ],
  "location": "SearchCarStepdefs.selectCarModelFromAnyModelDropdown(String)"
});
formatter.result({
  "duration": 322890200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Sydney",
      "offset": 17
    }
  ],
  "location": "SearchCarStepdefs.selectLocationFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 156383700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$30,000",
      "offset": 14
    }
  ],
  "location": "SearchCarStepdefs.selectPriceFromPriceDropdown(String)"
});
formatter.result({
  "duration": 160503700,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepdefs.clickOnFind_My_Next_CarButton()"
});
formatter.result({
  "duration": 1475869500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20 BMW 1 Series for Sale under $30,000 in Sydney, NSW",
      "offset": 35
    },
    {
      "val": "Bmw 111111 Series Under 30000 for Sale Sydney NSW | carsguide",
      "offset": 126
    }
  ],
  "location": "SearchCarStepdefs.iShouldSeeListOfSearchedCarsAndThePageTitleShouldBeTitle(String,String)"
});
formatter.result({
  "duration": 1613476600,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\texpected [20 BMW 1 Series for Sale under $30,000 in Sydney, NSW] but found [22 BMW 1 Series for Sale under $30,000 in Sydney, NSW],\n\texpected [Bmw 111111 Series Under 30000 for Sale Sydney NSW | carsguide] but found [Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat au.com.carsguide.cucumber.stepdefs.SearchCarStepdefs.iShouldSeeListOfSearchedCarsAndThePageTitleShouldBeTitle(SearchCarStepdefs.java:83)\r\n\tat ✽.Then I should see list of searched cars\"20 BMW 1 Series for Sale under $30,000 in Sydney, NSW\" and the page title should be title \"Bmw 111111 Series Under 30000 for Sale Sydney NSW | carsguide\"(src/test/java/resources/featurefile/searchcars.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1454871600,
  "status": "passed"
});
formatter.uri("src/test/java/resources/featurefile/usedcarssearchsale.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that\r\nthe Used Search Cars page is working\r\nPerforming the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7035881400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate Used  Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-used--search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@UsedCarSearch"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on submenu \"Used\" link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select carMaker \"Audi\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select carModel \"A4\" from AnyModel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select location \"SA - All\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select price \"$20,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see list of Used cars \"10 Used Audi A4s for Sale under $20,000 in SA\" and the page title should match expected title  \"Used Audi A4 Under 20000 for Sale SA | carsguide\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCarStepdefs.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 17717900,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepdefs.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 1096766000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 18
    }
  ],
  "location": "SearchCarStepdefs.clickOnSubmenuLink(String)"
});
formatter.result({
  "duration": 1182631000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 17
    }
  ],
  "location": "SearchCarStepdefs.selectCarMakerFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 518476700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A4",
      "offset": 17
    }
  ],
  "location": "SearchCarStepdefs.selectCarModelFromAnyModelDropdown(String)"
});
formatter.result({
  "duration": 414187100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SA - All",
      "offset": 17
    }
  ],
  "location": "SearchCarStepdefs.selectLocationFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 178452400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20,000",
      "offset": 14
    }
  ],
  "location": "SearchCarStepdefs.selectPriceFromPriceDropdown(String)"
});
formatter.result({
  "duration": 174151100,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepdefs.clickOnFind_My_Next_CarButton()"
});
formatter.result({
  "duration": 1458083700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 Used Audi A4s for Sale under $20,000 in SA",
      "offset": 32
    },
    {
      "val": "Used Audi A4 Under 20000 for Sale SA | carsguide",
      "offset": 128
    }
  ],
  "location": "UsedCarSearchStepdefs.iShouldSeeListOfUsedCarsAndThePageTitleShouldMatchExpectedTitle(String,String)"
});
formatter.result({
  "duration": 1757224200,
  "status": "passed"
});
formatter.after({
  "duration": 884327200,
  "status": "passed"
});
});