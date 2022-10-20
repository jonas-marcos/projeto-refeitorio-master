/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AlterarSenha;

/**
 *
 * @author Jonas Marcos
 */
public class AlterarSenhaJpaDAO {
    
    private Connection connection;
    
    public boolean alterar(AlterarSenha alterarSenha) {
        String sql = "UPDATE usuario SET , email=? senha=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, alterarSenha.getSenha());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlterarSenhaJpaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
