Feature: Logout Functionality

  Background:
    Given User has login with credentials bendahara
    And User is on the dashboard page

  Scenario: Check logout is successful
    When User clicks the logout button in the header
    And User clicks "Ya" on the confirmation dialog
    Then User is on the login page
