package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v104.indexeddb.model.Key;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class PracticeFormPage {
    public WebDriver webDriver;
    public WebDriverWait webDriverWait;

    public PracticeFormPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
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
    public List<WebElement> getRadioButtonsAndCheckBoxes(){
        return webDriver.findElements(By.cssSelector(".custom-control-label"));
    }
    public WebElement getMobileNumber(){
        return webDriver.findElement(By.id("userNumber"));
    }
    public WebElement getDateOfBirth(){
        return webDriver.findElement(By.id("dateOfBirthInput"));
    }
    public WebElement getPickMonth(){
        return webDriver.findElement(By.cssSelector(".react-datepicker__month-select"));
    }
    public WebElement getPickYear(){
        return webDriver.findElement(By.cssSelector(".react-datepicker__year-select"));
    }
    public WebElement getPickDay(){
        return webDriver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--008') and (not(contains(@class,'outside')))]"));
    }
    public WebElement getSubjects(){
        return webDriver.findElement(By.cssSelector(".subjects-auto-complete__control.css-yk16xz-control"));
    }
    public WebElement getChooseFileButton(){
        return webDriver.findElement(By.id("uploadPicture"));
    }
    public WebElement getCurrentAddress(){
        return webDriver.findElement(By.id("currentAddress"));
    }
    public WebElement getSelectState(){
        return webDriver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
    }
    public WebElement getSelectCity(){
        return webDriver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));
    }
    public WebElement getSubmitButton(){
        return webDriver.findElement(By.id("submit"));
    }
    //------------------------------------------------------------------------------------

    public void inputFirstName(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        getLastName().sendKeys(lastName);
    }
    public void inputEmailAddress(String emailAddress){
        getEmail().sendKeys(emailAddress);
    }
    public void selectGender(String gender){
        for (int i = 0; i<getRadioButtonsAndCheckBoxes().size(); i++){
            if(getRadioButtonsAndCheckBoxes().get(i).getText().equalsIgnoreCase(gender)){
                getRadioButtonsAndCheckBoxes().get(i).click();
                break;
            }
        }
    }
    public void inputMobileNumber(int mobileNumber){
        getMobileNumber().sendKeys(String.valueOf(mobileNumber));
    }
    public void inputDateOfBirth(int birthDay, String birthMonth, int birthYear){
        getPickMonth().click();
        Select selectMonth = new Select(getPickMonth());
        selectMonth.selectByValue(birthMonth);

        getPickYear().click();
        Select selectYear = new Select(getPickYear());
        selectYear.selectByValue(String.valueOf(birthYear));

        Select selectDay = new Select(getPickDay());
        selectDay.selectByValue(String.valueOf(birthDay));

    }
    public void inputSubjects(String... subject){
        getSubjects().sendKeys(subject);
        getSubjects().sendKeys(Keys.ENTER);
    }
    public void inputFileDestination(String filePath){
        getChooseFileButton().sendKeys(filePath);
    }
    public void inputCurrentAddress(String address){
        getCurrentAddress().sendKeys(address);
    }
    public void selectState(String state){
        getSelectState().sendKeys(state);
    }
    public void selectCity(String city){
        getSelectCity().sendKeys(city);
    }
    public void clickSubmitButton(){
        getSubmitButton().click();
    }
}
