package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LinksPage {

    public WebDriver webDriver;

    public LinksPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }
    public WebElement homeLink(){
        return webDriver.findElement(By.id("simpleLink"));
    }
    public WebElement homeDynamicLink(){
        return webDriver.findElement(By.id("dynamicLink"));
    }
    public WebElement createdLink(){
        return webDriver.findElement(By.id("created"));
    }
    public WebElement noContentLink(){
        return webDriver.findElement(By.id("no-content"));
    }
    public WebElement movedLink(){
        return webDriver.findElement(By.id("moved"));
    }
    public WebElement badRequestLink(){
        return webDriver.findElement(By.id("bad-request"));
    }
    public WebElement unauthorizedLink(){
        return webDriver.findElement(By.id("unauthorized"));
    }
    public WebElement forbiddenLink(){
        return webDriver.findElement(By.id("forbidden"));
    }
    public WebElement notFoundLink(){
        return webDriver.findElement(By.id("invalid-url"));
    }
    public void clickHomeLink(){
        homeLink().click();
    }
    public void clickDynamicLink(){
        homeDynamicLink().click();
    }
    public void clickCreatedLink(){
        createdLink().click();
    }
    public void clickNoContentLink(){
        noContentLink().click();
    }
    public void clickMovedLink(){
        movedLink().click();
    }
    public void clickBadRequestLink(){
        badRequestLink().click();
    }
    public void clickUnauthorizedLink(){
        unauthorizedLink().click();
    }
    public void clickForbiddenLink(){
        forbiddenLink().click();
    }
    public void clickNotFoundLink(){
        notFoundLink().click();
    }
    public String getLinkResponse(){
        return webDriver.findElement(By.id("linkResponse")).getText();
    }
}
