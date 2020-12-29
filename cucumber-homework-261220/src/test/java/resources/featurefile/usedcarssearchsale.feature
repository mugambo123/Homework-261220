Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that
  the Used Search Cars page is working
  Performing the Acceptance Testing

@UsedCarSearch
  Scenario: Validate Used  Search Cars Page
    Given I am on the Home Page of CarsGuide Website
    When I mouse hover to buy+sell Menu
    And click on submenu "Used" link
    And select carMaker "Audi" from AnyMake dropdown
    And select carModel "A4" from AnyModel dropdown
    And select location "SA - All" from SelectLocation dropdown
    And select price "$20,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see list of Used cars "10 Used Audi A4s for Sale under $20,000 in SA" and the page title should match expected title  "Used Audi A4 Under 20000 for Sale SA | carsguide"
