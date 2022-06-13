#Z-Train
Feature: Application personal user operations

  Background:
    Given User is on LoginPage
    And User is connected to his account

  @TEST_17
  Scenario: mix of langages
    When User click on account setting
    Then User should same language for options

  @TEST_10
  Scenario: frames superpositioned
    Given User click on account setting
    When User click again on account setting
    And User click on favoris view
    And User click on phone back button <3> time
    Then User should see favoris contain

  @TEST_29
  Scenario: favoris contain functionality
    When User click on favoris view
    Then User should see favoris contain

  @TEST_28
  Scenario: log-out functionality
      And User click on account setting
      When User click on log-out button
      And User click on back button
     Then User not be able to get back on account setting

  @TEST_30
  Scenario: sign-in after log-out
    And User click on account setting
    When User click on log-out button
    And User try to connect to his account
    Then User access to his account

  @TEST_14
  Scenario: modify account info functionality
    And User click on account setting
    When User click on "my account"
    Then User should see correct account spelling

  @TEST_4
  Scenario: spaces for account informations
    And User click on account setting
    When User click on "my account"
    And User fill fields with space
    Then User should see modifications not validated

