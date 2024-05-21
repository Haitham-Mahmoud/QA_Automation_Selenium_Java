package Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Replace with a page that triggers an alert
        driver.get("https://www.example.com/demo/alert");

        // Click a button that triggers the alert
        driver.findElement(By.id("alert-button")).click();

        // Switch focus to the alert
        Alert alert = driver.switchTo().alert();

        // Get the alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        // Accept the alert (click OK)
        alert.accept();
        driver.quit();
    }
}
