Feature: Import Germplasm Fieldbook Excel
  As a breeder, I should be able to import germplasm in xls format in list manager and information management


  Scenario: Able to import a germplasm xls file
    Given BMS is launched in my browser
    And I am in the Import Germplasm page
    And I upload parentalGermplasm.xls excel file
    When I click next button
    Then I should see success notification
    And I should see the Specify Germplasm Details page

