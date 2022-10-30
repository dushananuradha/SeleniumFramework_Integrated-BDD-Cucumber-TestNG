Feature: Testing login functionality

  Scenario Outline: Verify whether the user can successfully login to SwagLabs with valid credentials

    Given User is on Google Home page
    And User is navigated to SwagLabs Login page
    When User enters valid <username> and <password>
    And clicks on LOGIN button
    Then User is navigated to SwagLAbs Home page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |