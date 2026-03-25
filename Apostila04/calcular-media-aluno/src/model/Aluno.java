package model;

public class Aluno {

    public String nomeAluno;
    public String matricula;


    public double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}
