Feature: Book Hotel on Just Dial

  #Author: Prachi
  
  @Smoke
  Scenario: Search For hotel
    Given Open Just Dial
    When Search for hotel  Enter City
    And Choose CheckIn and CheckOut date
    And Choose NoOfPerson
    Then Hotel List Displayed
@Smoke@Regression
  Scenario: Search for a specific hotel
    Given Hotel List Displayig
    When Enter Hotel Name "Hotel Jannat"
    Then Details displayed
