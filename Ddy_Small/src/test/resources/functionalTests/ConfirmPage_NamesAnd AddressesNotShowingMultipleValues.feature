Feature: Multiple Names feature
Description: The purpose of this feature is to to check for the multiple name entries on confirm page.

  Scenario Outline: User check for the multiple name entries
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
      And User goes back to Create Profile page
      And enter Name <Name1> on Profile page
      And enter Surname <Surname1> on Profile page
      And clicks on CreateProfile Button 
      And enter Street <Street1> on Address page
      And enter House Number <HouseNumber1> on Address page
      And clicks on CreateAddress Button
      Then user checks Names <OutputName> field
      And user checks Addresses <OutputAddress> field
  
    Examples: 
      | Email                  | Password  | Name      | Surname | Name1     | Surname1 | Year | Month | Date | Street  | HouseNumber | PostCode | Street1 | HouseNumber1 | OutputName       | OutputAddress | 
      | testemail190@gmail.com | password1 | Customer1 | Sname1  | Customer2 | Sname2   | 2018 | 12    | 13   | Street1 | 2344        | 2345 NJ  | Street2 | 234          |  Customer2 Sname2 |    Street2 234           | 
  
  
