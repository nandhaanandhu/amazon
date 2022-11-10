Feature: search of product in amazon 

Scenario: Launch the amazon application in web

Given enter the url
When user select the product from the category 
And user should enter the product name in the search box
Then user should compare with the suggestion and Click the product name

Scenario: Product page 
When user search the result page and enter the total number of product 
Then user search the more result page and enter the total number of product 