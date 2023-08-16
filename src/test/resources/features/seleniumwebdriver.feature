# Author: Anna V
# ASK071323-322  
@webdriver  
Feature: practice with Selenium WebDriver methods
  
  @webdriver1
  Scenario: Open webpage and explore the property of it
    # Given I open url "https://www.google.com/"
    Given AV navigate to URL "ASK"
    Then AV get page information
    Then AV maximize the window
    Then I wait for 3 sec



    
