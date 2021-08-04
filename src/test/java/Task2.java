import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 extends MainPage{

    MainPage mainPage;
    @BeforeMethod
    public void setUp(){
        initialization("https://www.redmine.org/account/register");
        mainPage = new MainPage();
    }

    @Test
    public void testUserFieldFirstColonFromTable()  {
        mainPage.setTextUserField(1);
        mainPage.userWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testUserFieldSecondColonFromTable()  {
        mainPage.setTextUserField(2);
        mainPage.userWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testUserFieldThirdColonFromTable()  {
        mainPage.setTextUserField(3);
        mainPage.userWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testUserFieldFourthColonFromTable()  {
        mainPage.setTextUserField(4);
        mainPage.userWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testUserFieldFifthColonFromTable()  {
        mainPage.setTextUserField(5);
        mainPage.userWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testUserFieldSixthColonFromTable()  {
        mainPage.setTextUserField(6);
        mainPage.userWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testPasswordFieldFirstColonFromTable()  {
        mainPage.setTextPasswordField(1);
        mainPage.passwordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testPasswordFieldSecondColonFromTable()  {
        mainPage.setTextPasswordField(2);
        mainPage.passwordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testPasswordFieldThirdColonFromTable()  {
        mainPage.setTextPasswordField(3);
        mainPage.passwordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testPasswordFieldFourthColonFromTable()  {
        mainPage.setTextPasswordField(4);
        mainPage.passwordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testPasswordFieldFifthColonFromTable()  {
        mainPage.setTextPasswordField(5);
        mainPage.passwordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testPasswordFieldSixthColonFromTable()  {
        mainPage.setTextPasswordField(6);
        mainPage.passwordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testConfirmPasswordFieldFirstColonFromTable(){
        mainPage.setTextSecondPasswordField(1);
        mainPage.confirmPasswordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(), true);
        makeScreenshot();
    }

    @Test
    public void testConfirmPasswordFieldSecondColonFromTable(){
        mainPage.setTextSecondPasswordField(2);
        mainPage.confirmPasswordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(), true);
        makeScreenshot();
    }

    @Test
    public void testConfirmPasswordFieldThirdColonFromTable(){
        mainPage.setTextSecondPasswordField(3);
        mainPage.confirmPasswordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(), true);
        makeScreenshot();
    }

    @Test
    public void testConfirmPasswordFieldFourthColonFromTable(){
        mainPage.setTextSecondPasswordField(4);
        mainPage.confirmPasswordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(), true);
        makeScreenshot();
    }

    @Test
    public void testConfirmPasswordFieldFifthColonFromTable(){
        mainPage.setTextSecondPasswordField(5);
        mainPage.confirmPasswordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(), true);
        makeScreenshot();
    }

    @Test
    public void testConfirmPasswordFieldSixthColonFromTable(){
        mainPage.setTextSecondPasswordField(6);
        mainPage.confirmPasswordWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(), true);
        makeScreenshot();
    }

    @Test
    public void testNameFieldFirstColonFromTable()  {
        mainPage.setTextNameField(1);
        mainPage.nameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testNameFieldSecondColonFromTable()  {
        mainPage.setTextNameField(2);
        mainPage.nameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testNameFieldThirdColonFromTable()  {
        mainPage.setTextNameField(3);
        mainPage.nameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testNameFieldFourthColonFromTable()  {
        mainPage.setTextNameField(4);
        mainPage.nameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testNameFieldFifthColonFromTable()  {
        mainPage.setTextNameField(5);
        mainPage.nameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testNameFieldSixthColonFromTable()  {
        mainPage.setTextNameField(6);
        mainPage.nameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testLastNameFieldFirstColonFromTable()  {
        mainPage.setTextLastNameField(1);
        mainPage.lastNameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testLastNameFieldSecondColonFromTable()  {
        mainPage.setTextLastNameField(2);
        mainPage.lastNameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testLastNameFieldThirdColonFromTable()  {
        mainPage.setTextLastNameField(3);
        mainPage.lastNameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testLastNameFieldFourthColonFromTable()  {
        mainPage.setTextLastNameField(4);
        mainPage.lastNameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testLastNameFieldFifthColonFromTable()  {
        mainPage.setTextLastNameField(5);
        mainPage.lastNameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testLastNameFieldSixthColonFromTable()  {
        mainPage.setTextLastNameField(6);
        mainPage.lastNameWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testEmailFieldFirstColonFromTable()  {
        mainPage.setTextEmailField(1);
        mainPage.emailWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testEmailFieldSecondColonFromTable()  {
        mainPage.setTextEmailField(2);
        mainPage.emailWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testEmailFieldThirdColonFromTable()  {
        mainPage.setTextEmailField(3);
        mainPage.emailWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testEmailFieldFourthColonFromTable()  {
        mainPage.setTextEmailField(4);
        mainPage.emailWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testEmailFieldFifthColonFromTable()  {
        mainPage.setTextEmailField(5);
        mainPage.emailWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testEmailFieldSixthColonFromTable()  {
        mainPage.setTextEmailField(6);
        mainPage.emailWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testIrcNikFieldFirstColonFromTable()  {
        mainPage.setTextIrcNickField(1);
        mainPage.ircNickWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testIrcNikFieldSecondColonFromTable()  {
        mainPage.setTextIrcNickField(2);
        mainPage.ircNickWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testIrcNikFieldThirdColonFromTable()  {
        mainPage.setTextIrcNickField(3);
        mainPage.ircNickWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testIrcNikFieldFourthColonFromTable()  {
        mainPage.setTextIrcNickField(4);
        mainPage.ircNickWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testIrcNikFieldFifthColonFromTable()  {
        mainPage.setTextIrcNickField(5);
        mainPage.ircNickWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }

    @Test
    public void testIrcNicFieldSixthColonFromTable()  {
        mainPage.setTextIrcNickField(6);
        mainPage.ircNickWriteDataInExcel();
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        makeScreenshot();
    }


    @AfterMethod
    public void setDown(){
        driver.close();
    }

}
