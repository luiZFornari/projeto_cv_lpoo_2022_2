/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocvlpoo_2022_2.br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

/**
 *
 * @author 20211pf.cc0009
 */
public class Agenda {
    private Integer id;
    private Calendar data_fim;
    private Calendar data_inicio;
    private String obs;
    private Status status;
    private Medico medico;
    private TipoProduto tipoprod;
    private Funcionario func;
    
    
     public Agenda(){
     
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
     * @return the data_fim
     */
    public Calendar getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the data_inicio
     */
    public Calendar getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
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
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the tipoprod
     */
    public TipoProduto getTipoprod() {
        return tipoprod;
    }

    /**
     * @param tipoprod the tipoprod to set
     */
    public void setTipoprod(TipoProduto tipoprod) {
        this.tipoprod = tipoprod;
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
