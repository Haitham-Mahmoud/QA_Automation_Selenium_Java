package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertExampleWithWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Replace with a page that triggers an alert
        driver.get("https://www.example.com/demo/alert");

        // Click a button that triggers the alert
        driver.findElement(By.id("alert-button")).click();

        // Wait for the alert to be present (up to 10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch focus to the alert and handle it
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
