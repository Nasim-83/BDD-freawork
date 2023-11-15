Feature: deal data creation1

Scenario: free crm create new deal scenario1

Given User is already on Login Page
    When title of login page is free CRM
    Then user enters username and password
    |username|password|
    |Nasim17|Nasim@17|
    Then user clicks on login button
    And verify user is on Home page
    Then user move to deal page
    Then user click on New deal
    Then user enters deal deatils
    |title|company|contact|amount|
    |title1|google|145879|1260|
    |title2|yahoo|145877|1208|
    |title3|faebook|1458797|1207|
    |title4|amazon|1458797|111|
    #Then save details
    Then close crowser

