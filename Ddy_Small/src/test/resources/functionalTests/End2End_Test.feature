Feature: Happy flow
Description: The purpose of this feature is to test one End 2 End Flow.

  Scenario Outline: User registers his details in the system	
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
      Then user checks Names <OutputName> field
      And user checks Addresses <OutputAddress> field
      And clicks on Confirm Button
      And user should get the Success message
      And user clicks on signout
      And checks user get back on signin page
      
    Examples: 
      | Email                | Password  | Name      | Surname | Year | Month | Date | Street  | HouseNumber | PostCode | OutputName       | OutputAddress | 
      | testemail1@gmail.com | password1 | Customer1 | Sname1  | 2018 | 12    | 13   | Street1 | 23          | 2345 NJ  | Customer1 Sname1 |        Street1 23       | 
  
