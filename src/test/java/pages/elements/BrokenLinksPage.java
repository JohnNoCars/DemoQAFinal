package pages.elements;

import org.openqa.selenium.By;
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

    public WebElement getValidImage(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/img[1]"));
    }

    public WebElement getBrokenImage(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/img[2]"));
    }

    public WebElement getValidLink(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]"));
    }

    public WebElement getBrokenLink(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/a[2]"));
    }

    public void clickValidLink(){
        getValidLink().click();
    }

    public void clickBrokenLink(){
        getBrokenLink().click();
    }

    public String getBrokenLinkMessage(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]")).getText();
    }
}
