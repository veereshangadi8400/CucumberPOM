Feature: Application Deals Feature
  	
Scenario: User Login and Create new Deal
  	Given user is on application home page
 	  When application page title is FREE CRM
	  Then user clicks START HERE button 
  	Then user enters username and password
  	| veereshangadi8400@gmail.com | Deva+raja@8400 |
  	Then user clicks Login button
  	And navigates to user profile page
  	Then go to deals 
  	Then click on create
  	Then user enters deal details 
  	| Deal1 | This is new Deal | 1000 | Infosys | 3 |
   	Then click on save
  	And close the browser