Feature: Login to my application

  Scenario: Home page default login
    Given user is on Netbanking landing page
    When user login into application with username "Test1" and password "1234"
    Then Home page is populated
    And cards displayed are "True"
    
  Scenario: Home page default login
    Given user is on Netbanking landing page
    When user login into application with username "Test2" and password "5678"
    Then Home page is populated
    And cards displayed are "false"