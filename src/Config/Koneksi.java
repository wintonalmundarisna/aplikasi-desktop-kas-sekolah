package Config;

import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Koneksi {
        private static Connection conn;
    
    public static Connection getConnection(){
          if (conn==null) {
            try {
                String url = "jdbc:mysql://localhost:3306/aplikasi_sekolah";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url,user,pass);                
            } catch (Exception e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null, e);                
            }
        }
        return conn;
    }
}

