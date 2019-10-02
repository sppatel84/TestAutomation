Feature: New Entity

  @Regression
  Scenario Outline: validate that user can fill new entity form with all the details with valid information
    Given user on "New entity" page
    When user enter Full name as "<name>"
    And user enter country as "<country>"
    And user enter year of birth "<birthDate>"
    And user enter position as "<position>"
    And user enter source info URL as "<url>"
    And user select the risk level as "<level>"
    When user click on "Save" button to save the new entity
    Then user can view new entity added successfully message as "<message>"

    Examples:
      | name        | country        | birthDate  | position | url      | level | message                                     |
      | John Doe    | United Kingdom | 02/03/1987 | Tester   | test.com | Low   | You added John Doe to the list of entities. |
      | Sudip Patel | United Kingdom | 02/04/1987 | Tester   | test.com | Low   | You added Sudip Patel to the list of entities. |