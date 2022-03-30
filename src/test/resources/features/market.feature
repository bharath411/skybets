@task2
Feature: Both Teams To Score Market

  Background:
    When I get all football events information

  Scenario: Verifying that event has market ids 
    And fetch marketids for all events
    Then Verify each event has market 'Both Teams To Score'
    Then Verify that market has visibility true
    


  Scenario: Verifying home and away games
   	And fetch marketids for all events
    Then Verify each event has market 'Both Teams To Score'
    Then Verify that market has outcomes 'Yes' and 'No'
