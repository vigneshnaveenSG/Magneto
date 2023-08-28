Feature: "Hot Seller Section Validation"

  Background: "User is Logged In"
    Given Launch the Magneto application
    Then Verify Home page is displayed

 
  Scenario Outline: "Home screen Menu bar validation"
    Then Verify Home page is displayed
    Then User hover on Men menu
    Then User hover on Tops menu
    Then User hover on jackets menu
    Then User click on jackets menu
    Then Verify jackets page is displayed
    Then User click on style link
    Then User click on hardshell link
    Then User click on size link
    Then User click on Medium link
    Then User click on price link
    Then User click on FourtyDollorAmount link
    Then User click on colour link
    Then User click on Red link
    Then User click on material link
    Then User click on fleece link
    Then User click on BeaumontJacket link
    Then User click on Mediumsize link
    Then User click on RedColour link
    Then User click on AddToCartbtn button
    Then User wait for 10000 seconds
    Then User click on MyCart button
    Then verify "Beaumont Summit Kit" item is displayed in AddToCart Section
    Then User click on ProceedtoCheckout button
    Then User wait for 10000 seconds
    Then Verify shipping page is displayed
    When User entered the <Email> in emailaddress textbox
    Then User wait for 1000 seconds
    When User entered the <Firstname> in firstname textbox
    When User entered the <Lastname> in lastname textbox
    When User entered the <Company> in comapany textbox
    When User entered the <StreetAddr1> in streetaddress1 textbox
    When User entered the <StreetAddr2> in streetaddress2 textbox
    When User entered the <StreetAddr3> in streetaddress3 textbox
    When User entered the <city> in city textbox
    When User selects the <State> in state listbox
    When User entered the <zip> in zipcode textbox
    When User selects the <Country> in country listbox
    When User entered the <PhoneNumber> in phonenumber textbox
    Then User click on flatrate button
    Then User click on next button

    Examples: 
      | Email       | Firstname | Lastname | Company | StreetAddr1 | StreetAddr2 | StreetAddr3 | city | State   | zip   | Country       | PhoneNumber |
      | klm@azx.com | Firstname | Lastname | Company | StreetAddr1 | StreetAddr2 | StreetAddr3 | city | Arizona | 12345 | United States |   535635354 |
