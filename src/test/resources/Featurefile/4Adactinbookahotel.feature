Feature: To validate book a hotel page functionality
#Scenario: To validate the book a hotel  
#Given  user launch Adactin application
#And user enter username and password
#And user click login button
#And user see the next page Welcome to Adactin Group of Hotels
#And user enter the location,enter the hotel,enter the roomtype,enter the numberofrooms
#And user enter the check in date and check out date
#And user enter the adults per room and enter the childrens per room
#And user click search button
#And user see the message next page of the select page
#And user select the hotel
#And user click continue button
#When user enter the firstname,lastname,Address,credit card number
#And user select the credit card type,expiry month,expiry year,enter the cvv number
#And user click book now button
#And order number is generated
#Then user logout the page

Scenario Outline: To validate the book a hotel  
Given  user launch Adactin application
And user enter username "<username>" and password "<password>"
And user click login button
And user see the next page Welcome to Adactin Group of Hotels
And user enter the location "<location>",hotel "<hotel>",roomtype "<roomtype>",numberofrooms "<numberofrooms>"
And user enter the check in date "<checkindate>",check out date "<checkoutdate>"
And user enter the adults per room "<adultsperroom>",childrens per room "<childrensperroom>"
And user click search button
And user see the message next page of the select page
And user select the hotel
And user click continue button
When user enter the firstname"<firstname>",lastname"<lastname>",Address"<address>",credit card number"<creditcardnumber>"
And user select the credit card type"<credit card type>",expiry month"<expiry month>",expiry year"<expiry year>"enter the cvv number"<cvv number>" 
And user click book now button
And user see the result based on hotel booking page credential type "<credentialtype>"
And order number is generated
Then user logout the page

Examples:

|username|password|location|hotel|roomtype|numberofrooms|checkindate|checkoutdate|adultsperroom|childrensperroom|firstname|lastname|address|credit card number|credit card type|expiry month|expiryyear|enter the cvv number|credentialtype|
|vaithy2410|vaithy@2410|Sydney|Hotel Hervey |Double|8 - Eight|16/09/2023|18/09/2023|2 - Two|4 - Four|Gowtham|Ravi|Chennai|1332245654326789|Master Card|March|2030|3245|positive|


