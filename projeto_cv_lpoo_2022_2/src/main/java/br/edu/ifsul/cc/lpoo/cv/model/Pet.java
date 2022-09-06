/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20211pf.cc0009
 */
@Entity
@Table(name = "tb_pet")
public class Pet implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_pet", sequenceName = "seq_pet_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pet", strategy = GenerationType.SEQUENCE) 
    private Integer id;
    
    @Column(nullable = true, length = 200)
    private String nome;
     
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_nascimento;
    
     @Column(nullable = true, length = 200)
    private String Obs;
   
    @ManyToOne
    @JoinColumn(name = "funcionario_cpf", nullable = false)
    private Raca raca;
      
    @ManyToOne
    @JoinColumn(name = "cliente_cpf", nullable = false)
    private Cliente cliente;
    
    
    
     public Pet(){
     
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
     * @return the data_nascimento
     */
    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the Obs
     */
    public String getObs() {
        return Obs;
    }

    /**
     * @param Obs the Obs to set
     */
    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    /**
     * @return the raca
     */
    public Raca getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    /**
     * @return the func
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(Cliente clientes) {
        this.cliente = clientes;
    }
    
}
