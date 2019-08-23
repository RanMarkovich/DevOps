package com.udemy.DevOpsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Test_01(){
        driver.navigate().to("http://www.yopmail.com/en/");
        System.out.println("Title is: " + driver.getTitle());
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
