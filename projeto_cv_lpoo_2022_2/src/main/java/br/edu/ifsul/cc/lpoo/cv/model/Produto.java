/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author 20211pf.cc0009
 */
@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_produto", strategy = GenerationType.SEQUENCE) 
    private Integer id;
    
    @Column(nullable = true, length = 200)
    private String nome;
    
    @Column(nullable = true, length = 200)
    private Float valor;
    
    @Column(nullable = true, length = 200)
    private Float quant;
   
     @ManyToOne
    @JoinColumn(name = "fornecedor_cnpj", nullable = false)
    private Fornecedor fornecedor;
     
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
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
