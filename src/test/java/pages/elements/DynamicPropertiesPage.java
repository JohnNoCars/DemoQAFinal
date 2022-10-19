package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPropertiesPage {

    public WebDriver webDriver;
    public WebDriverWait wdWait;

    public DynamicPropertiesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wdWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public WebElement getEnableAfter(){
        return webDriver.findElement(By.id("enableAfter"));
    }

    public WebElement getColorChange(){
        return webDriver.findElement(By.id("colorChange"));
    }

    public WebElement getVisibleAfter(){
        return webDriver.findElement(By.id("visibleAfter"));
    }

    //--------------------------------------------------------------------------------------------

    public String changedColor(){
        return getColorChange().getText();
    }
}
