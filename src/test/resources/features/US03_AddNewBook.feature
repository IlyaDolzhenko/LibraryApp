Feature:  Librarian should be able to add a new books

  @smoke
  Scenario: add a new books
    Given "librarian" is on the homePage
    When librarian click "Books" module
    And librarian click +Add Book button
    When librarian enter BookName, ISBN, Year, Author and Description
    And librarian click save changes
    Then verify a new book is added
