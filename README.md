# QA Selenium Tips
This repository serves as an excellent resource for resolving any issues encountered with Selenium Java.


How to access the css selector using the nth elements?

How to handle StaleElementReferenceException?

How to handle alerts in selenium webdriver?

how to handle windows-based alerts/popups in selenium robot class "virtual keyboard"?

Note: This Maven project includes a POM.XML file. Please check the dependencies before running.

All test scrips or codes under src/test/java/

## Various exceptions:
1. NoSuchElementException: Occurs when the WebDriver fails to find an element on the webpage using the provided locator (ID, name, CSS selector, etc.). This is often caused by typos in the locator, dynamic content changes, or elements that are not yet loaded on the page.
2. StaleElementReferenceException: This exception arises when you try to interact with an element that has become stale due to DOM (Document Object Model) changes after it was initially located. This can happen during page reloads, AJAX updates, or other dynamic content modifications.
3. WebDriverException: It could be issues with the browser driver not being found, problems establishing a connection to the browser, or errors during WebDriver operations
4. TimeoutException: This exception occurs when a WebDriver command takes longer than the specified or default timeout to complete. This can happen due to slow internet connections, overloaded servers, or complex page elements that take a long time to load.
5. NoAlertPresentException: This exception is thrown when you try to switch focus to an alert using switchTo().alert() but there's no alert present on the page. This can happen if your code expects an alert to appear when it actually doesn't based on the webpage behavior.
6. UnhandledAlertException: This exception occurs when an alert appears unexpectedly during test execution, and your code doesn't handle it using methods like alert.accept() or alert.dismiss(). This can lead to the test hanging or failing as the alert blocks further interaction.
