/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import modelo.NotaDeEmpenho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grego
 */
public class NotaDeEmpenhoJpaDAO {
     private Connection connection;

    public boolean inserir( NotaDeEmpenho notaDeEmpenho){
        String sql = "INSERT INTO NotaDeEmpenho (num_nota,"
                + " data_nota, fornecedor_cnpj,"
                + " usuario_email ) VALUES(?, ?, ?, ?)";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
           
            stmt.setInt(1, notaDeEmpenho.getNum_nota());
            stmt.setString(2, notaDeEmpenho.getData());
            stmt.setString(3, notaDeEmpenho.getFornecedor_cnpj());
            stmt.setString(4, notaDeEmpenho.getUsuario_email());
            stmt.execute();
            
        }catch(SQLException ex){
            Logger.getLogger(NotaDeEmpenhoJpaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
          return true;
        
    }
  
    public boolean remover(String num_nota){
        String sql = "DELETE FROM NotaDeEmpenho WHERE num_nota = ?" + 
                "ON CASCADE";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
           
            stmt.setString(1, num_nota);
            stmt.execute();
           
        
        }catch(SQLException ex){
            Logger.getLogger(ItensNotaDeEmpenhoJpaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
        
        return true;
    }
}
