/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

/**
 *
 * @author 20211pf.cc0009
 */
public class Medico extends Pessoa{
    private String crmv;
    
     public Medico(){
     
     }

    /**
     * @return the crmv
     */
    public String getCrmv() {
        return crmv;
    }

    /**
     * @param crmv the crmv to set
     */
    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
}
