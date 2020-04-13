package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This  class will store all the locators of login page
 */
public class LoginPage {



        WebDriver driver;

        By username = By.id("email");
        By password = By.name("pass");
        By loginButton = By.id("loginbutton");


        public LoginPage(WebDriver driver)
        {
            this.driver = driver;
        }

        public void typeUserName()
        {
            driver.findElement(username).sendKeys("john.bambo2703@gmail.com");
        }
        public void typeWrongUsername()

        {
            driver.findElement(username).sendKeys("john.bam@gmail.com");
        }
        public void typePassword()

        {
            driver.findElement(password).sendKeys("Pamela69");
        }
        public void typeWrongPassword()

         {
        driver.findElement(password).sendKeys("Pamela69");
         }

        public void clickLogin()

        {
            driver.findElement(loginButton).click();
        }





}
