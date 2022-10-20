/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author grego
 */
public class NotaDeEmpenho {
    private int num_nota;
    private String data;
    private String fornecedor_cnpj;
    private String usuario_email;

    public NotaDeEmpenho(int num_nota, String data, String fornecedor_cnpj,
    String usuario_email, float valor_total) {
        this.num_nota = num_nota;
        this.data = data;
        this.fornecedor_cnpj = fornecedor_cnpj;
        this.usuario_email = usuario_email;
     
    }

    public NotaDeEmpenho() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public NotaDeEmpenho(String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }
 
    public int getNum_nota() {
        return num_nota;
    }

    public void setNum_nota(int num_nota) {
        this.num_nota = num_nota;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFornecedor_cnpj() {
        return fornecedor_cnpj;
    }

    public void setFornecedor_cnpj(String fornecedor_cnpj) {
        this.fornecedor_cnpj = fornecedor_cnpj;
    }

    

    @Override
    public String toString() {
        return "NotaDeEmpenho{" + "num_nota=" + num_nota + ", data=" + data + ", fornecedor_cnpj=" + fornecedor_cnpj + ", usuario_email=" + usuario_email + ", valor_total=" + '}';
    }
   
}
