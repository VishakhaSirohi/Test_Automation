Feature: Blank Password field Feature
Description: The purpose of this feature is to test if you keep Password field blank.

  Scenario Outline: User keep Password field blank	
    Given user is on SignIn Page
     When he clicks on Register link 
      And enter email <Email> on Register page
      And enter Password <Password> on Register page
      And clicks on CreateAccount Button 
     Then user should get the failure <Failure> message
  
    Examples: 
      | Email                | Password | Failure                 | 
      | testemail6@gmail.com |          | Password can't be blank | 

  
  
 