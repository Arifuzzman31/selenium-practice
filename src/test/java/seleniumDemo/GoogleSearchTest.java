package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Wait for the user to manually close the browser
        // This will keep the browser open until you close it manually
    }
}
