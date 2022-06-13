#Z-Train
Feature: Application common user operations

	Background:
		Given User is on LoginPage

  	@TEST_15
	Scenario: Ztrain initial frame offer spelling
		When User look this page
		Then User should correct presentation spelling

	@TEST_11
	Scenario: Forbidden password and submit button text
		When User look at the page
		Then User should see forbidden password correct spelling
		And User should see submit button correct spelling

	@TEST_3
	Scenario: Space for password on subscription
		Given User go on subscription page
		When User enter an email
		And User enter space length password
		Then User should see subscription error

