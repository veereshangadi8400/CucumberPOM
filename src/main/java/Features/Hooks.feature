Feature: Application Multi Deals Feature
  	
Scenario: User Login with Valid Credentials
  	Given user is on application home page
 	  When application page title is FREE CRM
	  Then user clicks START HERE button 
  	Then user enters username and password
  	| userName | password |
  	| veereshangadi8400@gmail.com | Deva+raja@8400 |
  	Then user clicks Login button
  	And navigates to user profile page
@smoke	
Scenario: User Login with Invalid Credentials
  	Given user is on application home page
 	  When application page title is FREE CRM
	  Then user clicks START HERE button 
  	Then user enters username and password
  	| userName | password |
  	| veereshangad400@gmail.com | Deva+raja@8400 |
  	Then user clicks Login button
  	And user is on application home page
  	
Scenario: User Login with Valid Credentials and Create New Deal
  	Given user is on application home page
 	  When application page title is FREE CRM
	  Then user clicks START HERE button 
  	Then user enters username and password
  	| userName | password |
  	| veereshangadi8400@gmail.com | Deva+raja@8400 |
  	Then user clicks Login button
  	And navigates to user profile page
  	Then go to deals 
  	Then click on create
  	Then user enters deal details 
  	| Title | Description | Amount | Company | Probability |
  	| Deal1 | This is new Deal | 1000 | Infosys | 3 |
  	
  	