Feature: "Hot Seller Section Validation"

  @jenkins
  Scenario Outline: "User is Logged In"
    Given Launch the Magneto application
    Then Verify Home page is displayed

  @jenkins
  Scenario Outline: "Breathe-Easy Tank price validation "
    Given Launch the Magneto application
    Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Breathe-Easy Tank" item is displayed in Hotseller Section
    Then verify the "Breathe-Easy Tank" item has review section
      | rating-summary |
    Then verify the "Breathe-Easy Tank" item has lowestprice section
      | 34.00 |

  @jenkins
  Scenario Outline: "Radiant Tee price validation"
    Given Launch the Magneto application
    Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Radiant Tee" item is displayed in Hotseller Section
    Then verify the "Radiant Tee" item has review section
      | rating-summary |
    Then verify the "Radiant Tee" item has lowestprice section
      | 22.00 |

  @jenkins
  Scenario Outline: "Argus All-Weather Tank price validation"
    Given Launch the Magneto application
    Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Argus All-Weather Tank" item is displayed in Hotseller Section
    Then verify the "Argus All-Weather Tank" item has review section
      | rating-summary |
    Then verify the "Argus All-Weather Tank" item has lowestprice section
      | 22.00 |

  @jenkins
  Scenario Outline: "Hero Hoodie price validation"
    Given Launch the Magneto application
    Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Hero Hoodie" item is displayed in Hotseller Section
    Then verify the "Hero Hoodie" item has review section
      | rating-summary |
    Then verify the "Hero Hoodie" item has lowestprice section
      | 54.00 |
