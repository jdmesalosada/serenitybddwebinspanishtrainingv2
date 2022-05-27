#Posibles escenarios que se puedan dar en un login
Feature: Login into the application
  Scenario: Successful login
    Given Cristian has an active account
    When he sends their valid credentials
    Then he should have access to manage his account