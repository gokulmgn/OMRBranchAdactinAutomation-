@CancelBooking
Feature: Verifying Adactin Cancel Booking Hotel Page Details

  Scenario Outline: Verifying Adactin Hotel Cancelling Order Id
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should perform the search hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after the select hotel title "Select Hotel" in the select hotel page
    And User should select the Hotel Name and Click Continue button
    Then User should verify after select hotel title "Book A Hotel" in the book hotel page
    And User should Enter all fileds "<First Name>","<Last Name>" and "<Address>" in book hotel page
      | Card No          | Card Type | Expiry Month | Expiry Year | CVV |
      | 1234567890123456 | MAST      | November     |        2022 | 546 |
      | 1234567890123457 | AMEX      | December     |        2022 | 543 |
      | 1234567890123458 | VISA      | October      |        2022 | 523 |
      | 1234567890123459 | MAST      | December     |        2022 | 543 |
    Then User should verify after Click Book Now title "Booking Confirmation" in the Booking Confirmation page
    And User should Click My Itinerary and perform Cancel Order Id in Booked Itinerary page
    Then User should verify after Cancel Order Id Cancel Message"The booking has been cancelled."

    Examples: 
      | userName | password  | Location | Hotels         | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | FirstName | LastName | Address |
      | gokulmgn | Gokul@123 | London   | Hotel Sunshine | Double   | 1 - One       | 20/12/2022  | 21/12/2022   | 2 - Two       | 2 - Two         | GOKUL     | M        | CHENNAI |

  Scenario Outline: Verifying Adactin Hotel Cancel existing order Id
    Given User is on the adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify welcome message after login "Hello gokulmgn!"
    And User should Click Booked Itinerary and perform Cancel Booking "<Order Id>"
    Then User should verify after Cancel Order Id Cancel Message"The booking has been cancelled."

    Examples: 
      | userName | password  | Order Id   |
      | gokulmgn | Gokul@123 | R0X0K11AC5 |
