Feature: Pet

Scenario: Validate that a new pet can be added
Given User request the API using method "POST"
When User fills in information about pet
Then Pet should be added
And Status code should be 200