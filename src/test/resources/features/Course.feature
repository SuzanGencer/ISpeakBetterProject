@Course
Feature: I Speak Better Course page

  Scenario: Open Course Page
    Given I am on the Home Page
    When I click on Course button
    Then I see the Course page

  Scenario: Enroll Business English
    Given I am on the Course Page
    When I click on the button Enroll Business English
    Then I see the Business English page

  Scenario: Get a free class of Children English
    Given I am on the Course Page
    When I click on the button Enroll Children English
    And I click on the button Get a Free Class
    Then I see sign up page

