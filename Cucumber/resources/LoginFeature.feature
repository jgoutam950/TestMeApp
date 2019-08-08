Feature: Login Fuctionality

@LoginNew
Scenario Outline: Login with valid Credentials

Given Navigate to home page
When user enters "<username>" and "<password>"
Then user logged in successfully Via New Method.
Examples:
|username| |password|
|Admin| |password456|
|lalitha| |password123|


@Login
Scenario: Login with valid Credentials

Given Navigate to home page
When user enters username and password
Then user logged in successfully


@data-driven
Scenario: The one where user picks different product through search functionality 

When lalitha searches for below products
|Head|
|Travel|
|Laptop|
Then product should be added in the cart if possible