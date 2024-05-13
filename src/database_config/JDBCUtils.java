package database_config;

import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JDBCUtils {
     public static Connection getConnection() {
        Connection result = null;
        try {
            // Dang ky MySQL Driver voi DriverManager
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //Cac thong so
            String url = "jdbc:mySQL://localhost:3306/circle_k";
            String userName = "root";
            String password = "mysql";
            //Tao ket noi 
            result = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Khong the ket noi voi co so du lieu !", "Loi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void printInfo(Connection c){
        try{
            if(c!=null){
                java.sql.DatabaseMetaData metadata = c.getMetaData();
                System.out.printf(metadata.getDatabaseProductName());
                System.out.printf(metadata.getDatabaseProductVersion());
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
