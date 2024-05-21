package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class PromptAlertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Replace with a page that triggers a prompt
        driver.get("https://www.example.com/demo/prompt");

        // Click a button that triggers the prompt
        driver.findElement(By.id("prompt-button")).click();

        // Switch focus to the alert
        Alert alert = driver.switchTo().alert();

        // Enter text into the propmt (if applicable)
        alert.sendKeys("Your input here");

        // Accept the prompt (click Ok)
        alert.accept();

        driver.quit();
    }
}
