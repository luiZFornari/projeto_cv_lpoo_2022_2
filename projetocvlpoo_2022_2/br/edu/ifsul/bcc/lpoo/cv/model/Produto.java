/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocvlpoo_2022_2.br.edu.ifsul.bcc.lpoo.cv.model;

/**
 *
 * @author 20211pf.cc0009
 */
public class Produto {
    private Integer id;
    private String nome;
    private Float valor;
    private Float quant;
    private Fornecedor fornecedor;
    private TipoProduto tipopdt;
    
     public Produto(){
     
     }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the quant
     */
    public Float getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(Float quant) {
        this.quant = quant;
    }

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the tipopdt
     */
    public TipoProduto getTipopdt() {
        return tipopdt;
    }

    /**
     * @param tipopdt the tipopdt to set
     */
    public void setTipopdt(TipoProduto tipopdt) {
        this.tipopdt = tipopdt;
    }
            
    
}
