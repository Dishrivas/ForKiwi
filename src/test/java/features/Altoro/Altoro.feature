Feature: Test Altoto flow

  @wp
  Scenario: Test flow to check all the operators are functional
    Given I login and navigate to the "Home Page" page

    When I enter value "99" as left number in calculator
    When I enter value "9" as right number in calculator
    And I select "-" as the operator
    And I Click ‘Calculate’

    When I enter value "100" as left number in calculator
    When I enter value "9" as right number in calculator
    And I select "*" as the operator
    And I Click ‘Calculate’

    When I enter value "9" as left number in calculator
    When I enter value "9" as right number in calculator
    And I select "/" as the operator
    And I Click ‘Calculate’

    When I enter value "9" as left number in calculator
    When I enter value "9" as right number in calculator
    And I select "+" as the operator
    And I Click ‘Calculate’
