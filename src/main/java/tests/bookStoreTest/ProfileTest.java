package tests.bookStoreTest;

import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class ProfileTest extends BasePage {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickBookStoreApplication();
        scroll(sidebarPage.profile());
        sidebarPage.clickProfile();

    }
    @Test
    public void userCanClickRegister() {
        profilePage.clickRegister();
    }

}
