@navFeature
Feature: PhpTravels Navigation

  @navScenario
  Scenario: Navigate at PhpTravels main page
    Given that the user is at the main page
		 When the user click in ACCOUNTS tab at the sidebar
		  And Click at GUESTCUSTOMERS sub-tab
		 Then the user should be redirected to GUEST MANAGEMENT page
