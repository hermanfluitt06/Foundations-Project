Jay Gerrick Acceptance Criteria
USER Story #1

FEATURE: Jay Garrick is be able to login to access his homepage

    SCENARIO:   As the manager I want to sign in so I can view my custom homepage

        GIVEN   the manager is on the login page
        WHEN    the manager enters his correct username
        WHEN    the manager enters his correct password
        WHEN    the manager clicks the login button
        THEN    the manager should be logged in to the manager home page

USER Story #2

FEATURE: Jay Garrick from the manager page will name and assign defects around Central City
    
    SCENARIO: As the manager i want to name and assign a tester a defect

        GIVEN   the manager is logged into his homepage
        WHEN    the manager inputs a defect name
        WHEN    the manager inputs a tester username
        THEN    the manager clicks the assign button 


_________________________________________________________________________

Wallace West Acceptance Criteria

USER Story #1

FEATURE:    Testers should be able to login to access their homepages

    SCENARIO:   As a tester I want to sign in so I can view my custom homepage

        GIVEN   the tester is on the login page
        WHEN    the tester enters his correct username
        WHEN    the tester enters his correct password
        WHEN    the tester clicks the login button
        THEN    the tester should be logged in to the tester home page

FEATURE:    Testers should be able to update defects from pending to accepted

        GIVEN:  tester is logged into custom tester page
        WHEN    tester selects defect by defect id   
        WHEN    tester updates defect from pending to accepted
        WHEN    tester clicks the submit button 
        THEN    defect submitted to be updated

FEATURE:    Tester should be able to update accepted defects to accepted to fixed 

Scenario: tester updates defect from pending to decline

        GIVEN    tester is logged into custom tester page
        WHEN     tester selects defect 
        WHEN     tester selects to fix defect
        WHEN     tester clicks the submit button
        THEN     tester updates defect as fixed

FEATURE:  tester updates defect from accepted to fixed

        GIVEN    tester is logged into custom tester page
        WHEN     tester selects defect 
        WHEN     tester selects to fix defect
        WHEN     tester clicks the submit button
        THEN     tester updates defect as fixed

FEATURE: tester updates accepted defect from accepted to rejected

        GIVEN    tester is logged into custom tester page
        WHEN     tester selects accepted defect 
        WHEN     tester selects to reject defect
        WHEN     tester clicks the submit button
        THEN     tester updates defect as rejected



FEATURE: tester updates accepted defect from accepted to shelved

        GIVEN    tester is logged into custom tester page
        WHEN     tester selects accepted defect 
        WHEN     tester selects to shelve defect
        WHEN     tester clicks the submit button
        THEN     tester updates defect as shelveded
_________________________________________________________________________


FEATURE:    Testers should be able to update pending defects from pending to declined


        Given   tester is logged into custom tester page
        WHEN    tester selects pending defect by defect id   
        WHEN    tester selects defect to declined
        WHEN    tester clicks the submit button 
        THEN    defect updated as declined



