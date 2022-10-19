package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxPage {
    public WebDriver webDriver;
    public WebDriverWait wdWait;


    public CheckBoxPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wdWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void scrollIntoView(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }


    public WebElement expandAllElements(){
       return webDriver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }

    public WebElement collapseAllElements(){
        return webDriver.findElement(By.cssSelector(".rct-icon.rct-icon-collapse-all"));
    }

    public void expandAllFolders(){
        expandAllElements().click();
    }

    public void collapseAllFolders(){
        collapseAllElements().click();
    }

    public List<WebElement> allCheckBoxes(){
        return webDriver.findElements(By.className("rct-checkbox"));
    }

    public void clickHomeCheckbox(){
        scrollIntoView(allCheckBoxes().get(0));
        allCheckBoxes().get(0).click();
    }

    public WebElement homeCheckbox(){
        return allCheckBoxes().get(0);
    }
    public void clickDesktopCheckbox(){
        scrollIntoView(allCheckBoxes().get(1));
        allCheckBoxes().get(1).click();

    }
    public WebElement desktopCheckbox(){
        return allCheckBoxes().get(1);
    }
    public void clickNotesCheckbox(){
        scrollIntoView(allCheckBoxes().get(2));
        allCheckBoxes().get(2).click();

    }
    public WebElement notesCheckbox(){
        return allCheckBoxes().get(2);
    }
    public void clickCommandsCheckbox(){
        scrollIntoView(allCheckBoxes().get(3));
        allCheckBoxes().get(3).click();
    }
    public WebElement commandCheckbox(){
        return allCheckBoxes().get(3);
    }
    public void clickDocumentsCheckbox(){
        scrollIntoView(allCheckBoxes().get(4));
        allCheckBoxes().get(4).click();
    }
    public WebElement documentsCheckbox(){
        return allCheckBoxes().get(4);
    }
    public void clickWorkSpaceCheckbox(){
        scrollIntoView(allCheckBoxes().get(5));
        allCheckBoxes().get(5).click();
    }
    public WebElement workspaceCheckbox(){
        return allCheckBoxes().get(5);
    }
    public void clickReactCheckbox(){
        scrollIntoView(allCheckBoxes().get(6));
        allCheckBoxes().get(6).click();
    }
    public WebElement reactCheckbox(){
        return allCheckBoxes().get(6);
    }
    public void clickAngularCheckbox(){
        scrollIntoView(allCheckBoxes().get(7));
        allCheckBoxes().get(7).click();
    }
    public WebElement angularCheckbox(){
        return allCheckBoxes().get(7);
    }
    public void clickVeuCheckbox(){
        scrollIntoView(allCheckBoxes().get(8));
        allCheckBoxes().get(8).click();
    }
    public WebElement veuCheckbox(){
        return allCheckBoxes().get(8);
    }
    public void clickOfficeCheckbox(){
        scrollIntoView(allCheckBoxes().get(9));
        allCheckBoxes().get(9).click();
    }
    public WebElement officeCheckbox(){
        return allCheckBoxes().get(9);
    }
    public void clickPublicCheckbox(){
        scrollIntoView(allCheckBoxes().get(10));
        allCheckBoxes().get(10).click();
    }
    public WebElement publicCheckbox(){
        return allCheckBoxes().get(10);
    }
    public void clickPrivateCheckbox(){
        scrollIntoView(allCheckBoxes().get(11));
        allCheckBoxes().get(11).click();
    }
    public WebElement privateCheckbox(){
        return allCheckBoxes().get(11);
    }
    public void clickClassifiedCheckbox(){
        scrollIntoView(allCheckBoxes().get(12));
        allCheckBoxes().get(12).click();
    }
    public WebElement classifiedCheckbox(){
        return allCheckBoxes().get(12);
    }
    public void clickGeneralCheckbox(){
        scrollIntoView(allCheckBoxes().get(13));
        allCheckBoxes().get(13).click();
    }
    public WebElement generalCheckbox(){
        return allCheckBoxes().get(13);
    }
    public void clickDownloadsCheckbox(){
        scrollIntoView(allCheckBoxes().get(14));
        allCheckBoxes().get(14).click();
    }
    public WebElement downloadsCheckbox(){
        return allCheckBoxes().get(14);
    }
    public void clickWordFileCheckbox(){
        scrollIntoView(allCheckBoxes().get(15));
        allCheckBoxes().get(15).click();
    }
    public WebElement wordFileCheckbox(){
        return allCheckBoxes().get(15);
    }
    public void clickExcelFileCheckbox(){
        scrollIntoView(allCheckBoxes().get(16));
        allCheckBoxes().get(16).click();
    }
    public WebElement excelFileCheckbox(){
        return allCheckBoxes().get(16);
    }
    public void collapseAllCheckboxes(){
        webDriver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all > svg > path")).click();
    }

    public void clickSpecificCheckbox(int i){
        scrollIntoView(allCheckBoxes().get(i));
        allCheckBoxes().get(i).click();
    }

    public List<WebElement> getTextSuccessElements(){
        return webDriver.findElements(By.className("text-success"));
    }

    public String getTextSuccessMessage(){
        String s = "";
        for(int i = 0; i<getTextSuccessElements().size(); i++){

            s += " " + getTextSuccessElements().get(i).getText();
        }
        return s;
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        webDriver.get("https://demoqa.com/checkbox");
        CheckBoxPage checkBoxPage = new CheckBoxPage(webDriver);

        for(int i = 0; i<checkBoxPage.allCheckBoxes().size(); i++) {

            checkBoxPage.clickSpecificCheckbox(i);
        }

        System.out.println(checkBoxPage.getTextSuccessMessage());
    }

}
