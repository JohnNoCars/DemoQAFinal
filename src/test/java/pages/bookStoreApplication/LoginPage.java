package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getUserName(){
        return webDriver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }
    public WebElement getPassword(){
        return webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public WebElement getLoginBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
    }
    public WebElement getNewUserBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"newUser\"]"));
    }

    //-----------------------------------------------------------------------
    public void fillUsername(String s){
        getUserName().sendKeys(s);
    }
    public void fillPassword(String s){
        getPassword().sendKeys(s);
    }
    public void clickLoginBtn(){
        getLoginBtn().click();
    }
    public void clickNewUserBtn(){
        getNewUserBtn().click();
    }

}
