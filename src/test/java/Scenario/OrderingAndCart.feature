Feature: Ordering and check add product to the cart

  Scenario: Check add product to the cart
    Given We open site and init page
    When We take cart value
    And We search product "Samsung"
    And We add model "SM-N985FZNGSEK" to cart
    Then We see changing the counter of items in the cart

    Scenario Outline: Ordering
      Given We open site and init page
      When We search product "Айфон"
      And We add model "MWM02" to cart
      And We wait ordering pup-up
      And We set name on Ordering page <Name>
      And We set phoneNumber on Ordering page <PhoneNumber>
      And We set email on Ordering page <Email>
      Then We check button success ordering should be enabled <Name>
      Examples:
        | Name         | PhoneNumber     | Email             |
        |   "Андрей"   |   "994567634"   | "test@gmail.com"  |
        |   ""         |   ""            | ""                |