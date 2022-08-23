/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projetocvlpoo_2022_2.br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20211pf.cc0009
 */
public class Venda {
    private Integer id;
    private String obs;
    private Float valot_total;
    private Calendar data;
    private Pagamento pgto;
    private Cliente cliente;
    private Funcionario func;
    private List<Consulta> consulta;
    private List<Produto> produto;
    
     public Venda(){
         
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
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the valot_total
     */
    public Float getValot_total() {
        return valot_total;
    }

    /**
     * @param valot_total the valot_total to set
     */
    public void setValot_total(Float valot_total) {
        this.valot_total = valot_total;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the pgto
     */
    public Pagamento getPgto() {
        return pgto;
    }

    /**
     * @param pgto the pgto to set
     */
    public void setPgto(Pagamento pgto) {
        this.pgto = pgto;
    }

    /**
     * @return the consulta
     */
    public List<Consulta> getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(List<Consulta> consulta) {
        this.consulta = consulta;
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

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the func
     */
    public Funcionario getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(Funcionario func) {
        this.func = func;
    }
     
     
    
}
