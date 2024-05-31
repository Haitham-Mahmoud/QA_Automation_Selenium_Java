# QA Selenium Tips
This repository serves as an excellent resource for resolving any issues encountered with Selenium Java.

- How to access the css selector using the nth elements?

- How to handle StaleElementReferenceException?

- How to handle alerts in selenium webdriver?

- How to handle windows-based alerts/popups in selenium robot class "virtual keyboard"?

Note: This Maven project includes a POM.XML file. Please check the dependencies before running.

All test scrips or codes under src/test/java/

## Various exceptions:
1. NoSuchElementException: Occurs when the WebDriver fails to find an element on the webpage using the provided locator (ID, name, CSS selector, etc.). This is often caused by typos in the locator, dynamic content changes, or elements that are not yet loaded on the page.
2. StaleElementReferenceException: This exception arises when you try to interact with an element that has become stale due to DOM (Document Object Model) changes after it was initially located. This can happen during page reloads, AJAX updates, or other dynamic content modifications.
3. WebDriverException: It could be issues with the browser driver not being found, problems establishing a connection to the browser, or errors during WebDriver operations
4. TimeoutException: This exception occurs when a WebDriver command takes longer than the specified or default timeout to complete. This can happen due to slow internet connections, overloaded servers, or complex page elements that take a long time to load.
5. NoAlertPresentException: This exception is thrown when you try to switch focus to an alert using switchTo().alert() but there's no alert present on the page. This can happen if your code expects an alert to appear when it actually doesn't based on the webpage behavior.
6. UnhandledAlertException: This exception occurs when an alert appears unexpectedly during test execution, and your code doesn't handle it using methods like alert.accept() or alert.dismiss(). This can lead to the test hanging or failing as the alert blocks further interaction.

## Listeners:
There are primarily two types of listeners in Selenium:

- WebDriver Event Listeners: These listeners specifically focus on events triggered by the WebDriver itself. They provide methods to track various WebDriver actions, such as navigation, element interaction, and exceptions.

- TestNG Listeners:  If you're using TestNG as your test framework alongside Selenium, you can leverage TestNG listeners. These listeners offer hooks into various stages of the test execution process, including test suite start/finish, test method start/finish, and test success/failure.

Listeners with examples: 
- Capturing screenshots on test failure: Using WebDriver listeners, you can capture a screenshot whenever a test fails. This helps in visually identifying the state of the application at the time of failure.
- Logging test events: Listeners can be used to create detailed logs throughout the test execution. This can include information like the test method being executed, any encountered exceptions, and custom messages.
- Custom reporting: By implementing listeners, you can generate customized test reports that include additional data points or visual aids beyond the basic information provided by the testing framework.

Overriding:
- Overriding occurs when a subclass (child class) redefines a method inherited from its parent class (superclass), Both methods have the same name, parameters, and return type.

![image](https://github.com/Haitham-Mahmoud/QA_Automation_Selenium_Java/assets/37036064/82b315c3-f829-4425-8074-cbb12c8ded2c)


Overloading:
Overloading occurs when a class has multiple methods with the same name but different parameters (number, type, or order).

![image](https://github.com/Haitham-Mahmoud/QA_Automation_Selenium_Java/assets/37036064/8f928b56-4ba0-49db-bea5-e2362cb5ec7d)

Key Differences:

![image](https://github.com/Haitham-Mahmoud/QA_Automation_Selenium_Java/assets/37036064/1e32fffc-142f-47ba-bc36-eeeb901661c3)

Page Object Model (POM):
Selenium's POM design pattern is essentially a centralized repository for storing all your web elements. It's gained significant popularity due to its ability to:

Simplify test maintenance: Changes to UI elements are isolated in one place.
Enhance code reusability: Page objects can be reused across different test cases.
Eliminate code duplication: No need to repeat element identification code.


![POM](https://github.com/Haitham-Mahmoud/QA_Automation_Selenium_Java/assets/37036064/48cec586-9041-4864-8eee-4bfce5c292ca)


