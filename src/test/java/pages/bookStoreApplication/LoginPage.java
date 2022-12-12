package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {
    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getUserName(){
        return webDriver.findElement(By.id("userName"));
    }
    public WebElement getPassword(){
        return webDriver.findElement(By.cssSelector("#password"));
    }
    public WebElement getLoginBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
    }
    public WebElement getNewUserBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"newUser\"]"));
    }
    public WebElement getInvalidUsernameOrPasswordNotification(){return webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/p")); }
    public String getErrorMessage(){
        return getInvalidUsernameOrPasswordNotification().getText();
    }
    public WebElement getBlankCredentialError(){return webDriver.findElement(By.cssSelector(".mr-sm-2.is-invalid.form-control"));}
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
    public String getUsernamePlaceholder(){return getUserName().getAttribute("placeholder");}
    public String getPasswordPlaceholder(){return getPassword().getAttribute("placeholder");}

}
