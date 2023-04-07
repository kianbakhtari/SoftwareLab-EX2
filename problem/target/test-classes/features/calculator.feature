@tag
Feature: Calculator
  Scenario: reverse a number
    Given Two input values, 4, rvs
    When I calculate
    Then I expect the result 0.25

  Scenario: square root of a number
    Given Two input values, 4, sqr
    When I calculate
    Then I expect the result 2.0

  Scenario Outline: reverse and square
    Given Two input values, <input>, <opt>
    When I calculate
    Then I expect the result <results>

    Examples:
      | input | opt | results |
      | 1 | rvs | 1.0 |
      | -4 | rvs | -0.25 |
      | 9  | sqr | 3.0 |
      | 5  | rvs | 0.2 |
      | 10  | sqr | 3.162 |




