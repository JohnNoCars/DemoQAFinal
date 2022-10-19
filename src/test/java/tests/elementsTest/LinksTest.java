package tests.elementsTest;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    @BeforeMethod
    public void configure(){
        webDriver.manage().window().maximize();
        webDriver.get(homeURL);
        homePage.clickElements();
        sidebarPage.clickLinks();

    }

    @Test
    public void userCanOpenHomepageInNewTab(){
        scrollIntoView(linksPage.getHomeLink());
        linksPage.clickHomeLink();
        Assert.assertEquals(excelReader.getStringData("Links",1,0),webDriver.getTitle());
    }

    @Test
    public void userCanOpenDynamicLink(){
        scrollIntoView(linksPage.getHomeDynamicLink());
        linksPage.clickDynamicLink();
        Assert.assertEquals(excelReader.getStringData("Links",1,0),webDriver.getTitle());
    }

    @Test
    public void userCanClickCreatedLink(){
        scrollIntoView(linksPage.getCreatedLink());
        linksPage.clickCreatedLink();
        Assert.assertEquals(excelReader.getStringData("Links",2,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickNoContentLink(){
        scrollIntoView(linksPage.getNoContentLink());
        linksPage.clickNoContentLink();
        Assert.assertEquals(excelReader.getStringData("Links",3,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickMovedLink(){
        scrollIntoView(linksPage.getMovedLink());
        linksPage.clickMovedLink();
        Assert.assertEquals(excelReader.getStringData("Links",4,0),linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickBadRequestLink(){
        scrollIntoView(linksPage.getBadRequestLink());
        linksPage.clickBadRequestLink();
        Assert.assertEquals(excelReader.getStringData("Links",5,0 ), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickUnauthorizedLink(){
        scrollIntoView(linksPage.getUnauthorizedLink());
        linksPage.clickUnauthorizedLink();
        Assert.assertEquals(excelReader.getStringData("Links",6,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickForbiddenLink(){
        scrollIntoView(linksPage.getForbiddenLink());
        linksPage.clickForbiddenLink();
        Assert.assertEquals(excelReader.getStringData("Links",7,0), linksPage.getLinkResponse());
    }
    @Test
    public void userCanClickNotFoundLink(){
        scrollIntoView(linksPage.getNotFoundLink());
        linksPage.clickNotFoundLink();
        Assert.assertEquals(excelReader.getStringData("Links", 8,0), linksPage.getLinkResponse());
    }
}
