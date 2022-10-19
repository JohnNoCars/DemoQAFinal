package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import pages.bookStoreApplication.LoginPage;
import pages.bookStoreApplication.ProfilePage;
import pages.bookStoreApplication.RegistrationPage;
import pages.elements.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

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
    public ProfilePage profilePage;
    public RegistrationPage registrationPage;
    public LoginPage loginPage;

    @BeforeClass
    public void setUpConfig() throws IOException {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        excelReader = new ExcelReader("DemoQAProject.xlsx");
        homeURL = excelReader.getStringData("URL", 1, 0);
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
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
        profilePage = new ProfilePage(webDriver);
        registrationPage = new RegistrationPage(webDriver);
        loginPage = new LoginPage(webDriver);

    }

    public void visibilityWait(WebElement webElement){
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForElementClickability(WebElement webElement){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void scroll(WebElement webElement){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void click(WebElement webElement){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", webElement);
    }
    public void removeElement(WebElement webElement){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.visibility = 'hidden'", webElement);
    }

    public void inputText(WebElement webElement, String string) {
        webElement.sendKeys(string);
    }
    public void switchTab() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }
    public void closeTab() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    public void zoomIn(int zoomInTimes) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < zoomInTimes; i++) {

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

    }
    public void zoomOut(int zoomOutTimes) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < zoomOutTimes; i++) {

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
    }
    public WebElement ad(){
        return webDriver.findElement(By.xpath("//*[@id=\"fixedban\"]"));
    }

   @AfterClass
    public void endTests(){
        webDriver.close();
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cmd.exe","taskkill /F /IM chromedriver.exe");

    }
}
