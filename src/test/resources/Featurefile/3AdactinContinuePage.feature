Feature: To validate continue functionality
Scenario: To validate continue using select a hotel
Given user enter the adactin search page
And user launch Adactin application
And user enter username "<username>" and password "<password>"
And user click login button
And user see the next page Welcome to Adactin Group of Hotels
When user enter the location "<location>",hotel "<hotel>",roomtype "<roomtype>",numberofrooms "<numberofrooms>"
And user enter the check in date "<checkindate>",check out date "<checkoutdate>"
And user enter the adults per room "<adultsperroom>",childrens per room "<childrensperroom>"
And user click search button
When user select the hotel
Then user click continue button

Examples:

|username|password|location|hotel|roomtype|numberofrooms|checkindate|checkoutdate|adultsperroom|childrensperroom|credenttial|
|vaithy2410|vaithy@2410|Sydney|Hotel Hervey |Double|8 - Eight|16/09/2023|18/09/2023|2 - Two|3 - Three|positive|
|vaithy2410|vaithy@2410|India|Hotel Hervey |Double|8 - Eight|16/09/2023|18/09/2023|2 - Two|1 - One|negative|
