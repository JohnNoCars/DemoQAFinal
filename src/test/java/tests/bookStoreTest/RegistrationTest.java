package tests.bookStoreTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickBookStoreApplication();
        removeElement(ad());
        scrollIntoView(sidebarPage.profile());
        sidebarPage.clickProfile();
        visibilityWait(profilePage.getRegisterLink());
        profilePage.clickRegister();

    }
    @Test
    public void webDriverCannotRegister(){
        registrationPage.fillFirstName(excelReader.getStringData("BookStoreRegister",1,0));
        registrationPage.fillLastName(excelReader.getStringData("BookStoreRegister",1,1));
        registrationPage.fillUserName(excelReader.getStringData("BookStoreRegister",1,2));
        registrationPage.fillPassword(excelReader.getStringData("BookStoreRegister",1,3));
        registrationPage.clickRegisterButton();
        Assert.assertEquals(excelReader.getStringData("BookStoreRegister",1,4),registrationPage.getRegistrationUnsuccessful());
    }
}
