package tests;

import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickLinks();

    }

    @Test
    public void userCanOpenHomepageInNewTab(){
        scroll(linksPage.listOfLinks().get(0));
        linksPage.clickHomeLink();
        //webDriver.switchTo().window("https://demoqa.com/").close();
    }
}
