package view;

import model.Aluno;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nomeAluno = entrada.next() + entrada.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        aluno.matricula = entrada.next() + entrada.nextLine();

        System.out.println("Digite o nota do aluno: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite o nota do aluno: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite o nota do aluno: ");
        double nota3 = entrada.nextDouble();

        double media = aluno.calcularMedia(nota1, nota2, nota3);

        System.out.println("Mostrando informações : ");
        System.out.println("Nome: " + aluno.nomeAluno);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Média do aluno: " + aluno.nomeAluno + " é " +media);

    }
}
