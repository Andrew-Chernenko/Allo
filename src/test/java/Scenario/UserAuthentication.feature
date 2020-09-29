Feature: Login, Registration and Password recovery

  Scenario: Login on the site
    Given We open site and init page
    When We set user data
    And We click a login button
    And We wait a login pop-up
    And We try login with this data
    Then Button login should be enabled

  Scenario: Recovery password
    Given We open site and init page
    When We set a password recovery email
    And We click a login button
    And We click button for recovery password
    And We input email for recovery password
    Then Button send message should be enabled

  Scenario: Registration
    Given We open site and init page
    When We set Name,Phone number, Email and Password
    And We click a login button
    And We click to register button
    And We wait a register pop-up
    And We try to register new account with this data
    Then Button registration should be enabled