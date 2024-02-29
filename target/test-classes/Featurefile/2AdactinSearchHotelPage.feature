
Feature: To validate hotels Searchpage functionality

#Scenario: To validate the search page using pass the valid field 
#Given user enter the adactin search page
#And user launch Adactin application
#And user enter username and password
#And user click login button
#And user see the next page Welcome to Adactin Group of Hotels
#When user enter the location,enter the hotel,enter the roomtype,enter the numberofrooms
#And user enter the check in date and check out date
#And user enter the adults per room and enter the childrens per room
#And user click search button
#Then user see the message next page of the select page


Scenario Outline: To validate the search page using different set of values of the field 
Given user enter the adactin search page
And user launch Adactin application
And user enter username "<username>" and password "<password>"
And user click login button
And user see the next page Welcome to Adactin Group of Hotels
When user enter the location "<location>",hotel "<hotel>",roomtype "<roomtype>",numberofrooms "<numberofrooms>"
And user enter the check in date "<checkindate>",check out date "<checkoutdate>"
And user enter the adults per room "<adultsperroom>",childrens per room "<childrensperroom>"
And user click search button
Then user see the result based on searchpage credential"<credential>" 

Examples:

|username|password|location|hotel|roomtype|numberofrooms|checkindate|checkoutdate|adultsperroom|childrensperroom|credenttial|
|vaithy2410|vaithy@2410|Sydney|Hotel Hervey |Double|8 - Eight|16/09/2023|18/09/2023|2 - Two|5|negative|
|vaithy2410|vaithy@2410|India|Hotel Hervey |Double|8 - Eight|16/09/2023|18/09/2023|2 - Two|1 - One|negative|








