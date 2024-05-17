@Smok @Regression @Functional
Feature:Login Function Test
Description:
Background


@Postive @TC_05
Scenario: Login function test with valid credential

Given Open a Browser
And Go to application Url
When Put a valid User
And Put a valid Password
And Click Login Btn
And Click dropDown Btn
Then Test will pass if logOut Btn found
