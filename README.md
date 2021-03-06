How to run the Test

**Prerequisite**

Java environment
Maven


Configure webdriver.

I used ChromeDriver but you can choose other webdriver eg. Mozilla GeckoDriver
So first download ChromeDriver from http://chromedriver.chromium.org/downloads.
Copy your downloaded chromedriver.exe file path.
Go to E2EUserJourney\src\test\java\testcases\mytheresa\WebdriverSettings.java file.
Paste the copied file path in System.setProperty("webdriver.chrome.driver","Paste path here").

Project is ready to run. Execute the class from test package with name 'CompareCards'
