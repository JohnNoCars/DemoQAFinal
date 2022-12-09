package tests.bookStoreTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickBookStoreApplication();


    }
    @Test
    public void userCanClickRegister() {
        scrollIntoView(sidebarPage.profile());
        sidebarPage.clickProfile();
        profilePage.clickRegister();
    }
    @Test
    public void userCanLogIn() throws InterruptedException {
        scrollIntoView(sidebarPage.login());
        sidebarPage.clickLogin();
        loginPage.getUserName().clear();
        loginPage.fillUsername(excelReader.getStringData("BookStoreLogin",1,0));
        loginPage.getPassword();
        loginPage.fillPassword(excelReader.getStringData("BookStoreLogin",1,1));
        loginPage.clickLoginBtn();
        Thread.sleep(2000);
        visibilityWait(profilePage.getProfilePageTitle());
        Assert.assertTrue(profilePage.getProfilePageTitle().isDisplayed());
        visibilityWait(profilePage.getLogoutButton());
        Assert.assertEquals(profilePage.getUsernameValue().getText(), excelReader.getStringData("BookStoreLogin",1,0));

    }


}
