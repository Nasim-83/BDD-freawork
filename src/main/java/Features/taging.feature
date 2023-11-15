@FuctionalTest
Feature: CRM tagging

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login page 
@RegressionTest
Scenario:  Login with in correct username and password
Given This is a invalid login page 
@SmokeTest
Scenario: create a contact 
Given This is a contact page
@EndToEndTest
Scenario: create deal
Given  this is deal page
@SmokeTest
Scenario: create Task
Given  this is Task page
@EndToEndTest
Scenario: create case
Given  this is case page
@EndToEndTest
Scenario: create leftpanel page
Given  this is left panel pageoumj 
