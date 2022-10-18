package tests.elementsTest;


import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickButtons();

    }
    @Test
    public void doubleClick(){
        scroll(buttonsPage.doubleClickBtn());
        buttonsPage.clickDoubleClick();
        Assert.assertEquals(excelReader.getStringData("Buttons",1,0), buttonsPage.getDCMessage());

    }

    @Test
    public void rightClick(){
        scroll(buttonsPage.rightClickBtn());
        buttonsPage.clickRightClick();
        Assert.assertEquals(excelReader.getStringData("Buttons",1,1), buttonsPage.getRCMessage());

    }

    @Test
    public void dynamicClick(){
        scroll(buttonsPage.clickMeBtn());
        buttonsPage.clickClickMe();
        Assert.assertEquals(excelReader.getStringData("Buttons",1,2), buttonsPage.getCMMessage());

    }
}
