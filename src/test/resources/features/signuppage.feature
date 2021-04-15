Feature: ISpeakBetter SignUpPage


  @FacebookText
  Scenario: verifyFacebookTextInSignUpPage
    Given I am on the sign up page
    When I click on facebook text
    Then I get the URL

  @GoogleText
  Scenario: verifyGoogleTextInSignUpPage
    Given I am on the sign up page2
    When I click on google text
    Then I get the URL2

  @CancelButton
  Scenario: verifyCancelButton
    Given I am on the sign up page3
    And I click on cancel button
    Then I see the cancel button