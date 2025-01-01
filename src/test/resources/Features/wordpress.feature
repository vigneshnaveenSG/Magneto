Feature: "Word Press Login Validation"

	@jenkins
  Scenario Outline: "User is Logged In"
    Given Launch the Magneto application
    Then Verify Login page is displayed
    Then User wait for 10000 seconds
    When User entered the sgvignesh2007@gmail.com in username textbox
    Then User wait for 10000 seconds
    When User entered the Deepika123$ in password textbox
    Then User wait for 10000 seconds
    Then User click on login button
    Then User wait for 10000 seconds