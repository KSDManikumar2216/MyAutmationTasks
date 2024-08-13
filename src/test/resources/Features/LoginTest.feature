Feature: login signup validation

#---> validaiting the login functionality and sign up functionality

@Test001
Scenario: Sign-up flow on the Magento website
Given the browser launched and user is navigated to the Magento homepage
When the user views the screen
Then the "Create an Account" link should be visible.
When the user clicks on the "Create an Account" link
Then the Sign-Up page should open with the account creation form.
Given the user is on the Sign-Up page
When the user enters valid data in the required fields (First Name, Last Name, Email, Password).
When the user clicks the "Create an Account" button
Then the account should be successfully created, and the user should be logged in or shown a confirmation page.
Given the user has successfully created an account.
When the user signs out
And user signs in again using the newly created credentials
When the user clicks the "Sign in" button
Then the user should be successfully signed in and redirected to the appropriate page.