package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WindowsAlertExample {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "path/on/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Replace with your URL
        driver.get("https://your-website.com");

        // Click a button that triggers the Windows alert (if applicable)
        driver.findElement(By.id("trigger_alert_button")).click();

        // Switch  focus to the alert window (might require additional logic)
        // ... (code to switch focus to the alert window)

        // Use Robot Class to handle the alert (assuming a confirmation dialog)
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB); // Tab to the first button (might need adjustment)
        robot.keyPress(KeyEvent.VK_ENTER); // Press Enter to accept the alert

        driver.quit();

    }
}
