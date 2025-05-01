package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractise {
    public static void main(String[] args) {
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the site
        driver.get("https://demoqa.com/automation-practice-form/");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // using tag and attribute
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Arifuzzman");

        // using tag and attribute
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Niaz");

        // using contains
        driver.findElement(By.xpath("//input[contains(@id,'userEmail')]")).sendKeys("niazsays99@gmail.com");

        // using starts-with
        driver.findElement(By.xpath("//label[starts-with(@class,'custom-control-label')]")).click();

        // using contains 
        driver.findElement(By.xpath("//input[contains(@id,'userNumber')]")).sendKeys("0171562563");
        
        // using text() - Select Hobbies ( Music)
        driver.findElement(By.xpath("//label[text()='Music']")).click();

        // using attribute - Current Address
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Dhaka, Bangladesh");
        
         // using contains - select state 
        driver.findElement(By.xpath("//div[contains(@id,'state')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();
        
        // using contains - Select City
        driver.findElement(By.xpath("//div[contains(@id,'city')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).click();
       
        // using contains - Enter Subjects (e.g., type "Maths" and press enter)
        driver.findElement(By.xpath("//input[contains(@id,'subjectsInput')]")).sendKeys("Maths");
        
       
    }
}
