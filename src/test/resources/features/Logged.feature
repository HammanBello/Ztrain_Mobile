#Z-Train_Nocibe
Feature: Found Products

  Background:
    Given User is on LoginPage
    #And User is connected to his account
    And User go on subscription page
    When User enter an email
    And User enter space lenght password
#
#    Scenario: Add item to cart
#      Given User is on homepage
#      When User select item
#      And User add it on cart
#      Then User should see notification correct spelling

    @TEST_28
    Scenario: log-out fonctionnality
      Given User is on homepage
      And User click on account setting
      When User click on back button
      Then User not be able to get back on account setting

