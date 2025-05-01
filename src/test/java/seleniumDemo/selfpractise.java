package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selfpractise {
    public static void main(String[] args) {
        // Launch saucedemo
        WebDriver driver = new ChromeDriver();

        // Open Saucedemo 
        driver.get("https://www.saucedemo.com/");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());
       //username
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("standard_user");
        //password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        //login button click 
        WebElement loginButton = driver.findElement(By.className("btn_action"));
        loginButton.click();
        
        
    }
}
