package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {

    public WebDriver webDriver;

    public ButtonsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement doubleClickBtn(){
        return webDriver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement rightClickBtn(){
        return webDriver.findElement(By.id("rightClickBtn"));
    }

    public WebElement clickMeBtn(){
        return webDriver.findElement(By.id("fSkUX"));
    }

    public void clickDoubleClick(){
        Actions action = new Actions(webDriver);
        action.doubleClick(doubleClickBtn()).perform();
    }

    public void clickRightClick(){
        Actions action = new Actions(webDriver);
        action.contextClick(rightClickBtn()).perform();
    }

    public void clickClickMe(){
        clickMeBtn().click();
    }

    public String getDCMessage(){
        return webDriver.findElement(By.id("doubleClickMessage")).getText();
    }

    public String getRCMessage(){
        return webDriver.findElement(By.id("rightClickMessage")).getText();
    }

    public String getCMMessage(){
        return webDriver.findElement(By.id("dynamicClickMessage")).getText();
    }




}
