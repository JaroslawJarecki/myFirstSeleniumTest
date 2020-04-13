package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.LoginPage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * This  class will store all tests for login page
 */
public class loginTestCases
{
    @Test
    public void verifyValidLogin()
    {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        options.addArguments("disable-infobars");
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        driver.navigate().to("https://www.facebook.com/");


        LoginPage loginpage = new LoginPage(driver);
        loginpage.typePassword();
        loginpage.typeUserName();
        loginpage.clickLogin();

        HomePage homepage = new HomePage(driver);
        homepage.dropDownOptionsLogout();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        homepage.logout();

        driver.close();


        driver.quit();


    }
    @Test
    public void wrongLogin()

    {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        options.addArguments("disable-infobars");
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        driver.navigate().to("https://www.facebook.com/");


        LoginPage loginpagee = new LoginPage(driver);
        loginpagee.typeWrongPassword();
        loginpagee.typePassword();
        loginpagee.clickLogin();



    }





}


