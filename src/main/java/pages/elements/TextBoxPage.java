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
        wdWait = new WebDriverWait(webDriver, 10);

    }
    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public WebElement fullName(){
        return webDriver.findElement(By.id("userName"));
    }

    public WebElement email(){
        return webDriver.findElement(By.id("userEmail"));
    }

    public WebElement currentAddress(){
        return webDriver.findElement(By.id("currentAddress"));
    }

    public WebElement permanentAddress(){
        return webDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement submitBtn(){
        return webDriver.findElement(By.id("submit"));
    }

    public void clickSubmit(){
        scrollIntoView(submitBtn());
        submitBtn().click();
    }

    public WebElement outputTxt(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]"));
    }

    public String getOutput(){
        return outputTxt().getText();
    }

    public WebElement getFieldError(){
        return webDriver.findElement(By.className("mr-sm-2 field-error form-control"));
    }


}
