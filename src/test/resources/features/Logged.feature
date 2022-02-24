#Z-Train_Nocibe
Feature: Application personal user operations

  Background:
    Given User is on LoginPage
    And User is connected to his account
#    And User go on subscription page
#    When User enter an email
#    And User enter space lenght password
#
    Scenario: Add item to cart
      #Given User is on homepage
      When User select item
      And User add it on cart
      Then User should see notification correct spelling

#    @TEST_28
#    Scenario: log-out functionality
#      Given User is on homepage
#      And User click on account setting
#      When User click on log-out button
#      And User click on back button
#      Then User not be able to get back on account setting

#  @TEST_14
#  Scenario: modify account info functionality
#    Given User is on homepage
#    And User click on account setting
#    When User click on "my account"
#    Then User should see correct account spelling

#  @TEST_4
#  Scenario: spaces for account informations
#    #Given User is on homepage
#    And User click on account setting
#    When User click on "my account"
#    And User fill fields with space
#    Then User should see modifications validated

#  @TEST_29
#  Scenario: favoris contain functionality
#    Given User is on homepage
#    When User click on favoris view
#    Then User should see favoris contain

