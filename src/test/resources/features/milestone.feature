Feature:

  Background:
  Scenario: create Milestone
    Given open login page
    * login with username testrailaqa27@mail.ru and password Qwertyu_1
    When user clicks milestones
    Then milestones page is displayed
    When user clicks Add Milestone
    Then Add Milestones page is displayed
    * write name "AQA27"



