
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexaoBanco {
    final private String url = "jdbc:mysql://localhost/caixamercado";
    final private String usuario = "root";
    final private String senha = "";
    
    public Connection pegarConexao(){
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados"+e);
        }
        return null;
    }
}
