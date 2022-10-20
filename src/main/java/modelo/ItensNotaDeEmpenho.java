/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author grego
 */
public class ItensNotaDeEmpenho {
   
    private int idProduto;
    private int quantidade;
    private String num_nota;
   

    public ItensNotaDeEmpenho(int idProduto, int quantidade, String num_nota, float valor_produto) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.num_nota = num_nota;
        
    }

    public ItensNotaDeEmpenho(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNum_nota() {
        return num_nota;
    }

    public void setNum_nota(String num_nota) {
        this.num_nota = num_nota;
    }

   

    @Override
    public String toString() {
        return "ItensNotaDeEmpenho{" + "idProduto=" + idProduto + ", quantidade=" 
        + quantidade + ", num_nota=" + num_nota + '}';
    }
 
}
