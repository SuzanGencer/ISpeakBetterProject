Feature: Contact part of ISpeakBetter website
  @title
  Scenario: Checking of the Contact page url
    Given I am on the Home page for Contact Page
    When I click Contact page
    Then Check Contact page title


  @contactUsMessage
  Scenario: Checking of the 'Contact us' message part
    Given I go the Contact page
    When Input your name
    And input your email address
    And Select subject
    And Input your message
    Then I click Contact us button

  @scrollUp
  Scenario: Checking of the scroll up part
    Given I am on the Contact page
    When I go all the way to the scroll up section
    Then I click scroll up

  @chat
  Scenario: Checking of the chat section
    Given I am on the Home page for Chat
    When I click Chat button
    And Find frame for Chat section
    And Input your name in chat
    And Input your email address in chat
    And Type your message in chat
    Then I click start chat

  @language
  Scenario: Selecting of the Language menu
    Given I am on the Home page for Language menu
    When I click Language part
    Then I select any language