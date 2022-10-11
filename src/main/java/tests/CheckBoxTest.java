package tests;

import base.BasePage;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();

    }

    @Test
    public void userCanExpandAllCheckBoxes(){
        sidebarPage.clickCheckBox();
        visibilityWait(checkBoxPage.expandAllElements());
        int checkBoxNum = checkBoxPage.allCheckBoxes().size();
        checkBoxPage.expandAllFolders();
        int checkBoxNumAfter = checkBoxPage.allCheckBoxes().size();

        Assert.assertNotEquals(checkBoxNum,checkBoxNumAfter);
    }

    @Test
    public void userCanCheckAllCheckBoxes(){
        sidebarPage.clickCheckBox();
        visibilityWait(checkBoxPage.expandAllElements());
        checkBoxPage.expandAllFolders();
        int size = checkBoxPage.allCheckBoxes().size();
        for(int i = 0; i < size; i++) {
            checkBoxPage.clickSpecificCheckbox(i);
        }
    }

}
