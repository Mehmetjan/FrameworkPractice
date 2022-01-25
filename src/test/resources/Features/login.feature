Feature: login functionality

  Scenario Outline: 
    Given user is on login page
    When enter "<username>"
    And enter password as "<password>"
    And click on login button
    Then user is on shopping page

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
