@About
Feature: I Speak About page

  Scenario: Open About Page
    Given I am on the Home page
    When I click on About button
    Then I see the About page


    Scenario: I Speak better interactive learning system
      Given I am on the about pages
      When I click on the button I Speak better interactive learning System
      Then YouTube video opened

