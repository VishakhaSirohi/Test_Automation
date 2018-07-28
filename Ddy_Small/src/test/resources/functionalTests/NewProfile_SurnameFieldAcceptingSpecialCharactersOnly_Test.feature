Feature: Surname field accepting only Special Characters feature
Description: The purpose of this feature is to add only special characters and check for the error message.

  Scenario Outline: User adds special character in the Surname field
    Given user is on SignIn Page
     When he clicks on Register link 
      And enter email <Email> on Register page
      And enter Password <Password> on Register page
      And clicks on CreateAccount Button 
      And enter Name <Name> on Profile page
      And enter Surname <Surname> on Profile page
      And select Year <Year> on Profile page
      And select Month <Month> on Profile page
      And select Date <Date> on Profile page
      And clicks on CreateProfile Button 
     Then user should get the failure <Failure> message on New Profile Page
  
    Examples: 
      | Email                 | Password  | Name | Surname | Year | Month | Date | Failure          | 
      | testemail35@gmail.com | password4 |  Name1    | $##$%  | 2013 | 12    | 13   | Surname should contain alphabets | 
  
  