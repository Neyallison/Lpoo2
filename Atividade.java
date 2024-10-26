/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author Ney Allison
 */
public class Atividade {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Ciência da Computação", 8);
        Curso curso2 = new Curso("Engenharia de Software", 10);

        
        Professor prof1 = new Professor("Luis Araújo", "000.000.00-0", "Rua X, Bairro U", "987662577", 12345, curso1.getNome());
        Professor prof2 = new Professor("Maria Silva", "111.111.11-1", "Rua Y, Bairro V", "999662588", 12346, curso2.getNome());

        
        Estudante est1 = new Estudante("João Souza", "222.222.22-2", "Rua Z, Bairro W", "888662599", 20201, curso1.getNome());
        Estudante est2 = new Estudante("Ana Clara", "333.333.33-3", "Rua A, Bairro X", "777662600", 20202, curso1.getNome());
        Estudante est3 = new Estudante("Carlos Alberto", "444.444.44-4", "Rua B, Bairro Y", "666662611", 20203, curso2.getNome());
        Estudante est4 = new Estudante("Fernanda Lima", "555.555.55-5", "Rua C, Bairro Z", "555662622", 20204, curso2.getNome());
        Estudante est5 = new Estudante("Gabriel Santos", "666.666.66-6", "Rua D, Bairro A", "444662633", 20205, curso1.getNome());

        // Criar Turmas (mínimo 2)
        Turma turma1 = new Turma("Turma A", 1, curso1, prof1);
        Turma turma2 = new Turma("Turma B", 1, curso2, prof2);

        
        turma1.adicionarEstudante(est1);
        turma1.adicionarEstudante(est2);
        turma1.adicionarEstudante(est5);

        turma2.adicionarEstudante(est3);
        turma2.adicionarEstudante(est4);

      
        System.out.println("Dados da Turma 1:");
        turma1.exibirDados();

        System.out.println("\nDados da Turma 2:");
        turma2.exibirDados();
    }
}
