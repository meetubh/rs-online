
Feature: Booking a Hotel at Adactin

  Scenario Outline: Booking a hotel with all mandatory details
    Given I am on Adactin Home page with browser "Chrome"
    And I login to the application by providing below credentials
    |Username|<usr>|
    |Password|<pwd>|
    Then I input required information to search a hotel
    And Select the resulted hotel and proceed to book the hotel
    And I validate the booking confirmation message
    Then I logout of the application
    Examples:
    |usr|pwd|
    |RobinCAP|79D209|