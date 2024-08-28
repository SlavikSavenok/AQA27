Feature:
  Background:
    Scenario: create test case
      Given open login page
      * login with username testrailaqa27@mail.ru and password Qwertyu_1
      When user clicks Test Cases
      Then Test Cases page is displayed
      When user clicks Add TestCase
      Then Add TestCase page is displayed