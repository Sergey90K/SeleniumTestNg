import com.codoid.products.exception.FilloException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends TestBase{
    public MainPage() {
        PageFactory.initElements(driver, this);
    }
    ReaderFromExcel reader = new ReaderFromExcel();
    TakeScreenshot takeScreenshot =new TakeScreenshot();

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[1]/a")
    WebElement homePageXpas;
    String homePageUrl = "https://www.redmine.org/";

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[2]/a")
    WebElement progectRefXpas;
    String progectRefUrl = "https://www.redmine.org/projects";

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[3]/a")
    WebElement helpRefXpas;
    String helpRefUrl = "https://www.redmine.org/guide";

    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[1]/a")
    WebElement enterRefXpas;
    String enterRefUrl = "https://www.redmine.org/login";

    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[2]/a")
    WebElement regidtrationsRefXpas;
    String regidtrationsRefUrl = "https://www.redmine.org/account/register";

    @FindBy(xpath = "//*[@id=\"quick-search\"]/form/label/a")
    WebElement searchRefXpas;
    String searchRefUrl = "https://www.redmine.org/search";

    public void clickHomePage(){
        homePageXpas.click();
    }
    public void clickProgect(){
        progectRefXpas.click();
    }
    public void clickHelp() {
        helpRefXpas.click();
    }
    public void clickEnter(){
        enterRefXpas.click();
    }
    public void clickRegidtrations(){
        regidtrationsRefXpas.click();
    }
    public void clickSearch(){
        searchRefXpas.click();
    }

    public void goBack(){
        driver.navigate().back();
    }

    @FindBy(xpath = "//*[@id=\"user_login\"]")
    WebElement userField;

    @FindBy(xpath = "//*[@id=\"user_password\"]")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"user_password_confirmation\"]")
    WebElement secondPasswordField;

    @FindBy(xpath = "//*[@id=\"user_firstname\"]")
    WebElement nameField;

    @FindBy(xpath = "//*[@id=\"user_lastname\"]")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"user_mail\"]")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"user_custom_field_values_3\"]")
    WebElement ircNickField;

        String dataForWriter = "";

    public void setTextUserField(int lineNumber)  {

        try {
            String str=  reader.readData(1 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            userField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (InterruptedException | FilloException e) {
            e.printStackTrace();
        }
    }

    public void setTextPasswordField(int lineNumber){
        try {
            String str=  reader.readData(2 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            passwordField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (FilloException | InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void setTextSecondPasswordField(int lineNumber){
        try {
            String str=  reader.readData(3 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            secondPasswordField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (FilloException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setTextNameField(int lineNumber){
        try {
            String str=  reader.readData(4 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            nameField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (FilloException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setTextLastNameField(int lineNumber){
        try {
            String str=  reader.readData(5 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            lastNameField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (FilloException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setTextEmailField(int lineNumber){
        try {
            String str=  reader.readData(6 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            emailField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (FilloException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setTextIrcNickField(int lineNumber){
        try {
            String str=  reader.readData(7 -1,lineNumber -1);
            dataForWriter = "'" +  str + "',";
            ircNickField.sendKeys(str);
            okButton.click();
            Thread.sleep(1000);
        } catch (FilloException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//*[@id=\"new_user\"]/input")
    WebElement okButton;

    @FindBy(xpath = "//*[@id=\"errorExplanation\"]")
    WebElement errorField;

    public boolean errorMessageIsDisplayed(){
        return errorField.isDisplayed();
    }

    public void makeScreenshot(){
        takeScreenshot.screenshot(driver);
    }

    private void writeDataInExcel(String str){
        if (errorMessageIsDisplayed()){
            reader.createDataInSheets(str,dataForWriter + "'"+ "notification displayed" + "'");
        }else{
            reader.createDataInSheets("User","the notification was not displayed");
        }
    }

    public void userWriteDataInExcel(){
        writeDataInExcel("User");
    }

    public void passwordWriteDataInExcel() {
        writeDataInExcel("Password");
    }

    public void confirmPasswordWriteDataInExcel() {
        writeDataInExcel("Confirm Password");
    }

    public void nameWriteDataInExcel() {
        writeDataInExcel("Name");
    }

    public void lastNameWriteDataInExcel() {
        writeDataInExcel("LastName");
    }

    public void emailWriteDataInExcel() {
        writeDataInExcel("Email");
    }

    public void ircNickWriteDataInExcel() {
        writeDataInExcel("IRC nick");
    }

    public String[][] readDataFromExcel(){
        String [][] ollData = new String[7][6];
        try {
            ollData = reader.readDataFromExcel();
        } catch (FilloException e) {
            e.printStackTrace();
        }
        return ollData;
    }

    public void setTextUserField(String [] data )  {
        try {
            userField.sendKeys(data[0]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextPasswordField(String [] data ){
        try {
            passwordField.sendKeys(data[1]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextSecondPasswordField(String [] data ){
        try {
            secondPasswordField.sendKeys(data[2]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextNameField(String [] data ){
        try {nameField.sendKeys(data[3]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextLastNameField(String [] data){
        try {
            lastNameField.sendKeys(data[4]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextEmailField(String [] data ){
        try {
            emailField.sendKeys(data[5]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextIrcNickField(String [] data ){
        try {
            ircNickField.sendKeys(data[6]);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOK(){
        okButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addAllDataInFields(String  [] data){
        this.setTextUserField(data);
        this.setTextPasswordField(data);
        this.setTextSecondPasswordField(data);
        this.setTextNameField(data);
        this.setTextLastNameField(data);
        this.setTextEmailField(data);
        this.setTextIrcNickField(data);
        this.clickOK();
    }

}
