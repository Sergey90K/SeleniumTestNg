import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReaderFromExcel {

    private String user = "User";
    private String password = "Password";
    private String confirmPassword = "Confirm Password";
    private String name = "Name";
    private String lastName = "LastName";
    private String email = "Email";
    private String ircNick = "IRC nick";


    public String readData(int columnNumber,int lineNumber) throws FilloException {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("InputData.xlsx");
        String strQuery="Select * from UserData";
        Recordset recordset=connection.executeQuery(strQuery);
        int i = 0;
        String [][] ollDataFromSheet = new String[7][recordset.getCount()];
        while (recordset.next()) {
            ollDataFromSheet [0][i]   = recordset.getField(user);
            ollDataFromSheet [1][i]  = recordset.getField(password);
            ollDataFromSheet [2][i]  = recordset.getField(confirmPassword);
            ollDataFromSheet [3][i]  = recordset.getField(name);
            ollDataFromSheet [4][i]  = recordset.getField(lastName);
            ollDataFromSheet [5][i]  = recordset.getField(email);
            ollDataFromSheet [6][i]  = recordset.getField(ircNick);
            i++;
        }
        recordset.close();
        connection.close();
        String data = ollDataFromSheet[columnNumber][lineNumber];
        return data;
    }

    private void createSheets(){
        String filePath = "OutputData.xlsx";
        try {
            Fillo fillo = new Fillo();
            Connection connection = fillo.getConnection(filePath);
            connection.createTable("Sheet1", new String[]{"User", "Password", "Confirm Password", "Name", "LastName", "Email", "IRC nick", "Result"});
            connection.close();
        } catch (FilloException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createDataInSheets(String nameField, String innerStr) {
        this.createSheets();
        //String query = "INSERT INTO \"Sheet4\"(\"User\", \"Password\", \"ConfirmPass\", \"Name\",\"LastName\",\"Email\", \"IRC nick\",\"Result\" ) VALUES('user','pass','conf pass', 'name', 'last name', 'email', 'Irc nick', 'rezalt')";
        String query = "INSERT INTO \"Sheet1\"(\""+ nameField + "\",\"Result\" ) VALUES(" + innerStr + ")";
        String filePath = "OutputData.xlsx";
        try {
            Fillo fillo = new Fillo();
            Connection connection = fillo.getConnection(filePath);
            connection.executeUpdate(query);
            connection.close();
        } catch (FilloException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[][] readDataFromExcel() throws FilloException {
        Fillo fillo=new Fillo();
       // this.createSheets();
        Connection connection=fillo.getConnection("InputData.xlsx");
        String strQuery="Select * from UserData";
        Recordset recordset=connection.executeQuery(strQuery);
        int i = 0;
        String [][] ollDataFromSheet = new String[7][recordset.getCount()];
        while (recordset.next()) {
            ollDataFromSheet [0][i]   = recordset.getField(user);
            ollDataFromSheet [1][i]  = recordset.getField(password);
            ollDataFromSheet [2][i]  = recordset.getField(confirmPassword);
            ollDataFromSheet [3][i]  = recordset.getField(name);
            ollDataFromSheet [4][i]  = recordset.getField(lastName);
            ollDataFromSheet [5][i]  = recordset.getField(email);
            ollDataFromSheet [6][i]  = recordset.getField(ircNick);
            i++;
        }
        recordset.close();
        connection.close();
        return ollDataFromSheet;
    }
}
