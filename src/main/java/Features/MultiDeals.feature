Feature: Application Multi Deals Feature
  	
Scenario: User Login and Create New Multi Deal
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
  	| Deal2 | This is new Deal | 1000 | Infosys | 3 |
  	| Deal3 | This is new Deal | 1000 | Infosys | 3 |
  	| Deal4 | This is new Deal | 1000 | Infosys | 3 |
  	| Deal5 | This is new Deal | 1000 | Infosys | 3 |
  	And close the browser