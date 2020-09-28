Feature: Ordering and check add product to the cart

  Scenario: Check add product to the cart
    Given Take cart value
    When Search product and add to the cart
    Then Сhanging the counter of items in the cart

    Scenario Outline: Ordering
      Given Open site and init page
      When Add product to the cart and ordering set <Name> and <PhoneNumber> and <Email>
      Then Button success ordering should be enabled <Name>
      Examples:
        | Name         | PhoneNumber    | |Email              |
        |   "Андрей"   |   "994567634"  | | "test@gmail.com"  |
        |   ""         |   ""           | | ""                |