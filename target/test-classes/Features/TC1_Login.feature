@Login
Feature: Verifying Adactin Login Hotel Details

  Scenario Outline: Verifying Adactin Login With Valid Credentials
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"

    Examples: 
      | userName | password  |
      | gokulmgn | Gokul@123 |

  Scenario Outline: Verifying Adactin Login With Valid Credentials With Enter Key
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>" with Enter key
    Then User should verify welcome message after login "Hello gokulmgn!"

    Examples: 
      | userName | password  |
      | gokulmgn | Gokul@123 |

  Scenario Outline: Verifying Adactin Login With InValid Credentials
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName | password  |
      | gdsdsdsd | sdsdl@123 |
