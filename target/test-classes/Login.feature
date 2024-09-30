Feature: Luma.com login testing
Description: User needs to be Singed Up.
#Background: Common step (optional)
Scenario: As an user, I want to login to Luma.com with valid credentials, so that I can use the website.
Given Open the browser
And Pass the LumaURL 
|https://magento.softwaretestingboard.com/|
When Click on the Login button in the homepage
And Enter the email in  the email field 
|ahnaf.x.tahmid@gmail.com|
And the Password in the password field 
|iLearnSDET24#|
And Click on Login button in the Login page
Then Validate the login is successful
