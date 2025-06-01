Feature: Logout Functionality
  Scenario: Check logout is successful
    Given User has login with credentials bendahara
    And User is on the dashboard page    
    When User clicks the logout button in the header
    And User clicks "Ya" on the confirmation dialog
    Then User is on the login page