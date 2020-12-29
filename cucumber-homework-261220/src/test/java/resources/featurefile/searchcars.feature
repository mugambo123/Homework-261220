Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that
  the Search Cars page is working
  Doing the Acceptance Testing
@SearchCars
  Scenario: As a user I Validate Search Cars Page
    Given I am on the Home Page of CarsGuide Website
    When I mouse hover to buy+sell Menu
    And click on submenu "Search Cars" link
    And select carMaker "BMW" from AnyMake dropdown
    And select carModel "1 Series" from AnyModel dropdown
    And select location "NSW - Sydney" from SelectLocation dropdown
    And select price "$30,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see list of searched cars"20 BMW 1 Series for Sale under $30,000 in Sydney, NSW" and the page title should be title "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide"

