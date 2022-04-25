
package connection;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

public class ConnectionFactory {
        
    public Connection ConnectionBD(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sys_estoque?user=root&password=";
            conn = DriverManager.getConnection(url);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}