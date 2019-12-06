@loginFeature
Feature: PhpTravels login

  @loginScenario
  Scenario: Navigate and login at PhpTravels portal
    Given that the user opens the browser
		 When the user navigate to PhpTravels website
		  And Insert the administrator's E-mail
		  And Insert the administrator's Password
		  And click at LOGIN button
		 Then the user should access PhpTravels main page
