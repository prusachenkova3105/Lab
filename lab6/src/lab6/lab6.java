package lab6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class lab6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\1\\geckodriver.exe"); 
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.ru/");
        System.out.println("Page title is: " + driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Test");
        element.submit();
        //driver.quit();
    }
    
}