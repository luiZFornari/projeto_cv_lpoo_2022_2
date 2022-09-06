/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;
import java.util.List;

/**
 *
 * @author 20211pf.cc0009
 */
public class Receita {
    private Integer id;
    private String orientacao;
    private List<Produto> produto;
    
    
     public Receita(){
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
     * @return the orientacao
     */
    public String getOrientacao() {
        return orientacao;
    }

    /**
     * @param orientacao the orientacao to set
     */
    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    /**
     * @return the produto
     */
    public List<Produto> getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
        

    
}
