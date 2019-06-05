@SmokeTest
Feature: OrangeHRM Test Scenario
	I will test more multiple components on this feature file
 
 @login-Function
  Scenario Outline: Try login with Outline inputs
    Given I open browser
    And I navigate to OrangeHRM live page
    And I enter username "<username>"
    And I enter password "<password>"
    And I click login button
    Then I validate and see the <status> Dashboard page

    Examples: 
      | username  | password | status  |
      | Abc121212 | Abc121212| success |
      | Abc212122 | Abc212122| Fail    |
      | Admin     | admin123 |success  |

      
      
      
      
      
      
      
      
      
      
      
      