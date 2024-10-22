Feature: Create Contact

Scenario Outline: User Login and creating a contact 
		Given user is on application home page
  	When application page title is FREE CRM
  	Then user clicks START HERE button 
  	Then user enters "<userName>" and "<password>"
  	Then user clicks Login button
  	And navigates to user profile page
  	Then go to contacts 
  	Then click on create
  	Then user enters details "<firstName>" and "<lastName>" and "<company>"
  	Then click on save
  	And verify new contact
  	And close the browser

  Examples:
			| userName | password | firstName | lastName | company |
			| veereshangadi8400@gmail.com | Deva+raja@8400 | Veeresh | Angadi | Infosys |
		  | veereshangadi8400@gmail.com | Deva+raja@8400 | Deva | Angadi | TCS |
		  | veereshangadi8400@gmail.com | Deva+raja@8400 | Garja | Angadi | Wipro |
		  | veereshangadi8400@gmail.com | Deva+raja@8400 | Mahesh | Angadi | Virtusa |
			