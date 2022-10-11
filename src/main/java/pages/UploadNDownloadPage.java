package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadNDownloadPage {

    public WebDriver webDriver;

    public UploadNDownloadPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement downloadBtn(){
        return webDriver.findElement(By.id("downloadButton"));
    }

    public WebElement chooseFileBtn(){
        return webDriver.findElement(By.id("uploadFile"));
    }

    public void clickDownload(){
        downloadBtn().click();
    }

    public void chooseFile(String filePath){
        chooseFileBtn().sendKeys(filePath);
    }

    public String getChooseFileMessage(){
        return webDriver.findElement(By.id("uploadedFilePath")).getText();
    }
}
