package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {

    public WebDriver webDriver;

    public LinksPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }
    public WebElement getHomeLink(){
        return webDriver.findElement(By.id("simpleLink"));
    }
    public WebElement getHomeDynamicLink(){
        return webDriver.findElement(By.id("dynamicLink"));
    }
    public WebElement getCreatedLink(){
        return webDriver.findElement(By.id("created"));
    }
    public WebElement getNoContentLink(){
        return webDriver.findElement(By.id("no-content"));
    }
    public WebElement getMovedLink(){
        return webDriver.findElement(By.id("moved"));
    }
    public WebElement getBadRequestLink(){
        return webDriver.findElement(By.id("bad-request"));
    }
    public WebElement getUnauthorizedLink(){
        return webDriver.findElement(By.id("unauthorized"));
    }
    public WebElement getForbiddenLink(){
        return webDriver.findElement(By.id("forbidden"));
    }
    public WebElement getNotFoundLink(){
        return webDriver.findElement(By.id("invalid-url"));
    }
    //----------------------------------------------------------------------------------------
    public void clickHomeLink(){
        getHomeLink().click();
    }
    public void clickDynamicLink(){
        getHomeDynamicLink().click();
    }
    public void clickCreatedLink(){
        getCreatedLink().click();
    }
    public void clickNoContentLink(){
        getNoContentLink().click();
    }
    public void clickMovedLink(){
        getMovedLink().click();
    }
    public void clickBadRequestLink(){
        getBadRequestLink().click();
    }
    public void clickUnauthorizedLink(){
        getUnauthorizedLink().click();
    }
    public void clickForbiddenLink(){
        getForbiddenLink().click();
    }
    public void clickNotFoundLink(){
        getNotFoundLink().click();
    }
    public String getLinkResponse(){
        return webDriver.findElement(By.id("linkResponse")).getText();
    }
}
