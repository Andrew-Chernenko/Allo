Feature: Login, Registration and Password recovery

  Scenario: Login on the site
    Given Set login and password
    When We wait a login pop-up
    And We try login with this data
    Then Button login should be enabled

  Scenario: Recovery password
    Given Registered email
    When We click button for recovery password
    And We send email for recovery password
    Then Button send message should be enabled

  Scenario: Registration
    Given Set Name,Phone number, Email and Password
    When We click to register button
    And We wait a register pop-up
    And We try to register new account with this data
    Then Button registration should be enabled