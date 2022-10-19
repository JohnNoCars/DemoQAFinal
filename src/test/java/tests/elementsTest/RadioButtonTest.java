package tests.elementsTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickRadioBtn();
    }

    @Test
    public void userCanSelectYes(){
        click(radioButtonPage.getYesButton());
        Assert.assertEquals(excelReader.getStringData("RadioButton",1,0),radioButtonPage.radioBtnSelectedText());
    }

    @Test
    public void userCanSelectImpressive(){
        click(radioButtonPage.getImpressiveButton());
        Assert.assertEquals(excelReader.getStringData("RadioButton",2,0),radioButtonPage.radioBtnSelectedText());
    }
    @Test
    public void userCannotSelectNo(){
        click(radioButtonPage.getNoButton());
        Assert.assertFalse(radioButtonPage.getNoButton().isSelected());
    }
}
