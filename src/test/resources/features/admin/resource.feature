Feature: @Resources
Background:
  Given I create a Resource with: "Computer" Name

  Scenario: Delete a Resource that is assigned to different Conference Room
  #    Given I associate the Resource "Lab Computer" to: "Floor1Room16"
    When I delete the Resource "Computer"
    Then the Resource "Computer" should not be displayed in the Resources list
    When I navigate to Conference Rooms page
  #    Then the Resource "Computer" should not be displayed in the "Associated" list of Conference Room "Floor1Room1"
    When I navigate to Tablet page
    And I select the "Floor1Room16" Conference Room
    Then the Resource "Computer" should not be displayed in the Resource Tablet list
    And the Resource "Computer" should not be obtained using the API


  Scenario: Search Resources that match the search criteria
    Given I create a Resource with: "Computer PC,Personal PC,PC" Name
    When I search Resources with search criteria "PC"
    Then the Resources that match the search criteria "PC" should be displayed in Resource List
#
  Scenario: Cannot create two Resources with the same Name
    When I try to create the Resource Name "Computer", "PC" in the Resource page
    Then an error text "A resource with the same name already exists, please choose another name" is showed in the Resource form
    When I navigate to Resources page
    And only one Resource with the same name should be displayed in Resource list
    When I navigate to Tablet page
    Then only one Resource with the same name should be displayed in Tablet list
