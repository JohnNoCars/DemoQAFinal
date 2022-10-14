package pages.bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public WebDriver webDriver;
    @FindBy (xpath = "//*[@id=\"firstname\"]")
    WebElement firstName;
    @FindBy (xpath = "//*[@id=\"lastname\"]")
    WebElement lastName;
    @FindBy (xpath = "//*[@id=\"userName\"]")
    WebElement userName;
    @FindBy (xpath = "//*[@id=\"password\"]")
    WebElement password;
    @FindBy (xpath = "//*[@id=\"register\"]")
    WebElement registerBtn;
    @FindBy (xpath = "//*[@id=\"gotologin\"]")
    WebElement backToLoginBtn;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void fillFirstName(String s){
        firstName.sendKeys(s);
    }
    public void fillLastName(String s){
        lastName.sendKeys(s);
    }
    public void fillUserName(String s){
        userName.sendKeys(s);
    }
    public void fillPassword(String s){
        password.sendKeys(s);
    }
    public void clickRegisterButton(){
        registerBtn.click();
    }
    public void clickBackToLoginBtn(){
        backToLoginBtn.click();
    }
    public void overrideReCaptcha(){
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
    }

}
