Feature:   Testers of my bug catcher application should be able to update assigned defects   

    Scenario:   Testers should be able to accept defects
        Given   tester is logged into custom tester page
        When    tester selects pending defect by id   
        When    tester selects defect to accept
        When    tester selects the defect description
        When    tester clicks the submit button 
        Then    defect should be updated as accepted

    Scenario:   Testers should be able to accept or Reject
        Given   tester is logged into custom tester page
        When    tester selects pending defect by id
        When    tester selects defect to rejected
        When    tester selects the defect description
        When    tester clicks the submit button
        Then    defect should be updated as rejected


    Scenario:  Testers should be able update the defect status

        Given   tester is logged into custom tester page
        When    tester selects defect by id
        When    tester selects fix shelved or rejected
        When    tester selects a  defect description
        When    tester clicks on the submit button
        Then    defect status should be updated
