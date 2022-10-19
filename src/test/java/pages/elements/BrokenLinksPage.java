package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrokenLinksPage {

    public WebDriver webDriver;
    public WebDriverWait wdWait;

    public BrokenLinksPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wdWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public WebElement validImage(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/img[1]"));
    }

    public WebElement brokenImage(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/img[2]"));
    }

    public WebElement validLink(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]"));
    }

    public WebElement brokenLink(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/a[2]"));
    }

    public void clickValidLink(){
        validLink().click();
    }

    public void clickBrokenLink(){
        brokenLink().click();
    }

    public String getBrokenLink(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]")).getText();
    }

    public String getValidLink(){
        return webDriver.getTitle();
    }
}
