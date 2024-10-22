Feature: Application Login Feature
  	
#Scenario: User Login Scenario and Create new contact
#  	Given user is on application home page
# 	When application page title is FREE CRM
#	  Then user clicks START HERE button 
#  	Then user enters "veereshangadi8400@gmail.com" and "Deva+raja@8400"
#  	Then user clicks Login button
#  	And navigates to user profile page

  	
  	
Scenario Outline: User Login Scenario
  	Given user is on application home page
  	When application page title is FREE CRM
  	Then user clicks START HERE button 
  	Then user enters "<userName>" and "<password>"
  	Then user clicks Login button
  	And navigates to user profile page
  	And close the browser
  	
  	
Examples:
          | userName | password |
          | veereshangadi8400@gmail.com | Deva+raja@8400 |
          | anshulc55 | Anshul@123 |
          | terri | Terri@123 |
          | tomhank | tomhank@123 | 
