@android @test
  Feature: calculator all operator
    @Positive
    Scenario: operation add with valid number
      Given user is already login
      When user input angka1 field is 22
      And user input angka2 field is 20
      And user click dropdown button
      And user click plus button
      And user click equal button
      Then plus result is 42

    @Positive
    Scenario: operation minus with valid number
      Given user is already login
      When user input angka1 field is 20
      And user input angka2 field is 11
      And user click dropdown button
      And user click minus button
      And user click equal button
      Then minus result is 9

    @Positive
    Scenario: operation multiply with valid number
      Given user is already login
      When user input angka1 field is 5
      And user input angka2 field is 2
      And user click dropdown button
      And user click multiply button
      And user click equal button
      Then multiply result is 10

    @Positive
    Scenario: operation division with valid number
      Given user is already login
      When user input angka1 field is 10
      And user input angka2 field is 2
      And user click dropdown button
      And user click division button
      And user click equal button
      Then division result is 5

   @Negative
    Scenario Outline: operation add with invalid number
      Given user is already login
      When user input angka1 field is "<number1>"
      And user input angka2 field is "<number2>"
      And user click dropdown button
      And user click plus button
      And user click equal button
      Then add results is "NaN"
      Examples:
     |number1|number2|
     |sdf    |gsg    |
     |#@     |&$     |
     |f42    |$42    |

    @Negative
    Scenario Outline: operation minus with invalid number
      Given user is already login
      When user input angka1 field is "<number1>"
      And user input angka2 field is "<number2>"
      And user click dropdown button
      And user click minus button
      And user click equal button
      Then add results is "NaN"
      Examples:
        |number1|number2|
        |sdf    |gsg    |
        |#@     |&$     |
        |f42    |$42    |

    @Negative
    Scenario Outline: operation multiply with invalid number
      Given user is already login
      When user input angka1 field is "<number1>"
      And user input angka2 field is "<number2>"
      And user click dropdown button
      And user click multiply button
      And user click equal button
      Then add results is "NaN"
      Examples:
        |number1|number2|
        |sdf    |gsg    |
        |#@     |&$     |
        |f42    |$42    |

    @Negative
    Scenario Outline: operation division with invalid number
      Given user is already login
      When user input angka1 field is "<number1>"
      And user input angka2 field is "<number2>"
      And user click dropdown button
      And user click division button
      And user click equal button
      Then add results is "NaN"
      Examples:
        |number1|number2|
        |sdf    |gsg    |
        |#@     |&$     |
        |f42    |$42    |

    @Positive
    Scenario: operation add with valid number decimal
      Given user is already login
      When user input angkadesimal1 field is 3,14
      And user input angkadesimal2 field is 5,14
      And user click dropdown button
      And user click plus button
      And user click equal button
      Then plus decimal result is 8,28

    @Positive
    Scenario: operation minus with valid number decimal
      Given user is already login
      When user input angkadesimal1 field is 22,2
      And user input angkadesimal2 field is 11,1
      And user click dropdown button
      And user click minus button
      And user click equal button
      Then minus decimal result is 11,1

    @Positive
    Scenario: operation multiply with valid number decimal
      Given user is already login
      When user input angkadesimal1 field is 5,2
      And user input angkadesimal2 field is 2,2
      And user click dropdown button
      And user click multiply button
      And user click equal button
      Then multiply decimal result is 11,44

    @Positive
    Scenario: operation division with valid number decimal
      Given user is already login
      When user input angkadesimal1 field is 10,2
      And user input angkadesimal2 field is 2,2
      And user click dropdown button
      And user click division button
      And user click equal button
      Then division decimal result is 4,6


