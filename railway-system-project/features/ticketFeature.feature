Feature: Buying an e-ticket

	Scenario: The user attempts to buy an e-ticket with sufficient funds.
		Given The user has marked a shedule entry
		And the user has sufficient funds
		When The user clicks the e-ticket buy button
		Then The user sees the "e-ticket bought successfully" message.

	Scenario: The user attempts to buy an e-ticket with insufficient funds.
		Given The user has marked a shedule entry
		And the user has insufficient funds
		When The user clicks the e-ticket buy button
		Then The user sees the "Error: insufficient funds" message.
		
	