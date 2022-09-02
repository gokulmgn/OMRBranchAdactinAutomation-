@SelectHotel
Feature: Verifying Adactin Select Hotel Page Details

  Scenario Outline: Verifying Adactin Hotel By Select Hotel Name and Verify Book A Hotel
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page
    And User should select the Hotel Name and Click Continue button
    Then User should verify after select hotel title "Book A Hotel" in the book hotel page

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verifying Adactin Hotel By Without Select Hotel Click Continue
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page
    And User should Click Continue button without selecting hotel
    Then User should verify after click continue button the error message "Please Select a Hotel" in the select hotel page

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       | 2 - Two         |
