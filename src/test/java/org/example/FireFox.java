package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox
{
    @Test
    public void test()
    {
        WebDriver driver;
        System.out.println("welcome");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\saikr\\OneDrive\\Desktop\\KLU\\Epam\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://auth.geeksforgeeks.org/");
        System.out.println(driver.getTitle());
        highlight(driver,driver.findElement(By.id("luser")));
        highlight(driver,driver.findElement(By.className("center")));
        highlight(driver,driver.findElement(By.linkText("Forgot Password")));
        highlight(driver,driver.findElement(By.cssSelector(".social-signin-div")));
        highlight(driver,driver.findElement(By.xpath("//button[normalize-space()='Sign In']")));
    }
    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}
