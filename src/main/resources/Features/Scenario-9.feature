Feature: "Hot Seller Section Validation"

  Background: "User is Logged In"
    Given Launch the Magneto application
    Then Verify Home page is displayed

 @jenkins
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
    Then User wait for 100000 seconds
    Then User click on MyCart button
   Then verify "Beaumont Summit Kit" item is displayed in AddToCart Section
   Then User click on ProceedtoCheckout button