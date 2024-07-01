1. TestContextSetup: This is the heart of the framework. Starting point since each class will call this class. 
Constructor will contain BaseTest, PageObjectManager and generic utilities for calling "WebDriverManager" method

2. BaseTest: This class contains invoking webdriver and navigate to required browser and url. It is not required
to create a constructor for this class.  

3. PageObjectManager: This class has methods to call each pages in the project. This has a constructor which 
will invoke WebDriver. 

4. Generic Utility: this class contains all generic web operation methods. This has a constructor which 
will invoke WebDriver.  

5. Hooks : has a constructor which will call TestContextSetup 


Test Cases level:
1. StepDefinitions: 
	a. Constructor will invoke (TestContextSetup) 
	b. invoke pageObject class by passing pageObjectManager methods

2. PageObjects:
	a. Constructor will invoke WebDriver 
	
Note: WebDriver are only used in pages, hooks, genericUtility and baseTest calls 
