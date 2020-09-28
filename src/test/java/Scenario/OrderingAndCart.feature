Feature: Ordering and check add product to the cart

  Scenario: Check add product to the cart
    Given Take cart value
    When Search product "Samsung"
    And Add product to cart with model "SM-N985FZNGSEK"
    Then Сhanging the counter of items in the cart

    Scenario Outline: Ordering
      Given Open site and init page
      When Search "Айфон"
      And Add product to the cart with model "MWM02"
      And Wait ordering pup-up
      And Ordering set name <Name>
      And Ordering set phoneNumber <PhoneNumber>
      And Ordering set email <Email>
      Then Button success ordering should be enabled <Name>
      Examples:
        | Name         | PhoneNumber    | |Email              |
        |   "Андрей"   |   "994567634"  | | "test@gmail.com"  |
        |   ""         |   ""           | | ""                |