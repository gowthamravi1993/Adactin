Feature: To validate Adactin login functionality

#Scenario: To validate login using valid username and valid password
#Given user launch Adactin application
#When user enter username and password
#And user click login button
#Then user see the next page Welcome to Adactin Group of Hotels

Scenario Outline: To validate login using differt set of creditials
Given user launch Adactin application
When user enter username "<username>" and password "<password>"
And user click login button
Then user see the result based on credential type "<credentialtype>"

Examples: 
|username|password|credentialtype|
|vaithy2410|vaithy@2410|positive|
|vaithy2410|vaithy@2411|negative|
|vathy4210|vaithy@2410|negative|
|vaithy4210|vaithy4210|negative|


 






