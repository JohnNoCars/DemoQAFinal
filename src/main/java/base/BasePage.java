package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
//import pages.elements.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasePage {

    public WebDriver webDriver;
    public ExcelReader excelReader;
    public String homeURL;
    public WebDriverWait webDriverWait;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinksPage brokenLinksPage;
    public UploadNDownloadPage uploadNDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;

    @BeforeMethod
    public void setUpConfig() throws IOException {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        excelReader = new ExcelReader("DemoQAProject.xlsx");
        homeURL = excelReader.getStringData("URL", 1, 0);
        webDriverWait = new WebDriverWait(webDriver, 10);
        homePage = new HomePage(webDriver);
        textBoxPage = new TextBoxPage(webDriver);
        checkBoxPage = new CheckBoxPage(webDriver);
        radioButtonPage = new RadioButtonPage(webDriver);
        webTablesPage = new WebTablesPage(webDriver);
        buttonsPage = new ButtonsPage(webDriver);
        linksPage = new LinksPage(webDriver);
        brokenLinksPage = new BrokenLinksPage(webDriver);
        uploadNDownloadPage = new UploadNDownloadPage(webDriver);
        dynamicPropertiesPage = new DynamicPropertiesPage(webDriver);
        sidebarPage = new SidebarPage(webDriver);

    }

    public void visibilityWait(WebElement webElement){
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void scroll(WebElement webElement){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void click(WebElement webElement){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", webElement);
    }

    public void inputText(WebElement webElement, String string) {
        webElement.sendKeys(string);
    }

   /* @AfterMethod
    public void endTests(){
        webDriver.close();
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cmd.exe","taskkill /im chromedriver.exe /f");

    }*/
}