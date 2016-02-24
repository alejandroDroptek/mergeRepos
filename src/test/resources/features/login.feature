@include
Feature: Login
  In order to carry out various breeding activities
  As a breeder
  I want to login to the BMS to access the breeding programs I am involved with

  Scenario: Program dashboard is shown on successful sign in
    Given BMS is launched in my browser
    When I log in as a breeder 'Mildo' password 'a'
    Then I should see the program dashboard page

