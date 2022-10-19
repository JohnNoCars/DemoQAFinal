package tests.elementsTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

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
        checkBoxPage.clickNotesCheckbox();
        checkBoxPage.clickCommandsCheckbox();
        checkBoxPage.clickWorkSpaceCheckbox();
        checkBoxPage.clickOfficeCheckbox();
        checkBoxPage.clickWordFileCheckbox();
        checkBoxPage.clickExcelFileCheckbox();
        //scroll(checkBoxPage.homeCheckbox());
        //Attempt to assert that all checkboxes are checked using .isSelected() method.

       /* Assert.assertTrue(checkBoxPage.homeCheckbox().isSelected()&&checkBoxPage.desktopCheckbox().isSelected()&&
                checkBoxPage.notesCheckbox().isSelected()&&checkBoxPage.commandCheckbox().isSelected()&&checkBoxPage.documentsCheckbox().isSelected()&&
                checkBoxPage.workspaceCheckbox().isSelected()&&checkBoxPage.reactCheckbox().isSelected()&&checkBoxPage.angularCheckbox().isSelected()&&
                checkBoxPage.veuCheckbox().isSelected()&&checkBoxPage.publicCheckbox().isSelected()&&checkBoxPage.privateCheckbox().isSelected()&&
                checkBoxPage.classifiedCheckbox().isSelected()&&checkBoxPage.generalCheckbox().isSelected()&&checkBoxPage.downloadsCheckbox().isSelected()&&
                checkBoxPage.wordFileCheckbox().isSelected()&&checkBoxPage.excelFileCheckbox().isSelected());*/

        Assert.assertEquals(excelReader.getStringData("CheckBox",1,0), checkBoxPage.getTextSuccessMessage());

    }

    @Test
    public void userCanCheckSpecificCheckboxes(){
        sidebarPage.clickCheckBox();
        visibilityWait(checkBoxPage.expandAllElements());
        checkBoxPage.expandAllFolders();
        int size = checkBoxPage.allCheckBoxes().size();
        for(int i = 0; i < size; i++) {
            checkBoxPage.clickSpecificCheckbox(i);
        }

        Assert.assertEquals(excelReader.getStringData("CheckBox", 1, 1), checkBoxPage.getTextSuccessMessage());
    }

    @Test
    public void userCanSelectDeselectCheckbox(){
        sidebarPage.clickCheckBox();
        visibilityWait(checkBoxPage.expandAllElements());
        checkBoxPage.expandAllFolders();
        checkBoxPage.clickCommandsCheckbox();
        Assert.assertEquals(excelReader.getStringData("CheckBox",1,2), checkBoxPage.getTextSuccessMessage());
        checkBoxPage.clickCommandsCheckbox();
        Assert.assertNotEquals(excelReader.getStringData("CheckBox",1,2), checkBoxPage.getTextSuccessMessage());
    }
    @Test
    public void userCanCollapseCheckboxTree(){
        sidebarPage.clickCheckBox();
        visibilityWait(checkBoxPage.expandAllElements());
        int beforeNum = checkBoxPage.allCheckBoxes().size();
        checkBoxPage.expandAllFolders();
        int afterNum = checkBoxPage.allCheckBoxes().size();
        Assert.assertNotEquals(beforeNum,afterNum);
        scroll(checkBoxPage.collapseAllElements());
        checkBoxPage.collapseAllFolders();
        int afterNum1 = checkBoxPage.allCheckBoxes().size();
        Assert.assertEquals(beforeNum,afterNum1);
    }

}
