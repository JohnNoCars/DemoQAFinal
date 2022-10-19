package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBoxPage {
    public WebDriver webDriver;
    public WebDriverWait wdWait;

    public TextBoxPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wdWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

    }
    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public WebElement getFullName(){
        return webDriver.findElement(By.id("userName"));
    }

    public WebElement getEmail(){
        return webDriver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress(){
        return webDriver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress(){
        return webDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton(){
        return webDriver.findElement(By.id("submit"));
    }

    public WebElement getOutputText(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]"));
    }

    public WebElement getFieldError(){
        return webDriver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
    }

    public void clickSubmit(){
        scrollIntoView(getSubmitButton());
        getSubmitButton().click();
    }

    public String getOutput(){
        return getOutputText().getText();
    }


}
