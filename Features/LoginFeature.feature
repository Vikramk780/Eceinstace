Feature: Login

Scenario: Successfull Login with Valid Credentials
Given user Launch hrome browser
When user Opens URL "https://stageapp.botprise.com"
And User enters email as "admin@botprise.com" and password as "BotpriseTeam2021$$"
And click on login
Then page title should be "Botprise Staging"
When user clicks on logout link
And Close browser


Scenario Outline:Successfull Login with Valid Credentials
Given user Launch hrome browser
When user Opens URL "https://stageapp.botprise.com"
And User enters email as "<email>" and password as "<password>"
And click on login
Then page title should be "Botprise Staging"
When user clicks on logout link
And Close browser


Examples:
|email||password|
|admin@botprise.com||BotpriseTeam2021$$|
#|adminq@botprise.com||BotpriseTeam2021$$|