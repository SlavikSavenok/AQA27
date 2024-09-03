Feature:

  Background:
    Given open login page
    When login with username testrailaqa27@mail.ru and password Qwertyu_1

  Scenario Outline: create test case
    Given dashboard page is displayed
    When user clicks Test Cases
    Then Test Cases page is displayed
    When user clicks Add TestCase
    Then Add TestCase page is displayed
    Then write <title>
    * select Section Dropdown <testCases>
    * select Template Dropdown <template>
    * select Type Dropdown <type>
    * select Priority Dropdown <priority>
    * select Assigned To Dropdown <assigned>
    * write Estimate <estimate>
    * write  References <references>
    * select Automation Type To Dropdown <automation type>
    * write Preconditions <preconditions>
    Then click Add Test Case button

    Examples:
      | title        | testCases    | template                       | type         | priority | assigned | estimate | references   | automation type | preconditions        |
      | "TitleAQA27" | "Test Cases" | "Behaviour Driven Development" | "Acceptance" | "Low"    | "None"   | "15"     | "References" | "Ranorex"       | "PreconditionsAQA27" |

  Scenario Outline: Read Test Case
    Given dashboard page is displayed
    When user clicks Test Cases
    Then Test Cases page is displayed
    When user clicks  Test Case TitleAQA27
    Then Test Case Personal Page is displayed
    When user clicks Test Case Edit button
    Then Add TestCase page is displayed
    * Title field has value <expectedValueTitle>
    * Section field has value <expectedValueSection>
    * Template field has value <expectedValueTemplate>
    * Type field has value <expectedValueType>
    * Priority field has value <expectedValuePriority>
    * Assigned field has value <expectedValueAssigned>
    * Estimate field has value <expectedValueEstimate>
    * References field has value <expectedValueReferences>
    * Automation Type field has value <expectedValueAutomation>
    * Preconditions field has value <expectedValuePreconditions>
    Examples:
      | expectedValueTitle | expectedValueSection | expectedValueTemplate          | expectedValueType | expectedValuePriority | expectedValueAssigned | expectedValueEstimate | expectedValueReferences | expectedValueAutomation | expectedValuePreconditions |
      | 'TitleAQA27'       | 'Test Cases'         | 'Behaviour Driven Development' | 'Acceptance'      | 'Low'                 | 'None'                | '15m'                 | 'References'            | 'Ranorex'               | 'PreconditionsAQA27'       |

  Scenario Outline: Update Test Case
    Given dashboard page is displayed
    When user clicks Test Cases
    Then Test Cases page is displayed
    When user clicks  Test Case TitleAQA27
    Then Test Case Personal Page is displayed
    When user clicks Test Case Edit button
    Then Add TestCase page is displayed
    Then update Title field <title>
    * update Template field <template>
    * update Type field <type>
    * update Priority field <priority>
    * update Assigned To field <assigned>
    * update Estimate field <estimate>
    * update References field <references>
    * update Automation Type field <automation type>
    * update Preconditions Type field <preconditions>
    Then click Add Test Case button
    Examples:
      | title                  | template            | type    | priority   | assigned              | estimate | references | automation type | preconditions   |
      | "Test Case for delete" | "Test Case (Steps)" | "Other" | "Critical" | "Viachaslau Savianok" | "55"     | "AQA"      | "None"          | "Preconditions" |

  Scenario: Delete Test Case
    Given dashboard page is displayed
    When user clicks Test Cases
    Then Test Cases page is displayed
    Then user click Test Case for delete
    Then Test Case Personal Page is displayed
    When user clicks Test Case Edit button
    Then Add TestCase page is displayed
    When user click delete this test case
    * user click mark as deleted
