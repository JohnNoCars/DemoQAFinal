package tests.elementsTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @DataProvider (name = "validEntry")
    public Object[][] oneUser(){
        return new Object[][] {
                {"John", "Nocars", "johnnocars@gmail.com", "23", "234555", "Marketing"}
        };
    }


    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickWebTables();

    }

    @Test(dataProvider = "validEntry")
    public void userCanAddInformation(String firstName, String lastName, String email, String age, String salary, String department){
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        Assert.assertEquals(excelReader.getStringData("WebTables",1,6),webTablesPage.getRowDetails(3));

    }
    @Test
    public void userCanChangeNumberOfRows(){
        webTablesPage.selectNumberRows(5);
        Assert.assertEquals(5,webTablesPage.listOfAllRows().size());

    }

    @Test(dataProvider = "validEntry")
    public void userCanAddMultipleEntries(String firstName, String lastName, String email, String age, String salary, String department){
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        //there are three existing entries. Ergo, 8 is the total of entries once five more are added.
        Assert.assertEquals(8, webTablesPage.listOfAllRows().size());

    }

    @Test(dataProvider = "validEntry")
    public void userCanClickNext(String firstName, String lastName, String email, String age, String salary, String department){
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.selectNumberRows(5);
        webTablesPage.clickNxtBtn();
        Assert.assertTrue(webTablesPage.previousBtn().isEnabled());
    }
    @Test(dataProvider = "validEntry")
    public void userCanClickPrevious(String firstName, String lastName, String email, String age, String salary, String department){
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.selectNumberRows(5);
        webTablesPage.clickNxtBtn();
        webTablesPage.clickPrevBtn();
        Assert.assertTrue(webTablesPage.nextBtn().isEnabled());
    }

    @Test(dataProvider = "validEntry")
    public void userCanSearch(String firstName, String lastName, String email, String age, String salary, String department){
        webTablesPage.clickAddRecord();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.fillLastName(lastName);
        webTablesPage.fillEmail(email);
        webTablesPage.fillAge(age);
        webTablesPage.fillSalary(salary);
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        webTablesPage.searchTable(firstName);
        Assert.assertEquals(excelReader.getStringData("WebTables",1,6), webTablesPage.getRowDetails(0));
    }

    @Test(dataProvider = "validEntry")
    public void userCanEditEntry(String firstName, String lastName, String email, String age, String salary, String department){
        webTablesPage.clickEditBtn(1);
        visibilityWait(webTablesPage.firstName());
        //webTablesPage.clearBox();
        webTablesPage.firstName().clear();
        webTablesPage.fillFirstName(firstName);
        webTablesPage.lastName().clear();
        webTablesPage.fillLastName(lastName);
        webTablesPage.email().clear();
        webTablesPage.fillEmail(email);
        webTablesPage.age().clear();
        webTablesPage.fillAge(age);
        webTablesPage.salary().clear();
        webTablesPage.fillSalary(salary);
        webTablesPage.department().clear();
        webTablesPage.fillDepartment(department);
        webTablesPage.clickSubmitBtn();
        Assert.assertEquals(excelReader.getStringData("WebTables",1,6), webTablesPage.getRowDetails(0));
    }

    @Test
    public void userCanDeleteEntry(){
        String firstRow = webTablesPage.getRowDetails(0);
        webTablesPage.clickDeleteBtn(1);
        String firstRow1 = webTablesPage.getRowDetails(0);
        Assert.assertNotEquals(firstRow,firstRow1);
    }
}
