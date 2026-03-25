package view;

import model.Aluno;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nomeAluno = entrada.next() + entrada.nextLine();

        System.out.println();

    }
}
