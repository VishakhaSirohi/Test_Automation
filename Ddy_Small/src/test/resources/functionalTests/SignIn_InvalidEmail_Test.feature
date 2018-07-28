Feature: Email invalid feature
Description: The purpose of this feature is to test if you enter invalid email id.

  Scenario Outline: User enters Invalid email on Register page 	
    Given user is on SignIn Page
     When he clicks on Register link 
      And enter email <Email> on Register page
      And enter Password <Password> on Register page
      And clicks on CreateAccount Button 
     Then user should get the failure <Failure> message
  
    Examples: 
      | Email      | Password  | Failure          | 
      | testemail1 | password1 | Email is invalid | 
  
  
