/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocvlpoo_2022_2.br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20211pf.cc0009
 */
public class Cliente extends Pessoa{
    private Calendar data_ult_visita;
    private List<Pet> pet;
    
     public Cliente(){
     
     }

    /**
     * @return the data_ult_visita
     */
    public Calendar getData_ult_visita() {
        return data_ult_visita;
    }

    /**
     * @param data_ult_visita the data_ult_visita to set
     */
    public void setData_ult_visita(Calendar data_ult_visita) {
        this.data_ult_visita = data_ult_visita;
    }

    /**
     * @return the pet
     */
    public List<Pet> getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }
    
}
