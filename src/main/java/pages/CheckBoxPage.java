package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage {
    public WebDriver webDriver;
    public WebDriverWait wdWait;


    public CheckBoxPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wdWait = new WebDriverWait(webDriver, 10);
    }

    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }


    public WebElement expandAllElements(){
       return webDriver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all > svg"));
    }

    public void expandAllFolders(){
        expandAllElements().click();
    }

    public List<WebElement> allCheckBoxes(){
        return webDriver.findElements(By.className("rct-checkbox"));
    }

    public void clickHomeCheckbox(){
        scrollIntoView(allCheckBoxes().get(0));
        allCheckBoxes().get(0).click();
    }
    public void clickDesktopCheckbox(){
        scrollIntoView(allCheckBoxes().get(1));
        allCheckBoxes().get(1).click();

    }
    public void clickNotesCheckbox(){
        scrollIntoView(allCheckBoxes().get(2));
        allCheckBoxes().get(2).click();

    }
    public void clickCommandsCheckbox(){
        scrollIntoView(allCheckBoxes().get(3));
        allCheckBoxes().get(3).click();
    }
    public void clickDocumentsCheckbox(){
        scrollIntoView(allCheckBoxes().get(4));
        allCheckBoxes().get(4).click();
    }
    public void clickWorkSpaceCheckbox(){
        scrollIntoView(allCheckBoxes().get(5));
        allCheckBoxes().get(5).click();
    }
    public void clickReactCheckbox(){
        scrollIntoView(allCheckBoxes().get(6));
        allCheckBoxes().get(6).click();
    }
    public void clickAngularCheckbox(){
        scrollIntoView(allCheckBoxes().get(7));
        allCheckBoxes().get(7).click();
    }
    public void clickVeuCheckbox(){
        scrollIntoView(allCheckBoxes().get(8));
        allCheckBoxes().get(8).click();
    }
    public void clickOfficeCheckbox(){
        scrollIntoView(allCheckBoxes().get(9));
        allCheckBoxes().get(9).click();
    }
    public void clickPublicCheckbox(){
        scrollIntoView(allCheckBoxes().get(10));
        allCheckBoxes().get(10).click();
    }
    public void clickPrivateCheckbox(){
        scrollIntoView(allCheckBoxes().get(11));
        allCheckBoxes().get(11).click();
    }
    public void clickClassifiedCheckbox(){
        scrollIntoView(allCheckBoxes().get(12));
        allCheckBoxes().get(12).click();
    }
    public void clickGeneralCheckbox(){
        scrollIntoView(allCheckBoxes().get(13));
        allCheckBoxes().get(13).click();
    }
    public void clickDownloadsCheckbox(){
        scrollIntoView(allCheckBoxes().get(14));
        allCheckBoxes().get(14).click();
    }
    public void clickWordFileCheckbox(){
        scrollIntoView(allCheckBoxes().get(15));
        allCheckBoxes().get(15).click();
    }
    public void clickExcelFileCheckbox(){
        scrollIntoView(allCheckBoxes().get(16));
        allCheckBoxes().get(16).click();
    }
    public void collapseAllCheckboxes(){
        webDriver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all > svg > path")).click();
    }

    public void clickSpecificCheckbox(int i){
        scrollIntoView(allCheckBoxes().get(i));
        allCheckBoxes().get(i).click();
    }

    public String getSuccessMessage(){
        return webDriver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all > svg > path")).getText();
    }

}
