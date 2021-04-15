Feature: ISpeakBetter student page
  @dictionary
   Scenario: Dictionary click
    Given I am on the student page
    When click dictionary button
    Then see the dictionary pop-up

  @help
  Scenario: Help button click
    Given I am on the student page
    When click launchPad button
    And click help button
    Then see the help page

  @vocabulary
  Scenario: Vocabulary button click
    Given I am on the student page
    When click launchPad button
    And click vocabulary button
    Then see the vocabulary page

  @purchase
  Scenario: Purchase Package button click
    Given I am on the student page
    When click purchase package button
    Then see the purchase package pop-up

  @close
  Scenario: close click
    Given I am on the student page
    When click purchase package button
    And click close button
    Then see the student page

  @signout
  Scenario: signout button click
    Given I am on the student page
    When click signout button
    Then see the home page