@SearchHotel
Feature: Verifying Adactin Serach Hotel Page Details


  Scenario Outline: Verifying Adactin Search Hotel By Select All The Field
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verifying Adactin Search Hotel By Enter Mandatory filed
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should Enter mandatory filed perform the search hotel  "<Location>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>" and "<AdultsPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page

    Examples: 
      | userName | password  | Location | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom |
      | gokulmgn | Gokul@123 | London   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       |

  Scenario Outline: Verifying Adactin Search Hotel By Enter Invaild CheckInDate and CheckOutDate
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date" in the search hotel page

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 22/12/2030  | 21/12/2022   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verifying Adactin Search Hotel By Without Enter Any Fields
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform search hotel without enter any fileds
    Then User should verify the location error message "Please Select a Location" in the search hotel page

    Examples: 
      | userName | password  |
      | gokulmgn | Gokul@123 |
