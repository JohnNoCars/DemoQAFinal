package tests.elementsTest;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickButtons();

    }
    @Test(priority = 10)
    public void doubleClick(){
        scrollIntoView(buttonsPage.getDoubleClickButton());
        buttonsPage.clickDoubleClick();
        Assert.assertEquals(excelReader.getStringData("Buttons",1,0), buttonsPage.getDCMessage());

    }

    @Test(priority = 20)
    public void rightClick(){
        scrollIntoView(buttonsPage.getRightClickButton());
        buttonsPage.clickRightClick();
        Assert.assertEquals(excelReader.getStringData("Buttons",1,1), buttonsPage.getRCMessage());

    }

    @Test(priority = 30)
    public void dynamicClick(){
        scrollIntoView(buttonsPage.getClickMeButton());
        buttonsPage.clickClickMe();
        Assert.assertEquals(excelReader.getStringData("Buttons",1,2), buttonsPage.getCMMessage());

    }
}
