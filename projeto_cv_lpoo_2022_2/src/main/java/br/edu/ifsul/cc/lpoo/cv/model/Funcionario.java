/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

/**
 *
 * @author 20211pf.cc0009
 */
public class Funcionario extends Pessoa{
    private String ctps;
    private String pts;
    private Cargo cargo;
    
     public Funcionario(){
     
     }

    /**
     * @return the ctps
     */
    public String getCtps() {
        return ctps;
    }

    /**
     * @param ctps the ctps to set
     */
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    /**
     * @return the pts
     */
    public String getPts() {
        return pts;
    }

    /**
     * @param pts the pts to set
     */
    public void setPts(String pts) {
        this.pts = pts;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
