Feature: Test search functionality for Google Scholar

  Scenario Outline: Perform a search with a single keyword
    Given I am on the search page
    When I enter "artificial intelligence" in the search bar
    And I click the search button
    Then I should see relevant search results related to artificial intelligence

  Scenario: Perform a search with multiple words
    Given I am on the search page
    When I enter "climate change impacts" in the search bar
    And I click the search button
    Then I should see search results related to the impact of climate change

  Scenario: Perform a search with an author's name
    Given I am on the search page
    When I enter "John Smith" in the search bar
    And I click the search button
    Then I should see publications authored by John Smith listed

  Scenario: Search for articles published within a date range
    Given I am on the search page
    When I enter  "2020-01-01 to 2021-12-31" in the search bar
    And I click the search button
    Then I should see articles published between "2020-01-01" and "2021-12-31" in the search results

  Scenario: Verify search results for articles related to artificial intelligence published in 2020
    Given I am on the search page
    When I enter "artificial intelligence 2020" in the search bar
    And I click the search button
    Then I should see search results with articles related to artificial intelligence published in 2020

  Scenario: Verify spell correction on Google Scholar
    Given I am on the search page
    When I enter "biolagy" in the search bar
    And I click the search button
    Then I should see search results with articles related to the corrected spelling "biology"

  Scenario: Check filtering by specific content types (e.g case law)
    Given I am on the search page
    When I click on the Case law radio button
    When I enter "Digital privacy" in the search bar
    And I click the search button
    Then I should see search results with only "Case law " documents 
    


