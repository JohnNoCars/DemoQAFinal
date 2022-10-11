package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTablesPage {
    public WebDriver webDriver;
    public WebDriverWait webDriverWait;

    public WebTablesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
    }

    public WebElement addRecord(){
        return webDriver.findElement(By.id("addNewRecordButton"));
    }

    public void clickAddRecord(){
        addRecord().click();
    }

    public WebElement firstName(){
        return webDriver.findElement(By.id("firstName"));
    }

    public WebElement lastName(){
        return webDriver.findElement(By.id("lastName"));
    }

    public WebElement email(){
        return webDriver.findElement(By.id("userEmail"));
    }

    public WebElement age(){
        return webDriver.findElement(By.id("age"));
    }

    public WebElement salary(){
        return webDriver.findElement(By.id("salary"));
    }

    public WebElement department(){
        return webDriver.findElement(By.id("department"));
    }

    public WebElement submitBtn(){
        return webDriver.findElement(By.id("submit"));
    }

    public void fillFirstName(String s){
        firstName().sendKeys(s);
    }

    public void fillLastName(String s){
        lastName().sendKeys(s);
    }

    public void fillEmail(String s){
        email().sendKeys(s);
    }

    public void fillAge(String s){
        age().sendKeys(s);
    }

    public void gillSalary(String s){
        salary().sendKeys(s);
    }

    public void gillDepartment(String s){
        department().sendKeys(s);
    }

    public void clickSubmitBtn(){
        submitBtn().click();
    }

    public List<WebElement> listOfAllRows(){
        return webDriver.findElements(By.className("rt-tr-group"));
    }

    public WebElement getTableRow(int index){
        return listOfAllRows().get(index);
    }

    public String getRowDetails(int index){
        return getTableRow(index).getText();
    }

    public WebElement searchBox(){
        return  webDriver.findElement(By.id("searchBox"));
    }

    public void searchTable(String s){
        searchBox().sendKeys(s);
    }

    public WebElement displayedRows(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
    }

    public void selectNumberRows(int i){
        /**
         * The selected number of Rows must be one of these values:
         * 5, 10, 20, 25, 50, 100
         */
        displayedRows().click();
        Select select = new Select(displayedRows());
        select.selectByValue(String.valueOf(i));
    }

    public WebElement nextBtn(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[3]/button[1]"));
    }

    public WebElement previousBtn(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]"));
    }

    public void clickNxtBtn(){
        nextBtn().click();
    }

    public void clickPrevBtn(){
        previousBtn().click();
    }
}
