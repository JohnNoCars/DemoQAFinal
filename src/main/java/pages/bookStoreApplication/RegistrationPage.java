package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public WebDriver webDriver;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebElement firstName(){
        return webDriver.findElement(By.xpath("//*[@id=\"firstname\"]"));
    }
    public WebElement lastName(){
        return webDriver.findElement(By.xpath("//*[@id=\"lastname\"]"));
    }
    public WebElement userName(){
        return webDriver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }
    public WebElement password(){
        return webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public  WebElement registerBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"register\"]"));
    }
    public WebElement backToLoginBtn(){
        return webDriver.findElement(By.xpath("//*[@id=\"gotologin\"]"));

    }
    public void fillFirstName(String s){
        firstName().sendKeys(s);
    }
    public void fillLastName(String s){
        lastName().sendKeys(s);
    }
    public void fillUserName(String s){
        userName().sendKeys(s);
    }
    public void fillPassword(String s){
        password().sendKeys(s);
    }
    public void clickRegisterButton(){
        registerBtn().click();
    }
    public void clickBackToLoginBtn(){
        backToLoginBtn().click();
    }
    public void overrideReCaptcha(){
        WebElement iFrame = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/div/div/iframe"));
        webDriver.switchTo().frame(iFrame);
        WebElement iFrame_checkbox =
                webDriver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
        iFrame_checkbox.click();
    }
    public String getLoginUnsuccessful(){
        return webDriver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
    }


}
