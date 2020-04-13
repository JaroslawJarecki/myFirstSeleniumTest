package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    WebDriver driver;

    By dropDownOptionsLogout = By.id("userNavigationLabel");
    By logout = By.partialLinkText("Wyloguj");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void dropDownOptionsLogout()
    {
        driver.findElement(dropDownOptionsLogout).click();
    }



    public void logout()
    {
        driver.findElement(logout).click();
    }



}
