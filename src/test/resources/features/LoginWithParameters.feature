Feature: Login with parameters

  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password 'oF9gG98w'
    And click the sign in button
    Then dashboard should be displayed


  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian12@library"
    And I enter password 'gO6WtSih'
    And click the sign in button
    Then dashboard should be displayed
    And there should be 138 users
  #number can be whatever you have there

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian1@library" and "rs4BNN9G"
    Then dashboard should be displayed
    And there should be 138 users
 #number can be whatever you have there