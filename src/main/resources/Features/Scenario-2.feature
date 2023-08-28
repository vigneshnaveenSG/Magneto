Feature: "Hot Seller Section Validation"

  Background: "User is Logged In"
    Given Launch the Magneto application
    Then Verify Home page is displayed

  Scenario Outline: "Home screen Menu bar validation"
    # Given Launch the Magneto application
    # Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Breathe-Easy Tank" item is displayed in Hotseller Section
    Then verify the "Breathe-Easy Tank" item available in below sizes
      | XS |
      | S  |
      | M  |
      | L  |
      | XL |
    Then verify the "Breathe-Easy Tank" item available in below colours
      | Purple |
      | White  |
      | Yellow |

  Scenario Outline: "Home screen Menu bar validation"
    # Given Launch the Magneto application
    # Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Radiant Tee" item is displayed in Hotseller Section
    Then verify the "Radiant Tee" item available in below sizes
      | XS |
      | S  |
      | M  |
      | L  |
      | XL |
    Then verify the "Radiant Tee" item available in below colours
      | Blue   |
      | Orange |
      | Purple |

  Scenario Outline: "Home screen Menu bar validation"
    # Given Launch the Magneto application
    # Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Argus All-Weather Tank" item is displayed in Hotseller Section
    Then verify the "Argus All-Weather Tank" item available in below sizes
      | XS |
      | S  |
      | M  |
      | L  |
      | XL |
    Then verify the "Argus All-Weather Tank" item available in below colours
      | Gray |

  Scenario Outline: "Home screen Menu bar validation"
    # Given Launch the Magneto application
    # Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then Verify Hotsellers section is displayed
    Then verify "Hero Hoodie" item is displayed in Hotseller Section
    Then verify the "Hero Hoodie" item available in below sizes
      | XS |
      | S  |
      | M  |
      | L  |
      | XL |
    Then verify the "Hero Hoodie" item available in below colours
      | Black |
      | Gray  |
      | Green |
