Feature: Nop commerce
  Background:
    Given user able to open browser
    And enter url

    Scenario Outline: REGISTER
      When user click on register link
      Then VERIFY register page title
      Then click on gender
      Then Enter "<firstname>" and "<lastname>"
Then select "<birthday>","<birthmonth>","<birthyear>"
      And USER ENTER valid "<email>","<password>","<confirmPassword>"
      Then click on register button



      Then close browser
Examples:
|firstname|lastname|email|password|confirmPassword|        birthday|birthmonth|birthyear|
|Geeta    |Gohil   |gitgohil@yahoo.co.in|Ss12345@|Ss12345@|  18    | march    |1980     |