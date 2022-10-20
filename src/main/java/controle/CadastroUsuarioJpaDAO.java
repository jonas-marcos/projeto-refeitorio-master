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
import modelo.CadastroUsuario;


/**
 *
 * @author Jonas Marcos
 */
public class CadastroUsuarioJpaDAO {
    
    private Connection connection;

    public boolean inserir( CadastroUsuario cadastroUsuario){
        String sql = "INSERT INTO CadastroUsuario (email,"
                + " nome, telefone,"
                + " senha ) VALUES(?, ?, ?, ?)";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
           
            stmt.setString(1, cadastroUsuario.getEmail());
            stmt.setString(2, cadastroUsuario.getNome());
            stmt.setString(3, cadastroUsuario.getTelefone());
            stmt.setString(4, cadastroUsuario.getSenha());
            stmt.execute();
            
        }catch(SQLException ex){
            Logger.getLogger(CadastroUsuarioJpaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
          return true;
        
    }
    
}
