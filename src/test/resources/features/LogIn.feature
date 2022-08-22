Feature: LogIn To YourLogo


  Scenario: Login with valid credential
    Given user is on home page
    When user enter "dec2020secondbatch@gmail.com" as E-mail
    And user enter "Selenium@12345" as password
    And user click button LogIn
    Then user should be able to login

