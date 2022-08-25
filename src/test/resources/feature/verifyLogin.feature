Feature: Test Just Dial


  #Author: Prachi
  
  @Smoke
  Scenario: Verify Login
    Given Open the Browser
    When Enter Name "Prachi Gupta" and PhoneNo "9639025834"
    Then Execute Success

@Regression
  Scenario Outline: Verify Train Ticket Booking Module
    Given Click on Train
    When Enter Departure "<city1>" Destination Cities "<city2>"
    And choose date and search
    Then Train List Displayed

    Examples: 
      | city1          | city2                |
      | 344-           | 7581!                |
      | Agra Fort (AF) | Kanpur Central (CNB) |

@Unit
  Scenario: Verify Ticket Book Module
    Given Enter IRCTC ID "shubhamlogani1710" and Choose Any Train
    When Choose any Class
    And Click on Book Now
    Then Execution Success
    
@Test
  Scenario: Fill User Details
    Given Enter name "Prachi Gupta"  Number "8273074761" Click on SendOTP
    When Enter IRCTC ID "shubhamlogani1710" Click Process
    And Enter Passenger Details count
    And title
    And FirstName "Manish"
    And LastName "Sharma"
    And Age "34"
    And Email "prachigupta063@gmail.com"
    And Click Submit
    Then Payment Option Displayed
