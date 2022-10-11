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

    public List<WebElement> listOfLinks(){
        return webDriver.findElements(By.tagName("a"));
    }
    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void clickHomeLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();

    }

    public void clickHomeccLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }

    public void clickCreatedLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }

    public void clickNoContentLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }

    public void clickMovedLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }

    public void clickBadRequestLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }
    public void clickUnauthorizedLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }
    public void clickForbiddenLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }
    public void clickNotFoundLink(){
        scrollIntoView(listOfLinks().get(0));
        listOfLinks().get(0).click();
    }

    public String getLinkResponse(){
        return webDriver.findElement(By.id("linkResponse")).getText();
    }
}
