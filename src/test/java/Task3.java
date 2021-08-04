import com.codoid.products.exception.FilloException;
import org.testng.Assert;
import org.testng.annotations.*;

public class Task3 extends MainPage {
    MainPage mainPage;
    ReaderFromExcel reader = new ReaderFromExcel();

    @BeforeMethod
    public void setUp(){
        initialization("https://www.redmine.org/account/register");
        mainPage = new MainPage();
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod( ) throws FilloException {
        String[] outerData1 = new String[7];
        String[] outerData2 = new String[7];
        String[] outerData3 = new String[7];
        String[] outerData4 = new String[7];
        String[] outerData5 = new String[7];
        String[] outerData6 = new String[7];

        String[][] data = reader.readDataFromExcel();
        for (int i = 0; i < 7; i++) {
            outerData1[i] = data[i][0];
        }
        for (int i = 0; i < 7; i++) {
            outerData2[i] = data[i][1];
        }
        for (int i = 0; i < 7; i++) {
            outerData3[i] = data[i][2];
        }
        for (int i = 0; i < 7; i++) {
            outerData4[i] = data[i][3];
        }
        for (int i = 0; i < 7; i++) {
            outerData5[i] = data[i][4];
        }
        for (int i = 0; i < 7; i++) {
            outerData6[i] = data[i][5];
        }
        return new Object[][]{{outerData1}, {outerData2}, {outerData3}, {outerData4}, {outerData5}, {outerData6}};
    }

    @Test(dataProvider = "data-provider")
    public void testAllField(String [] data){

        try {
            mainPage.setTextUserField(data);
            mainPage.setTextPasswordField(data);
            mainPage.setTextSecondPasswordField(data);
            mainPage.setTextNameField(data);
            mainPage.setTextLastNameField(data);
            mainPage.setTextEmailField(data);
            mainPage.setTextIrcNickField(data);
            mainPage.clickOK();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(mainPage.errorMessageIsDisplayed(),true);
        mainPage.makeScreenshot();

    }

    @AfterMethod
    public void setDown(){
        driver.close();
    }

}
