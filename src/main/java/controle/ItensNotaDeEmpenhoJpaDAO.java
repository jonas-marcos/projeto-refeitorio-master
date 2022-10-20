/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import modelo.ItensNotaDeEmpenho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author grego
 */
public class ItensNotaDeEmpenhoJpaDAO {
    private Connection connection;

    public boolean inserir(ItensNotaDeEmpenho itensNotaDeEmpenho){
        String sql = "INSERT INTO ItensNotaDeEmpenho "
                + " (idProduto, quantidade, num_nota, valor_produto ) VALUES(?, ?, ?)";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
           
            stmt.setInt(1, itensNotaDeEmpenho.getIdProduto());
            stmt.setInt(2, itensNotaDeEmpenho.getQuantidade());
            stmt.setString(3, itensNotaDeEmpenho.getNum_nota());
            stmt.execute();
            
        }catch(SQLException ex){
            Logger.getLogger(ItensNotaDeEmpenhoJpaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }    
        return true;
    }
  
    public boolean remover(Integer id){
        String sql = "DELETE FROM ItensNotaDeEmpenho WHERE idProduto = ?";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
           
            stmt.setInt(1, id);
            stmt.execute();
           
        
        }catch(SQLException ex){
            Logger.getLogger(ItensNotaDeEmpenhoJpaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
        return true;
    }
}
