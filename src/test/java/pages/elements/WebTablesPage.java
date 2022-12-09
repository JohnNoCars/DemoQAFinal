package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public WebElement getAddRecordButton(){
        return webDriver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstName(){
        return webDriver.findElement(By.id("firstName"));
    }

    public WebElement getLastName(){
        return webDriver.findElement(By.id("lastName"));
    }

    public WebElement getEmail(){
        return webDriver.findElement(By.id("userEmail"));
    }

    public WebElement getAge(){
        return webDriver.findElement(By.id("age"));
    }

    public WebElement getSalary(){
        return webDriver.findElement(By.id("salary"));
    }

    public WebElement getDepartment(){
        return webDriver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton(){
        return webDriver.findElement(By.id("submit"));
    }

    public WebElement deleteBtn(int rowNum){
        return  webDriver.findElement(By.cssSelector("delete-record-" + rowNum));
    }
    public List<WebElement> listOfAllRows(){
        return webDriver.findElements(By.className("rt-tr-group"));
    }
    public WebElement editBtn(int rowNum){
        return  webDriver.findElement(By.id("edit-record-" + rowNum));
    }

    public WebElement getTableRow(int index){
        return listOfAllRows().get(index);
    }
    public WebElement searchBox(){
        return  webDriver.findElement(By.id("searchBox"));
    }

    public WebElement displayedRows(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
    }

    public WebElement nextBtn(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[3]/button[1]"));
    }

    public WebElement previousBtn(){
        return webDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]"));
    }
    //-----------------------------------------------------------------------------------------------------------------------------

    public void clickDeleteBtn(int rowNum){
        deleteBtn(rowNum).click();
    }

    public void clickAddRecord(){
        getAddRecordButton().click();
    }

    public void clickEditBtn(int rowNum){
        editBtn(rowNum).click();
    }

    public void fillFirstName(String s){
        getFirstName().sendKeys(s);
    }

    public void clearBox(){
        getFirstName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getFirstName().sendKeys(Keys.DELETE);
        getLastName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getLastName().sendKeys(Keys.DELETE);
        getEmail().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getEmail().sendKeys(Keys.DELETE);
        getAge().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getAge().sendKeys(Keys.DELETE);
        getSalary().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getSalary().sendKeys(Keys.DELETE);
        getDepartment().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getDepartment().sendKeys(Keys.DELETE);

    }

    public void fillLastName(String s){
        getLastName().sendKeys(s);
    }

    public void fillEmail(String s){
        getEmail().sendKeys(s);
    }

    public void fillAge(String s){
        getAge().sendKeys(s);
    }

    public void fillSalary(String s){
        getSalary().sendKeys(s);
    }

    public void fillDepartment(String s){
        getDepartment().sendKeys(s);
    }

    public void clickSubmitBtn(){
        getSubmitButton().click();
    }

    public String getRowDetails(int index){
        return getTableRow(index).getText();
    }

    public void searchTable(String s){
        searchBox().sendKeys(s);
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

    public void clickNxtBtn(){
        nextBtn().click();
    }

    public void clickPrevBtn(){
        previousBtn().click();
    }
}
