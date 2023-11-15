Feature: deal data creation

Scenario: free crm create new deal scenario

Given User is already on Login Page
    When title of login page is free CRM
    Then user enters username and password
    |Nasim17|Nasim@17|
    Then user clicks on login button
    And verify user is on Home page
    Then user move to deal page
    Then user click on New deal
    Then user enters deal deatils
    |title1|google|145879|120|
    Then save details
    Then close crowser

