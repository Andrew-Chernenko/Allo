Feature: Login

  Scenario: Login on the site
    Given Login and password
    When We try to login with this data
    Then Button login should be enabled