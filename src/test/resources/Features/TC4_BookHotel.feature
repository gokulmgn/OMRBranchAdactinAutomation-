@BookHotel
Feature: Verifying Adactin Book Hotel Page Details

 @tc
  Scenario Outline: Verifying Adactin Book Hotel By Select All Fileds
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page
    And User should select the Hotel Name and Click Continue button
    Then User should verify after select hotel title "Book A Hotel" in the book hotel page
    And User should Enter all fileds "<FirstName>","<LastName>" and "<Address>" in book hotel page
      | cardNo           | cardType         | expMonth | expYear | cvv |
      | 1234567890123456 | American Express | November |    2022 | 546 |
      | 1234567890123457 | VISA             | December |    2022 | 543 |
      | 1234567890123458 | MAST             | October  |    2022 | 523 |
      | 1234567890123459 | Master Card      | December |    2022 | 543 |
    Then User should verify after Click Book Now title "Booking Confirmation" in the Booking Confirmation page

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | FirstName | LastName | Address |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       | 2 - Two         | GOKUL     | M        | CHENNAI |

  Scenario Outline: Verifying Adactin Book Hotel By Without Enter Any Fileds
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page
    And User should select the Hotel Name and Click Continue button
    Then User should verify after select hotel title "Book A Hotel" in the book hotel page
    And User should perform without Enter any fileds in book hotel page
    Then User should verify after click Book Now the error message "Please Enter your First Name","Please Enter you Last Name"," Please Enter your Address","Please Enter your 16 Digit Credit Card Number"," Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and " Please Enter your Credit Card CVV Number"

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       | 2 - Two         |
