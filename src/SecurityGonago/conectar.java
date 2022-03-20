package SecurityGonago;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class conectar {

    Connection conectar = null;

    public Connection bitacora() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//.newInstance();
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/bitacora", "root", "gordo1414");
            //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion" + ex);
        }
        return conectar;
    }

}
