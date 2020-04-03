Feature: Google Homepage Search

  @Search
  Scenario: User can search with "Google Search"
    Given I’m on the homepage "https://www.google.com/"
    When I type "The name of the wind" into the search field
    And I click the Google Search button
    Then I go to the search results page
    And the first result is "The Name of the Wind - Wikipedia"
    When I click on the first result link
    Then I go to the "Patrick Rothfuss - The Books" page

  @Search
  Scenario: User can search by using the suggestions
    Given I’m on the homepage "https://www.google.com/"
    When I type "The name of the w" into the search field
    And the suggestions list is displayed
    And I click on the first suggestion in the list
    Then I go to the search results page
    And the first result is "The Name of the Wind - Wikipedia"
    When I click on the first result link
    Then I go to the "Patrick Rothfuss - The Books" page