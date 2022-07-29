Feature:  Librarian should be able to add a new user

  @wip02
  Scenario:
    Given librarian is on the homePage
    When librarian click User module
    And librarian click "+Add User" button
    When librarian enter full name, password, email and address
    Then verify a new user is created
