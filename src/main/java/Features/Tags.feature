Feature: Dummy Tags feature

@SmokeTest @Regression @Functional @sanity @End2End
Scenario: Login FREE CRM
		Given user is on application home page
	
@SmokeTest 	@Regression
Scenario: Login with invalid credentials
		Given user is on application home page

@SmokeTest @Functional
Scenario: Create a Deal
		Given user is on application home page

@Functional @sanity
Scenario: Create a Contact
			Given user is on application home page

@sanity @End2End
Scenario: Create a Task
		Given user is on application home page

@Regression @sanity
Scenario: Create a Document
		Given user is on application home page

@Functional @End2End
Scenario: Create Cases
		Given user is on application home page

