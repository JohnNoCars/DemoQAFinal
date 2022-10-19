package tests.elementsTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();

    }

    @Test
    public void userCanSubmitValidData(){
        sidebarPage.clickTextBox();
        visibilityWait(textBoxPage.getFullName());

        String fullName = excelReader.getStringData("TextBox",1,0);
        String email = excelReader.getStringData("TextBox",1,1);
        String currentAddress = excelReader.getStringData("TextBox",1,2);
        String permanentAddress = excelReader.getStringData("TextBox",1,3);

        inputText(textBoxPage.getFullName(), fullName);
        inputText(textBoxPage.getEmail(), email);
        inputText(textBoxPage.getCurrentAddress(), currentAddress);
        inputText(textBoxPage.getPermanentAddress(), permanentAddress);
        textBoxPage.clickSubmit();

        String actualOutput = textBoxPage.getOutput();
        String expectedOutput = excelReader.getStringData("TextBox", 1, 4);
        Assert.assertTrue(textBoxPage.getOutputText().isDisplayed());
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void userCannotSubmitInvalidEmail(){
        sidebarPage.clickTextBox();
        visibilityWait(textBoxPage.getFullName());

        String fullName = excelReader.getStringData("TextBox",2,0);
        String email = excelReader.getStringData("TextBox",2,1);
        String currentAddress = excelReader.getStringData("TextBox",2,2);
        String permanentAddress = excelReader.getStringData("TextBox",2,3);

        inputText(textBoxPage.getFullName(), fullName);
        inputText(textBoxPage.getEmail(), email);
        inputText(textBoxPage.getCurrentAddress(), currentAddress);
        inputText(textBoxPage.getPermanentAddress(), permanentAddress);
        textBoxPage.clickSubmit();

        Assert.assertFalse(textBoxPage.getOutputText().isDisplayed());
    }
}
