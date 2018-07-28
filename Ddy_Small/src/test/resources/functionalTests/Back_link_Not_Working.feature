Feature: Back link not working feature
Description: The purpose of this feature is to test the back link on New Address page

  Scenario Outline: User test the back link on New Address page
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
     And user click on the back link
     Then user should be on New profile page
  
    Examples: 
      | Email                  | Password  | Name      | Surname | Year | Month | Date | Street  | HouseNumber | PostCode | 
      | testemail157@gmail.com | password1 | Customer1 | Sname1  | 2018 | 12    | 13   | Street1 | ABC         | 2345 NJ  | 
  
  
