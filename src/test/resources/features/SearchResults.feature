Feature: A Search functionality on the users page
  As a user, when I login as a librarian and go to Users page, then table should have following columns:
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status

  @wip
  Scenario: Table columns names
    Given I am on the login page
    And I login as a librarian
    And I click on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |