@addFeature
Feature: Add a Guest

  @addScenario
  Scenario: Add a Guest at at Guest Management
    Given that the user is at the Add Guest page
		 When user type a name at first name field
		  And type a last name at last name field
		  And type an Email name at last name field
		  And type a password name at last name field
		  And type a Mobile Number name at last name field
		  And select a Country at last name field
		  And type an Address name at Address 1 field
		  And type another Address name at Address 2 field
		  And click at submit button
		 Then the user should be redirected to previous page
			And the registered guest should exist