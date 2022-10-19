package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage {
    WebElement register;
    public WebDriver webDriver;

    public ProfilePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebElement login(){
        return webDriver.findElement(By.linkText("login"));
    }
    public WebElement register(){
        return webDriver.findElement(By.linkText("register"));
    }
    public void clickLogin(){
        login().click();
    }
    public void clickRegister(){
        register().click();
    }
}