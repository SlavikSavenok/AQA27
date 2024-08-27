Feature: Successful login

  Background:
    Given open login page

  Scenario: Successful login
    When login with username testrailaqa27@mail.ru and password Qwertyu_1
    Then dashboard page is displayed
