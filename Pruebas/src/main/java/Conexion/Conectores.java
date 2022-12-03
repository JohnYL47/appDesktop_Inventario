

package Conexion;

import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngineResult;
import javax.swing.JOptionPane;
/**
 *
 * @author JAMES
 */
public class Conectores {
    public static final String URL = "jdbc:mysql://localhost:3306/prueba_registro";
    public static final String USER = "root";
    public static final String CLAVE = "";

    public Connection getConexion() {
        Connection con = null;
        try {
            JOptionPane.showMessageDialog(null, "Loading..." ,"Estableciendo conexion a la BD",JOptionPane.WARNING_MESSAGE);
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            JOptionPane.showMessageDialog(null, "Conexion exitosa", "EXITO",JOptionPane.CLOSED_OPTION);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException x) {
            Logger.getLogger(Conectores.class.getName()).log(Level.SEVERE, null, x);
        }
        return con;
    }
    public void desconectar(){
        try {
            getConexion().close();
        } catch (SQLException ex) {
            Logger.getLogger(Conectores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Se Desconecto la Bd Correctamente", "Desconectado",JOptionPane.CLOSED_OPTION);
        }
    }
}
