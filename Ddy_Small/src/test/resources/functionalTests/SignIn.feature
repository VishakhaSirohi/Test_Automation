Feature: Sign In 
Description: The purpose of this feature is to test sign in functionality.

  Scenario Outline: User Sign in to the system	
    Given user is on SignIn Page 
     When enter email <Email> on SignIn page
      And enter Password <Password> on SignIn page
      And clicks on SignIn Button 
     Then user checks the details <OutputEmail>
  
    Examples: 
      | Email                | Password  | OutputEmail          | 
      | testemail1@gmail.com | password1 | Email: testemail1@gmail.com | 