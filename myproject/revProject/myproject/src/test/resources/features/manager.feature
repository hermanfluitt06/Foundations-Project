Feature: Managers of my bug catcher application should be able to create and assign defects

    Scenario: as the manager i want to name and assign a defect to a tester

    Given   the manager is logged into his homepage
    When    the manager inputs a defect name
    When    the manager inputs a tester username
    When    the manager clicks the assign button
    Then    the manager has created and assigned a defect