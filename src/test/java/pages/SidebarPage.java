package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SidebarPage {
    public WebDriver webDriver;
    public WebDriverWait webDriverWait;

    public SidebarPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }
    public WebElement textBoxSide(){
        return webDriver.findElement(By.id("item-0"));
    }
    public WebElement checkBoxSide(){
        return webDriver.findElement(By.id("item-1"));
    }
    public WebElement radioBtnSide(){
        return webDriver.findElement(By.id("item-2"));
    }
    public WebElement webTablesSide(){
        return webDriver.findElement(By.id("item-3"));
    }
    public WebElement btnSide(){
        return webDriver.findElement(By.id("item-4"));
    }
    public WebElement linksSide(){
        return webDriver.findElement(By.id("item-5"));
    }
    public WebElement brokenLinksSide(){
        return webDriver.findElement(By.id("item-6"));
    }
    public WebElement uploadNDownloadSide(){
        return webDriver.findElement(By.id("item-7"));
    }
    public WebElement dynamicPropertiesSide(){
        return webDriver.findElement(By.id("item-8"));
    }
    public WebElement practiceFormSide(){
        return webDriver.findElement(By.id("item-0"));
    }
    public WebElement browserWindowsSide(){
        return webDriver.findElement(By.id("item-0"));
    }
    public WebElement alertsSide(){
        return webDriver.findElement(By.id("item-1"));
    }
    public WebElement framesSide(){
        return webDriver.findElement(By.id("item-2"));
    }
    public WebElement nestedFramesSide(){
        return webDriver.findElement(By.id("item-3"));
    }
    public WebElement modalDialogsSide(){
        return webDriver.findElement(By.id("item-4"));
    }
    public WebElement login(){
        return webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]"));
    }
    public WebElement bookStoreAPI(){
        return webDriver.findElement(By.id("item-4"));
    }
    public WebElement profile(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[3]"));
    }
    public WebElement bookStore(){
        return webDriver.findElement(By.id("item-2"));
    }

    //---------------------------------------------------------------------
    public void clickTextBox(){
        textBoxSide().click();
    }
    public void clickCheckBox(){
        checkBoxSide().click();
    }
    public void clickRadioBtn(){
        radioBtnSide().click();
    }
    public void clickWebTables(){
        webTablesSide().click();
    }
    public void clickButtons(){
        btnSide().click();
    }
    public void clickLinks(){
        linksSide().click();
    }
    public void clickBrokenLinks(){
        brokenLinksSide().click();
    }
    public void clickUploadNDownload(){
        uploadNDownloadSide().click();
    }
    public void clickDynamicProperties(){
        dynamicPropertiesSide().click();
    }
    public void clickPracticeForm(){
        practiceFormSide().click();
    }
    public void clickLogin(){
        login().click();
    }
    public void clickBookStore(){
        bookStore().click();
    }
    public void clickProfile(){
        profile().click();
    }
    public void clickBookStoreAPI(){
        bookStoreAPI().click();
    }


}
