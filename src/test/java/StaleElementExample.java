import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaleElementExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Login section (assuming successful login)
        driver.get("https://www.example.com/login");
        driver.findElement(By.id("username")).sendKeys("your_username");
        driver.findElement(By.id("password")).sendKeys("your_password");
        driver.findElement(By.id("login_button")).click();

        // Wait for the profile button to be present and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profileButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("profile_button")));
        profileButton.click();

        driver.quit();

    }
}
