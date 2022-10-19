package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    WebElement register;
    public WebDriver webDriver;

    public ProfilePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebElement getLoginLink(){
        return webDriver.findElement(By.linkText("login"));
    }
    public WebElement getRegisterLink(){
        return webDriver.findElement(By.linkText("register"));
    }
    public WebElement getLogoutButton(){
        return webDriver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }
    public WebElement getProfilePageTitle(){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));
    }
    public WebElement getGoToBookstoreButton(){
        return webDriver.findElement(By.id("gotoStore"));
    }
    public WebElement getUsernameValue(){
        return webDriver.findElement(By.id("userName-value"));
    }

    //--------------------------------------------------------------------------
    public void clickLogin(){
        getLoginLink().click();
    }
    public void clickRegister(){
        getRegisterLink().click();
    }
}
