package com.eviltester.webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyFirstTest {

    @Test
    public void startWebDriver() {

        //System property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);


        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        Assert.assertTrue("title should start with Facebook",
                driver.getTitle().startsWith("Facebook"));
        driver.findElement(By.id("u_0_m")).click();
        driver.findElement(By.id("email")).sendKeys("john.bambo2703@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Pamela69");
        driver.findElement(By.id("loginbutton")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("userNavigationLabel")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText("Wyloguj")).click();

        if (driver.findElements(By.id("loginbutton")).size() != 0) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }


        driver.close();


        driver.quit();


    }
}