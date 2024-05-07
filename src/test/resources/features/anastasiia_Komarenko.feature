Feature: Check EPAM website

  Background:
    Given User is on the EPAM homepage

  Scenario: Verify homepage title
    When User opens the homepage
    Then Homepage title should be "EPAM | Software Engineering & Product Development Services"

  Scenario: Verify presence of Services section
    When User scrolls down the homepage
    Then User should see the Services section

  Scenario: Verify successful search functionality
    When User enters "Digital Transformation" in the search bar
    And User clicks on the search button
    Then User should see search results related to "Digital Transformation"

  Scenario: Verify Careers page navigation
    When User clicks on the "Careers" link in the header
    Then User should be redirected to the Careers page

  Scenario: Verify Contact Us page navigation
    When User clicks on the "Contact Us" link in the footer
    Then User should be redirected to the Contact Us page

  Scenario Outline: Verify country-specific content
    When User selects "<country>" from the country dropdown
    Then User should see content relevant to "<country>"

    Examples:
      | country  |
      | Austria  |
      | USA      |
      | Germany  |
      | Brazil    |

  Rule: Verify responsiveness of the website

    Scenario: Verify website is responsive on desktop
      When User resizes the browser window to desktop size
      Then Website layout should adapt properly

    Scenario: Verify website is responsive on mobile
      When User resizes the browser window to mobile size
      Then Website layout should adapt properly

    Scenario: Verify EPAM blog section
      When User navigates to the EPAM homepage
      And  User scrolls down to the blog section
      Then User should see the latest blog posts listed
      And  User should be able to click on a blog post to read more details
