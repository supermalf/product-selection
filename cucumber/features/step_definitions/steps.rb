# --------- 'Given' steps ----------
Given(/^I visit the product selection page$/) do
	visit('/1')
end

Given /^I visit the product selection page as a London customer$/ do
  visit('/1')
end

Given /^I visit the product selection page as a Liverpool customer$/ do
  visit('/2')
end

# --------- 'When' steps -----------
When /^I select Sky News$/ do
	check "Sky News"
end

When /^I unselect Sky News$/ do
	uncheck "Sky News"
end

When /^I select Sky Sport News$/ do
	check "Sky Sport News"
end

When /^I click on checkout$/ do
	click_on "checkout"
	click_on "confirm"
end

# --------- 'Then' steps -----------
Then(/^the page should display Sky News and Sky Sports News$/) do
	page.has_content?('Sky News')
	page.has_content?('Sky Sports News')
end

Then /^the basket should display Sky News$/ do
	page.should have_selector("li.ng-binding", text: "Sky News")
end

Then /^the basket should not display Sky News$/ do
	page.should have_no_selector("li.ng-binding", text: "Sky News")
end

Then /^the confirmation page should be displayed$/ do
	page.should have_selector("h1", text: "Thank you")
end

Then /^the page should display Liverpool TV$/ do
	page.has_content?('Liverpool TV')
end

Then /^the page should display Arsenal TV and Chelsea TV$/ do
	page.has_content?('Arsenal TV')
	page.has_content?('Chelsea TV')
end
