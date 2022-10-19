package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadNDownloadPage {

    public WebDriver webDriver;

    public UploadNDownloadPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getDownloadButton(){
        return webDriver.findElement(By.id("downloadButton"));
    }

    public WebElement getChooseFileButton(){
        return webDriver.findElement(By.id("uploadFile"));
    }

    public void clickDownload(){
        getDownloadButton().click();
    }

    public void chooseFile(String filePath){
        getChooseFileButton().sendKeys(filePath);
    }

    public String getChooseFileMessage(){
        return webDriver.findElement(By.id("uploadedFilePath")).getText();
    }
}
