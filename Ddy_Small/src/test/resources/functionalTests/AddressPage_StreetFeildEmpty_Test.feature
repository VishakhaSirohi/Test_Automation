Feature: Street Field Empty feature
Description: The purpose of this feature is keep the street Field Empty and check for the Error message.

  Scenario Outline: User keep the street Field Empty	
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
      | testemail89@gmail.com | password1 | Customer1 | Sname1  | 2018 | 12    | 13   |  | 345          | 2345 NJ  | Street is a required field |  
  
