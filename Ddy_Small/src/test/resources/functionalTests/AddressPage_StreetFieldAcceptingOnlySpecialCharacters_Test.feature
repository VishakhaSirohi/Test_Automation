Feature: Street Field accepting special characters only feature
Description: The purpose of this feature is to enter only special caharcters and check for the Error message.

  Scenario Outline: User enters special characters in the street field	
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
      And enter Street <Street> on Address page
      And enter House Number <HouseNumber> on Address page
      And enter Post Code<PostCode> on Address page
      And clicks on CreateAddress Button
     Then user should get the failure <Failure> message on New Address Page
  
     Examples: 
      | Email                | Password  | Name      | Surname | Year | Month | Date | Street  | HouseNumber | PostCode |  Failure          | 
      | testemail78@gmail.com | password1 | Customer1 | Sname1  | 2018 | 12    | 13   | #$%%^ | ABC          | 2345 NJ  | Street Field is invalid |  
  
