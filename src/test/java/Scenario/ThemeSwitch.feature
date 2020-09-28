Feature: Switch theme, language and category

  Scenario: Switch theme on the site
    Given Main page on the site
    When We take a header color
    And We switched color
    Then Header change color to black

  Scenario: Switch language
    Given Main page on the Ukrainian language
    When We try swap language
    Then New url

 Scenario Outline: Switch category
    Given Main page
    When We click to the same category <category>
    Then We will be on this url <currentUrl>
    Examples:
     | category                     | currentUrl                                                   |
     |    "Смартфоны и телефоны"    |   "https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/"  |
     |    "Бытовая техника"         |   "https://allo.ua/ua/bytovaya-tehnika/"                     |
