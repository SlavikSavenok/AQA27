Feature:

  Background:

  Scenario: Create Milestone
    Given open login page
    * login with username testrailaqa27@mail.ru and password Qwertyu_1
    When user clicks milestones
    Then milestones page is displayed
    When user clicks Add Milestone
    Then Add Milestones page is displayed
    * write Name "AQA27"
    * write References "AQA"
    * write Description "AQA27"
    * user clicks Start Date field
    * user clicks on the selected start date
    * user clicks on End Date field
    * user clicks on the selected end date
    * user click checkbox 'This milestone is completed'
    When user clicks Add Milestone Button
    Then milestones page is displayed

  Scenario: Read Milestone
    Given open login page
    * login with username testrailaqa27@mail.ru and password Qwertyu_1
    When user clicks milestones
    Then milestones page is displayed
    When user click AQA27 project
    Then  project page is displayed
    When user clicks Edit button
    Then Add Milestones page is displayed
    * Read Name field


  Scenario: Update Milestone
    Given open login page
    * login with username testrailaqa27@mail.ru and password Qwertyu_1
    When user clicks milestones
    Then milestones page is displayed
    When user click AQA27 project
    Then  project page is displayed
    When user clicks Edit button
    Then Add Milestones page is displayed
    * update Name field on "Viachaslau AQA27"
    * update References field on "aqa27"
    * update Description field on "TMS"
    * update Start Date
    * update End Date
    * remove checkbox
    When user clicks Add Milestone Button
    Then milestones page is displayed


  Scenario: Delete Milestone
    Given open login page
    * login with username testrailaqa27@mail.ru and password Qwertyu_1
    When user clicks milestones
    Then milestones page is displayed
    When user click ViachaslauAQA27 project
    Then project page is displayed
    When user clicks Edit button
    Then Add Milestones page is displayed
    When user click delete this milestone
    Then popup window appears is displayed
    Then set checkbox delete milestone
    * user click Ok button in popup window

