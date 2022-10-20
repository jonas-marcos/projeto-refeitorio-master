package controle;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioJpaDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public ResultSet usuarioAutenticacao(Usuario usuario) {
        try {
            conn = new Conexao().ConexaoDAO();
            String sql = "SELECT Email, Senha FROM USUARIO WHERE Email = ? AND Senha = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro do BD: " + sqle.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
