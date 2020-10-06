Feature: Login, Registration and Password recovery

  Scenario Outline: Login on the site
    Given We open site and init page
    When We click a login button
    And We wait a login pop-up
    And We set registered Email <Email>
    And We set registered Password <Password>
    Then Button login should be enabled
    Examples:
      | Email               | Password             |
      | "test@gmail.com"    |    "qwerty12345"     |

  Scenario Outline: Recovery password
    Given We open site and init page
    When We click a login button
    And We click button for recovery password
    And We set registered Email <Email>
    Then Button send message should be enabled
    Examples:
      |Email                |
      |  "test@gmail.com"   |

  Scenario Outline: Registration
    Given We open site and init page
    When We click a login button
    And We click to register button
    And We wait a register pop-up
    And We set name <Name>
    And We set phone number <PhoneNumber>
    And We set email <Email>
    And We set password <Password>
    Then Button registration should be enabled
    Examples:
      |Name        | PhoneNumber  | Email                       | Password       |
      | "Андрей"   | "956765444"  | "test12345612355@gmail.com" |  "qwerty12345" |