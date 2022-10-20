/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */

@Entity
@Table(name = "Produto")
public class Produto {
    
    private String fornecedorProduto;
    private String pesquisa;
    
    @Id
    @Column(name="idProduto")
    private int idProduto;
    @Column(name="nomeProduto")
    private String nomeProduto;
    @Column(name="precoProduto")
    private float precoProduto;
    @Column(name="unidadeProduto")
    private int unidadeProduto;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the precoProduto
     */
    public float getPrecoProduto() {
        return precoProduto;
    }

    /**
     * @param precoProduto the precoProduto to set
     */
    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    /**
     * @return the unidadeProduto
     */
    public int getUnidadeProduto() {
        return unidadeProduto;
    }

    /**
     * @param unidadeProduto the unidadeProduto to set
     */
    public void setUnidadeProduto(int unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    /**
     * @return the fornecedorProduto
     */
    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    /**
     * @param fornecedorProduto the fornecedorProduto to set
     */
    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}
