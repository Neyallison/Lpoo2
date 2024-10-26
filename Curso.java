/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author Ney Allison
 */
public class Curso {
    private String nome;
    private int numSemestres;

    public Curso(String nome, int numSemestres) {
        this.nome = nome;
        this.numSemestres = numSemestres;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSemestres() {
        return numSemestres;
    }

    public void setNumSemestres(int numSemestres) {
        this.numSemestres = numSemestres;
    }
}
