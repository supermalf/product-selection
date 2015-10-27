Feature: Product selection
  As a customer
  I want to select the products that are available to me,
  based on the location of my home

Scenario: Catalogue always displays Sky News and Sky Sports News.
	Given I visit the product selection page
	Then the page should display Sky News and Sky Sports News

Scenario: Basket displays the product I select from the catalogue.
	Given I visit the product selection page
	When I select Sky News
	Then the basket should display Sky News

 Scenario: Basket remove the product I unselect from the catalogue.
   Given I visit the product selection page
   When I select Sky News
   And I unselect Sky News
   Then the basket should not display Sky News

Scenario: Checkout takes you to the confirmation page.
 	Given I visit the product selection page
	When I select Sky News
	And I select Sky Sport News
	When I click on checkout
	Then the confirmation page should be displayed

 Scenario: Catalogue displays right content for Liverpool customers
   Given I visit the product selection page as a Liverpool customer
   Then the page should display Sky News and Sky Sports News
   And the page should display Liverpool TV

 Scenario: Catalogue displays right content for London customers
   Given I visit the product selection page as a London customer
   Then the page should display Sky News and Sky Sports News
   And the page should display Arsenal TV and Chelsea TV

