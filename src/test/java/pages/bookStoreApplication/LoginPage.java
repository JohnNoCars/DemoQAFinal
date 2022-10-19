package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement userName(){
        return webDriver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }
    public WebElement password(){
        return webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public WebElement loginBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
    }
    public WebElement newUserBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"newUser\"]"));
    }
    public void fillUsername(String s){
        userName().sendKeys(s);
    }
    public void fillPassword(String s){
        password().sendKeys(s);
    }
    public void clickLoginBtn(){
        loginBtn().click();
    }
    public void clickNewUserBtn(){
        newUserBtn().click();
    }

}
