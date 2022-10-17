package tests.bookStoreTest;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BasePage {
    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickBookStoreApplication();
        removeElement(ad());
        scroll(sidebarPage.profile());
        sidebarPage.clickProfile();
        visibilityWait(profilePage.register());
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
