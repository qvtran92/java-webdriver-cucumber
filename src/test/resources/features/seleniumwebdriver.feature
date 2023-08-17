# Author: Quang T
# ASK071323-311
@webdriver
Feature: practice with Selenium WebDriver methods

  @webdriver1
  Scenario: Open webpage and explore the its property
    # Given I open url "https://www.google.com/"
    Given QT navigate to URL "Google"
    Then QT get page information
    Then QT maximize the window
    Then I wait for 3 sec
