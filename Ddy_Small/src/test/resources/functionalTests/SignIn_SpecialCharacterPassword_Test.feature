Feature: Special Character Password Feature
Description: The purpose of this feature is to test if Password field accepts special character.

  Scenario Outline: User does not enter special character in the Password field
    Given user is on SignIn Page
     When he clicks on Register link 
      And enter email <Email> on Register page
      And enter Password <Password> on Register page
      And clicks on CreateAccount Button 
       Then user should get the failure <Failure> message
  
    Examples: 
      | Email      | Password  | Failure          | 
      | testemail7@gmail.com | abc       | Password should be 8 characters long and contain both upper,lower and special characters | 
  
  
