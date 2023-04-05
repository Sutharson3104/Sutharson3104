Feature: Validating Facebook Page

#Background:
#Given User is on login page

@E2E
Scenario Outline: Login Page Validation with invalid credentials

Given User is on login page
When User enters "<username>" and "<password>"
And User clicks login page
Then User verify the error message

Examples:
|username|password|
|hello|3104|

@sanity
Scenario: Page Title validation

Given User is on login page
When User prints Page title




