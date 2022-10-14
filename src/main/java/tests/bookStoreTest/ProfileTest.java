package tests.bookStoreTest;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class ProfileTest extends BasePage {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickBookStoreApplication();


    }
    @Test
    public void userCanClickRegister() {
        scroll(sidebarPage.profile());
        sidebarPage.clickProfile();
        profilePage.clickRegister();
    }
    @Test
    public void userCanLogIn(){
        scroll(sidebarPage.login());
        sidebarPage.clickLogin();
        loginPage.fillUsername(excelReader.getStringData("BookStoreLogin",1,0));
        loginPage.fillPassword(excelReader.getStringData("BookStoreLogin",1,1));
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.profilePage().isDisplayed());

    }

}
