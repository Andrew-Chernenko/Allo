Feature: Search product on different language
  Scenario Outline: Navigate to product
    Given We open site and init page
    When We search product <product>
    Then We click to the product with <text>
    And Pages must contains <text>
    Examples:
      | product                     | text                 |
      |    "Холодильник"            |   "SJ-BB10IMXL1-UA"  |
      |    "Samsung"                |   "SM-G780FLVDSEK"   |

  Scenario Outline: Search product
    Given We open site and init page
    When We search product <product>
    Then We will be on this <currentUrl>
    Examples:
      | product                     | currentUrl                                                       |
      |    "Vacuum cleaner"         |   "https://allo.ua/ua/catalogsearch/result/?q=Vacuum%20cleaner"  |
      |    "Айфон"                  |   "https://allo.ua/ua/catalogsearch/result/?q=iphone"            |