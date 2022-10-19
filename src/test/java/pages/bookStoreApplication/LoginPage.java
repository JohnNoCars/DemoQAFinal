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
    public void fillUsername(String s){
        userName().sendKeys(s);
    }
    public WebElement password(){
        return webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public void fillPassword(String s){
        password().sendKeys(s);
    }
    public WebElement loginBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
    }
    public void clickLoginBtn(){
        loginBtn().click();
    }
    public WebElement newUserBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"newUser\"]"));
    }
    public void clickNewUserBtn(){
        newUserBtn().click();
    }
    public WebElement profilePage(){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));
    }

}
