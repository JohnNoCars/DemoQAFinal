package tests;

import base.BasePage;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePage {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickRadioBtn();
    }

    @Test
    public void userCanSelectYes(){
        click(radioButtonPage.yesBtn());
        Assert.assertEquals(excelReader.getStringData("RadioButton",1,0),radioButtonPage.radioBtnSelectedText());
    }

    @Test
    public void userCanSelectImpressive(){
        click(radioButtonPage.impressiveBtn());
        Assert.assertEquals(excelReader.getStringData("RadioButton",2,0),radioButtonPage.radioBtnSelectedText());
    }
    @Test
    public void userCannotSelectNo(){
        click(radioButtonPage.noBtn());
        Assert.assertFalse(radioButtonPage.noBtn().isSelected());
    }
}