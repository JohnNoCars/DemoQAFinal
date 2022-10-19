package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    public WebDriver webDriver;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebElement getFirstName(){
        return webDriver.findElement(By.id("firstname"));
    }
    public WebElement getLastName(){
        return webDriver.findElement(By.id("lastname"));
    }
    public WebElement getUserName(){
        return webDriver.findElement(By.id("userName"));
    }
    public WebElement getPassword(){
        return webDriver.findElement(By.id("password"));
    }
    public  WebElement getRegistrationBtn(){
        return webDriver.findElement(By.id("register"));
    }
    public WebElement getBackToLoginButton(){
        return webDriver.findElement(By.id("gotologin"));
    }
    //--------------------------------------------------------------------------------------
    public void fillFirstName(String s){
        getFirstName().sendKeys(s);
    }
    public void fillLastName(String s){
        getLastName().sendKeys(s);
    }
    public void fillUserName(String s){
        getUserName().sendKeys(s);
    }
    public void fillPassword(String s){
        getPassword().sendKeys(s);
    }
    public void clickRegisterButton(){
        getRegistrationBtn().click();
    }
    public void clickBackToLoginBtn(){
        getBackToLoginButton().click();
    }
    /*public void overrideReCaptcha(){
        WebElement iFrame = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/div/div/iframe"));
        webDriver.switchTo().frame(iFrame);
        WebElement iFrame_checkbox =
                webDriver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
        iFrame_checkbox.click();
    }*/
    public String getRegistrationUnsuccessful(){
        return webDriver.findElement(By.id("name")).getText();
    }


}
