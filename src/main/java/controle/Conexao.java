package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    Connection conn = null;

    public Connection ConexaoDAO() {
        try {
            String url = "jdbc:sqlite:REFEITORIO.db";
            conn = DriverManager.getConnection(url);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão do BD: " + sqle.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}
