#Z-Train_Nocibe
Feature: Found Products

	Background:
		Given User is on LoginPage

	@TEST_3
	Scenario: User enter space for password on subscription
		Given User go on subscription page
		When User enter an email
		And User enter space lenght password
		Then User should see subscription error