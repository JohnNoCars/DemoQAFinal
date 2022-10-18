package tests.elementsTest;

import base.BasePage;

import org.testng.Assert;
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
        scroll(linksPage.homeLink());
        linksPage.clickHomeLink();
        Assert.assertEquals(excelReader.getStringData("Links",1,0),webDriver.getTitle());
    }

    @Test
    public void userCanOpenDynamicLink(){
        scroll(linksPage.homeDynamicLink());
        linksPage.clickDynamicLink();
        Assert.assertEquals(excelReader.getStringData("Links",1,0),webDriver.getTitle());
    }

    @Test
    public void userCanClickCreatedLink(){
        scroll(linksPage.createdLink());
        linksPage.clickCreatedLink();
        Assert.assertEquals(excelReader.getStringData("Links",2,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickNoContentLink(){
        scroll(linksPage.noContentLink());
        linksPage.clickNoContentLink();
        Assert.assertEquals(excelReader.getStringData("Links",3,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickMovedLink(){
        scroll(linksPage.movedLink());
        linksPage.clickMovedLink();
        Assert.assertEquals(excelReader.getStringData("Links",4,0),linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickBadRequestLink(){
        scroll(linksPage.badRequestLink());
        linksPage.clickBadRequestLink();
        Assert.assertEquals(excelReader.getStringData("Links",5,0 ), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickUnauthorizedLink(){
        scroll(linksPage.unauthorizedLink());
        linksPage.clickUnauthorizedLink();
        Assert.assertEquals(excelReader.getStringData("Links",6,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickForbiddenLink(){
        scroll(linksPage.forbiddenLink());
        linksPage.clickForbiddenLink();
        Assert.assertEquals(excelReader.getStringData("Links",7,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickNotFoundLink(){
        scroll(linksPage.notFoundLink());
        linksPage.clickNotFoundLink();
        Assert.assertEquals(excelReader.getStringData("Links", 8,0), linksPage.getLinkResponse());
    }
}
