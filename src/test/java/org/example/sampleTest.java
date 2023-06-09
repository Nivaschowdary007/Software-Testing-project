package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTest
{
    @Test
    public void test() {
        WebDriver driver;
        System.out.println("welcome");
       System.setProperty("webdriver.chrome.driver","C:\\Users\\saikr\\OneDrive\\Desktop\\KLU\\Epam\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.github.com/login");
        System.out.println(driver.getTitle());
        highlight(driver,driver.findElement(By.cssSelector(".login-callout.mt-3")));
        highlight(driver,driver.findElement(By.xpath("//div[@class='container clearfix width-full text-center']")));
        highlight(driver,driver.findElement(By.id("login_field")));
        driver.findElement(By.name("password")).sendKeys("welcome");
        highlight(driver,driver.findElement(By.name("password")));
        driver.findElement(By.className("header-logo"));
        highlight(driver,driver.findElement(By.className("header-logo")));
        highlight(driver,driver.findElement(By.linkText("Forgot password?")));
        driver.findElement(By.tagName("h1"));
        highlight(driver,driver.findElement(By.tagName("h1")));


    }
    public static void highlight(WebDriver driver, WebElement element)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}