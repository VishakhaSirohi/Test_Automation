Feature: Name field accepting only Numbers feature
Description: The purpose of this feature is to add only numbers in the Name field and check for the error message.

  Scenario Outline: User adds numbers in the name field
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
      | testemail23@gmail.com | password4 |  1234    | Sname1  | 2013 | 12    | 13   | Name should not accept numbers | 
  
  