package tests.formsTest;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickForms();
        sidebarPage.clickPracticeForm();

    }

    @Test(priority = 10)
    public void userCanSubmitForm(){

    }
}
