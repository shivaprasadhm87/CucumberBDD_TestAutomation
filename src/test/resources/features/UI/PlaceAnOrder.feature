Feature: Placing an order 

@Test
Scenario: Verify user is able to place order successfully

Given the user is on "Landing" page 
And user searches for "Tom" in search field 
When user searches for "Tom" in top detals page 
Then "Tomato" is displayed in the search criteria
And results matches with data displayed landing page 