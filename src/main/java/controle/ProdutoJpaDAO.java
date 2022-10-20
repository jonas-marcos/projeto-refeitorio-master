/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Produto;
/**
 *
 * @author Administrator
 */
public class ProdutoJpaDAO {
    Produto mod = new Produto();
    Conexao conexao = new Conexao();
    String nomeFornecedor;
    public void inserirProduto(Produto mod){
        
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into produto(nomeProduto, precoProduto, unidadeProduto)" + "values (?, ?, ?)");
            pst.setString(1, mod.getNomeProduto());
            pst.setFloat(2, mod.getPrecoProduto());
            pst.setInt(3, mod.getUnidadeProduto());
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o produto!\nERRO: " + ex);
        }
    }
    public void editaProduto(Produto mod){
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("update from set nomeProduto=?, precoProduto=?,unidadeProduto=? where idProduto=?");
            pst.setString(1, mod.getNomeProduto());
            pst.setFloat(2, mod.getPrecoProduto());
            pst.setInt(3, mod.getUnidadeProduto());
            pst.setInt(4, mod.getIdProduto());
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o produto!\nERRO: " + ex);
        }
    }
    
    public void excluirProduto(Produto mod){
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("delete from produto where idProduto=?");
            pst.setInt(1, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto!\nERRO: " + ex);        }
    }
    
    public Produto buscaProduto(Produto modelo){
        conexao.conexao();
        conexao.executaSQL("select * from produto where nomeProduto like '%" + modelo.getPesquisa() + "%'");
        try{
            conexao.rs.first();
            mod.setIdProduto(conexao.rs.getInt("idProduto"));
            mod.setPrecoProduto(conexao.rs.getFloat("precoProduto"));
            mod.setUnidadeProduto(conexao.rs.getInt("unidadeProduto"));
            mod.setFornecedorProduto(nomeFornecedor);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto!\nERRO: " + ex);
        }
        return mod;
        
    }
}
