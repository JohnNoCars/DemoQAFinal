package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    public WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public List<WebElement> listOfAllPages(){
        return webDriver.findElements(By.className("card-body"));
    }

    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void clickElements(){
        scrollIntoView(listOfAllPages().get(0));
        listOfAllPages().get(0).click();
    }

    public void clickForms(){
        scrollIntoView(listOfAllPages().get(1));
        listOfAllPages().get(1).click();
    }

    public void clickAlerts(){
        scrollIntoView(listOfAllPages().get(2));
        listOfAllPages().get(2).click();
    }

    public void clickWidgets(){
        scrollIntoView(listOfAllPages().get(3));
        listOfAllPages().get(3).click();
    }

    public void clickInteractions(){
        scrollIntoView(listOfAllPages().get(4));
        listOfAllPages().get(4).click();
    }

}
