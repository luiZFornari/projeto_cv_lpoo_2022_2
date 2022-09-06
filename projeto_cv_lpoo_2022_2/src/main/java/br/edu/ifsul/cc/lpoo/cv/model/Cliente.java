/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20211pf.cc0009
 */
@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa implements Serializable{
    
    @Id
    @OneToMany
    @JoinColumn(name = "cliente_pessoa_cpf", nullable = false)
    private Pessoa pessoa;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_ult_visita;
    
    
    @ManyToMany(mappedBy = "pet_id")
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

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
