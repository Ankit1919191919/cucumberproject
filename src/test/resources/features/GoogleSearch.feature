Feature: feature to test google search functionality
  Scenario: Validate Google search is working

    Given browser is opened
    And user is on google search page
    When user enters any text to search
    And hits enter
    Then User is navigated to search results

