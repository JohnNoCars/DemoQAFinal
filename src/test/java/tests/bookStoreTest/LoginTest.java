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
    public void userCannotLoginWithInvalidCredentials() throws InterruptedException {
        scrollIntoView(sidebarPage.login());
        sidebarPage.clickLogin();
        for(int i = 1; i<=excelReader.getLastRow("BookStoreInvalidLogin"); i++) {
            String username = excelReader.getStringData("BookStoreInvalidLogin", i, 0);
            String password = excelReader.getStringData("BookStoreInvalidLogin", i, 1);
            loginPage.getUserName().clear();
            loginPage.fillUsername(username);
            loginPage.getPassword().clear();
            loginPage.fillPassword(password);
            loginPage.clickLoginBtn();
            Thread.sleep(1000);
            visibilityWait(loginPage.getInvalidUsernameOrPasswordNotification());
            Assert.assertEquals(loginPage.getErrorMessage(), excelReader.getStringData("BookStoreInvalidLogin",1,2));
            Assert.assertTrue(loginPage.getLoginBtn().isDisplayed());
            Assert.assertTrue(loginPage.getNewUserBtn().isDisplayed());

        }
    }
    @Test
    public void userCannotLoginWithBlankUsername(){
        scrollIntoView(sidebarPage.login());
        sidebarPage.clickLogin();
        loginPage.getUserName().clear();
        loginPage.getPassword().clear();
        loginPage.fillPassword(excelReader.getStringData("BookStoreLogin",1,1));
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getBlankCredentialError().isDisplayed());
        Assert.assertTrue(loginPage.getLoginBtn().isDisplayed());
        Assert.assertTrue(loginPage.getNewUserBtn().isDisplayed());

    }

    @Test
    public void userCannotLoginWithBlankPassword(){
        scrollIntoView(sidebarPage.login());
        sidebarPage.clickLogin();
        loginPage.getUserName().clear();
        loginPage.fillUsername(excelReader.getStringData("BookStoreLogin",1,0));
        loginPage.getPassword().clear();
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getBlankCredentialError().isDisplayed());
        Assert.assertTrue(loginPage.getLoginBtn().isDisplayed());
        Assert.assertTrue(loginPage.getNewUserBtn().isDisplayed());

    }
    @Test
    public void userCannotLoginWithBlankCredentials(){
        scrollIntoView(sidebarPage.login());
        sidebarPage.clickLogin();
        loginPage.getUserName().clear();
        loginPage.getPassword().clear();
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getBlankCredentialError().isDisplayed());
        Assert.assertTrue(loginPage.getLoginBtn().isDisplayed());
        Assert.assertTrue(loginPage.getNewUserBtn().isDisplayed());

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
