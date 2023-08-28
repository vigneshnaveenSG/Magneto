Feature: "Home Screen Validations"

  Background: "User is Logged In"
    Given Launch the Magneto application
    Then Verify Home page is displayed

  Scenario Outline: "Account Creation Scenario"
    Given Launch the Magneto application
    Then Verify Home page is displayed
    Then User click on SignIn link
    Then Verify customerlogin page is displayed
    Then User click on CreateAccount button
    Then Verify createcustomeraccount page is displayed
    When User entered the <firstname> in firstname textbox
    When User entered the <LastName> in lastname textbox
    When User entered the <Email> in email textbox
    When User entered the <Password> in password textbox
    When User entered the <ConfirmPassword> in passwordconfirmation textbox
    Then User click on createaccount button

    Examples: 
      | firstname | LastName | Email         | Password | ConfirmPassword |
      | vignesh   | naveen   | xyz12@abc.com | Adfh123& | Adfh123&        |

 
  Scenario Outline: "Home screen Menu bar validation"
    # Given Launch the Magneto application
    # Then Verify Home page is displayed
    Then verify Luma logo is displayed
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
    Then Verify whatsnew link is displayed
    Then User clicked on whatsnew link
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
    Then Verify Women link is displayed
    Then User clicked on Women link
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
    Then Verify Men link is displayed
    Then User clicked on Men link
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
    Then Verify Gear link is displayed
    Then User clicked on Gear link
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
    Then verify Training link is displayed
    Then User clicked on Training link
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
    Then Verify Sale link is displayed
    Then User clicked on Sale link
    Then User clicked on Luma Logo
    Then Verify Home page is displayed
