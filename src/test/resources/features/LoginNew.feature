Feature:  Library app login feature
  User Story: As a user, I should be able to login to LibraryCT

  Scenario: Login as librarian
    Given librarian is on the loginPage
    Then verify that the title is "Login-Library"
    When librarian enters valid email address and password
    And librarian clicks sign in button
    Then verify that there are 3 models on the page

  Scenario: Login as student
    Given student is on the loginPage
    Then verify that the URL is "https://library2.cydeo.com/login.html"
    When When student enters valid email address and password
    And student clicks sign in button
    Then Then verify that there are 2 models on the page

  Scenario: Login as user with negative credentials
    Given user is on the loginPage
    When user enters invalid email address or password
    And student clicks sign in button
    Then verify the error message "Sorry, Wrong Email or Password"
