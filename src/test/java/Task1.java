import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 extends MainPage {

    MainPage mainPage;
    @BeforeMethod
    public void setUp(){
        initialization("https://www.redmine.org/account/register");
        mainPage = new MainPage();
    }

    @Test
    public void verificationsHomePageRef(){
        mainPage.clickHomePage();
        Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);
        mainPage.goBack();
    }

    @Test
    public void verificationsProgectRef(){
        mainPage.clickProgect();
        Assert.assertEquals(driver.getCurrentUrl(), progectRefUrl);
        mainPage.goBack();
    }

    @Test
    public void verificationsHelpRef(){
        mainPage.clickHelp();
        Assert.assertEquals(driver.getCurrentUrl(),helpRefUrl);
        mainPage.goBack();
    }

    @Test
    public void verificationsEnterRef(){
        mainPage.clickEnter();
        Assert.assertEquals(driver.getCurrentUrl(),enterRefUrl);
        mainPage.goBack();
    }

    @Test
    public void verificationsRegidtrationsRef(){
        mainPage.clickRegidtrations();
        Assert.assertEquals(driver.getCurrentUrl(),regidtrationsRefUrl );
        mainPage.goBack();
    }

    @Test
    public void verificationsSearchRef(){
        mainPage.clickSearch();
        Assert.assertEquals(driver.getCurrentUrl(), searchRefUrl);
        mainPage.goBack();
    }

    @AfterMethod
    public void setDown(){
        driver.close();
    }
}
