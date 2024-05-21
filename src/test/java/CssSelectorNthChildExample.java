import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorNthChildExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open a webpage for testing (replace with your desired URL)
        driver.get("https://www.example.com");

        // Scenario 1: Select the second "h2" element
        WebElement secondH2 = driver.findElement(By.cssSelector("h2:nth-child(2)"));
        System.out.println("Text of second h2: " + secondH2.getText());

        // Scenario 2: Click the first "button" element within a specific "div"
        WebElement firstButton = driver.findElement(By.cssSelector("div#container button:nth-child(1)"));
        firstButton.click();

        // Scenario 3: Find all list items (li) with even indexes (starting from the 2nd)
        System.out.println("Even-indexed list items:");
        for(WebElement element : driver.findElements(By.cssSelector("li:nth-child(2n)"))){
            System.out.println(element.getText());
        }

    }
}
