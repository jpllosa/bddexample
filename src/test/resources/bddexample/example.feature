Feature: Doxycycline orders

	Scenario: Has HIV
		Given A customer orders Doxycycline
		And Suffers the condition "HIV"
		Then Reply should be "Cannot prescribe"
	
	Scenario: Condition is None
		Given A customer orders Doxycycline
		And Suffers the condition "None"
		Then Reply should be "Can prescribe"
