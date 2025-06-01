Feature: Login Functionality

  Background:
    Given User has open the browser
    And has navigated on the login page

  @ValidCredentials
  Scenario: Successful login with valid credentials
    When User enters username "bendahara" and password "admin123"
    Then User should see dashboard with title "Dasbor - Bendahara"
    And User should be able to see navigation bar for bendahara

  @InvalidCredentials
  Scenario: Unsuccessful login with invalid credentials
    When User enters username "indra" and password "admin123"
    Then User should see error message "Username atau password salah"
