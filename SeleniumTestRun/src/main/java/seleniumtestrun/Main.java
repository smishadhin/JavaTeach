package seleniumtestrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\Sel Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getCurrentUrl());

        if (driver.getCurrentUrl().toString().equals("https://www.saucedemo.com/inventory.html")){
            System.out.println("Logged in, Test Success");
            driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        }else {
            System.out.println("Login Error, Test Failed");
        }

        //driver.close();
    }
}












































//driver.findElement(By.id("user-name")).sendKeys("standard_user");
//driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");