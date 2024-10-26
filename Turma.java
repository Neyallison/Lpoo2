/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author Ney Allison
 */
import java.util.ArrayList;

public class Turma {
    private String identificacao;
    private int semestre;
    private Curso curso;
    private Professor professor;
    private ArrayList<Estudante> estudantes;

    public Turma(String identificacao, int semestre, Curso curso, Professor professor) {
        this.identificacao = identificacao;
        this.semestre = semestre;
        this.curso = curso;
        this.professor = professor;
        this.estudantes = new ArrayList<>();
    }

   
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

   
    public void exibirDados() {
        System.out.println("Turma: " + identificacao + " - Semestre: " + semestre);
        professor.exibirDados();
        for (Estudante estudante : estudantes) {
            estudante.exibirDados();
        }
    }
}
