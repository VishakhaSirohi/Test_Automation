Feature: Email Field Blank feature
Description: The purpose of this feature is to test if you keep Email Field Blank.

  Scenario Outline: User keep Email Field Blank 	
    Given user is on SignIn Page
     When he clicks on Register link 
      And enter email <Email> on Register page
      And enter Password <Password> on Register page
      And clicks on CreateAccount Button 
     Then user should get the failure <Failure> message
  
    Examples: 
      | Email | Password  | Failure          | 
      |       | password1 | Email is invalid | 

  
  
