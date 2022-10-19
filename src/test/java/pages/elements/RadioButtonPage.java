package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    public WebDriver webDriver;

    public RadioButtonPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getYesButton(){
        return webDriver.findElement(By.id("yesRadio"));
    }

    public WebElement getImpressiveButton(){
        return webDriver.findElement(By.id("impressiveRadio"));
    }

    public WebElement getNoButton(){
        return  webDriver.findElement(By.id("noRadio"));
    }

    public WebElement getSuccessMessage() {
        return webDriver.findElement(By.className("text-success"));
    }
    //---------------------------------------------------------------------------------------------------
    public String radioBtnSelectedText(){
        return getSuccessMessage().getText();
    }
}
