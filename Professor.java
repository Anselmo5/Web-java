/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

/**
 *
 * @author anselmo_reis
 */
public class Professor extends Pessoa {
    String msteria;
    String matProf; 
   public Professor(String msteria, String matProf, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.msteria = msteria;
        this.matProf = matProf;
    }

    public String getMsteria() {
        return msteria;
    }

    public void setMsteria(String msteria) {
        this.msteria = msteria;
    }

    public String getMatProf() {
        return matProf;
    }

    public void setMatProf(String matProf) {
        this.matProf = matProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
