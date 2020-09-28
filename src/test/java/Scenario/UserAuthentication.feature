Feature: Login, Registration and Password recovery

  Scenario: Login on the site
    Given Login and password
    When We try to login with this data
    Then Button login should be enabled

  Scenario: Recovery password
    Given Registered email
    When We click button for recovery password, input email
    Then Button send message should be enabled

  Scenario: Registration
    Given Name,Phone number, Email and Password
    When We try to register new account with this data
    Then Button registration should be enabled